package com.scheduler.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SmsRecordRepository extends JpaRepository<SmsRecord, String> {
    // Custom query methods can be added here if needed

    // Custom method to find SMS records by status
    List<SmsRecord> findByStatus(String status);
    // Custom method to find SMS records with null status
    List<SmsRecord> findByStatusIsNull();

    // Custom method to update the status of records with a specific status
    @Modifying
    @Query("UPDATE SmsRecord sr SET sr.status = :newStatus WHERE sr.status IS NULL")
    void updateStatusToProcessing(String newStatus);

    @Modifying
    @Transactional
    @Query("UPDATE SmsRecord sr SET sr.status = :newStatus WHERE sr.id IN :ids")
    void updateStatusToProcessing(List<String> ids, String newStatus);


    // Fetch the top 10 records with null status, ordered by created_time (or any other relevant field)
    @Query(value="SELECT * FROM sms_records sr WHERE sr.status IS NULL ORDER BY sr.created_time ASC LIMIT 10", nativeQuery = true)
    List<SmsRecord> findTop10ByStatusIsNull();

}