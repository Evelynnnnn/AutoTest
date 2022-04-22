package com.shilei.autotest.entity;

import com.shilei.autotest.enums.StatusEnum;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author ShiLei
 * @date 2022/4/22 16:03
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Data
@Table(name = "interface")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Interface {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long moduleId;

    private String name;

    private StatusEnum status;

    private String description;

    private Date createTime;

    private Date updateTime;

    private Integer requestMethod;

    private String url;

}
