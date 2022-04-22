CREATE TABLE `auto_test`.`project`  (
                                         `id` bigint(64) NOT NULL,
                                         `name` varchar(255) NOT NULL COMMENT '项目名称',
                                         `status` char(1) NOT NULL DEFAULT 0 COMMENT '状态',
                                         `description` varchar(255) NULL COMMENT '描述',
                                         `create_time` datetime(0) NOT NULL COMMENT '创建时间',
                                         `update_time` datetime(0) NOT NULL COMMENT '更新时间',
                                         PRIMARY KEY (`id`)
);

CREATE TABLE `auto_test`.`module`  (
                                         `id` bigint(64) NOT NULL,
                                         `name` varchar(255) NOT NULL COMMENT '模块名称',
                                         `project_id` bigint(64) NULL COMMENT '项目id',
                                         `status` char(1) NOT NULL DEFAULT 0 COMMENT '状态',
                                         `description` varchar(255) NULL COMMENT '描述',
                                         `create_time` datetime(0) NULL COMMENT '创建时间',
                                         `update_time` datetime(0) NULL COMMENT '更新时间',
                                         PRIMARY KEY (`id`)
);

CREATE TABLE `auto_test`.`interface`  (
                                         `id` bigint(64) NOT NULL,
                                         `name` varchar(255) NOT NULL COMMENT '接口名称',
                                         `module_id` bigint(64) NULL COMMENT '模块id',
                                         `status` char(1) NOT NULL DEFAULT 0 COMMENT '状态',
                                         `description` varchar(255) NULL COMMENT '描述',
                                         `create_time` datetime(0) NULL COMMENT '创建时间',
                                         `update_time` datetime(0) NULL COMMENT '更新时间',
                                         PRIMARY KEY (`id`)
);

CREATE TABLE `auto_test`.`parameter`  (
                                          `id` bigint(64) NOT NULL,
                                          `name` varchar(255) NOT NULL COMMENT '参数名称',
                                          `interface_id` bigint(64) NULL COMMENT '接口id',
                                          `status` char(1) NOT NULL DEFAULT 0 COMMENT '状态',
                                          `must` char(1) NOT NULL DEFAULT 0 COMMENT '必传',
                                          `description` varchar(255) NULL COMMENT '描述',
                                          `value` varchar(255) NULL COMMENT '参数内容',
                                          `default_value` varchar(255) NULL COMMENT '默认参数内容',
                                          `create_time` datetime(0) NULL COMMENT '创建时间',
                                          `update_time` datetime(0) NULL COMMENT '更新时间',
                                          PRIMARY KEY (`id`)
);
