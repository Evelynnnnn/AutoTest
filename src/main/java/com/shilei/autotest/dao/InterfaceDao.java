package com.shilei.autotest.dao;

import com.shilei.autotest.entity.Interface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ShiLei
 * @date 2022/4/24 15:24
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Repository
public interface InterfaceDao extends JpaRepository<Interface,Long> {


    Interface findInterfaceById(Long id);
}
