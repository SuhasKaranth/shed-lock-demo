package com.scheduler.job;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sms_records")
public class SmsRecord {

    @Id
    private String id;
    private String alertId;
    private String smsContent;
    private Timestamp createdTime;
    private String status;
}
