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
import java.util.Date;

/**
 * @author ShiLei
 * @date 2022/4/22 15:47
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Data
@Table(name = "project")
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 状态
     */
    private StatusEnum status;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
