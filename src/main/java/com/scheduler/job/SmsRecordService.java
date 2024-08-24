package com.scheduler.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmsRecordService {

    @Autowired
    private SmsRecordRepository smsRecordRepository;

    public List<SmsRecord> getAllSmsRecords() {
        return smsRecordRepository.findAll();
    }

    public SmsRecord saveSmsRecord(SmsRecord smsRecord) {
        return smsRecordRepository.save(smsRecord);
    }
}
