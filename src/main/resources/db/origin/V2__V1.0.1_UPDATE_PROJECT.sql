ALTER TABLE `auto_test`.`interface`
    ADD COLUMN `request_method` int(4) NOT NULL COMMENT '请求方式' AFTER `update_time`,
    ADD COLUMN `url` varchar(255) NOT NULL COMMENT '请求地址' AFTER `request_method`;

