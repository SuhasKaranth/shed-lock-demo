CREATE TABLE shedlock (
                          name VARCHAR(64) NOT NULL,
                          lock_until TIMESTAMP(3) NOT NULL,
                          locked_at TIMESTAMP(3) NOT NULL DEFAULT CURRENT_TIMESTAMP(3),
                          locked_by VARCHAR(255) NOT NULL,
                          PRIMARY KEY (name)
);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('2', 'tets_alert_id', 'Test SMS content 2', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('3', 'tets_alert_id', 'Test SMS content 3', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('4', 'tets_alert_id', 'Test SMS content 4', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('5', 'tets_alert_id', 'Test SMS content 5', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('6', 'tets_alert_id', 'Test SMS content 6', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('7', 'tets_alert_id', 'Test SMS content 7', NOW(), null);
INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('8', 'tets_alert_id', 'Test SMS content 8', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('9', 'tets_alert_id', 'Test SMS content 9', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('10', 'tets_alert_id', 'Test SMS content 10', NOW(), null);

INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('11', 'tets_alert_id', 'Test SMS content 11', NOW(), null);
INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('12', 'tets_alert_id', 'Test SMS content 12', NOW(), null);
INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('13', 'tets_alert_id', 'Test SMS content 13', NOW(), null);
INSERT INTO public.sms_records
(id, alert_id, sms_content, created_time, status)
VALUES('14', 'tets_alert_id', 'Test SMS content 14', NOW(), null);