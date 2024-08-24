package com.scheduler.job;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.core.LockAssert;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class MyScheduler {

    @Autowired
    private SmsRecordRepository smsRecordRepository;


    @Scheduled(fixedDelay = 5000)
    @SchedulerLock(name = "scheduledSMSFetch", lockAtMostFor = "5m", lockAtLeastFor = "4s")
    public void myJob() throws InterruptedException {
        LockAssert.assertLocked();

        // Fetch the top 10 records with null status
        List<SmsRecord> smsRecords = smsRecordRepository.findTop10ByStatusIsNull();

        // Process the records (logging for demo purposes)
        if (!smsRecords.isEmpty()) {
            smsRecords.forEach(record -> System.out.println("Fetched SMS Record with null status :" + record));
            // Extract IDs from the fetched records
            List<String> ids = smsRecords.stream()
                    .map(SmsRecord::getId)
                    .collect(Collectors.toList());


            // Update the status of these records to "Processing"
            smsRecordRepository.updateStatusToProcessing(ids, "Processing");

            // Log the update
            System.out.println("Updated status of " + ids.size() + " records to 'Processing'.");

            Thread.sleep(3000);

            smsRecordRepository.updateStatusToProcessing(ids, "Processed");

            // Log the update
            System.out.println("Updated status of " + ids.size() + " records to 'Processed'.");
        } else {
            System.out.println("No SMS records found with null status!");
        }
    }
}

