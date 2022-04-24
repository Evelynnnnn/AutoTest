package com.shilei.autotest.dao;

import com.shilei.autotest.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ShiLei
 * @date 2022/4/24 15:24
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
public interface ProjectDao extends JpaRepository<Project,Long> {

}
