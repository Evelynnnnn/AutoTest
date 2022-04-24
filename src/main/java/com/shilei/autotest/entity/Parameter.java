package com.shilei.autotest.entity;

import cn.hutool.core.util.ObjectUtil;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ShiLei
 * @date 2022/4/22 16:06
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Data
@Table(name = "parameter")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long interfaceId;

    private String name;

    private Integer type;

    private String value;

    private Boolean must;

    private String defaultValue;

    private String description;

    public String getValue() {
        if (ObjectUtil.isEmpty(value)){
            value = "";
        }
        return value;
    }
}
