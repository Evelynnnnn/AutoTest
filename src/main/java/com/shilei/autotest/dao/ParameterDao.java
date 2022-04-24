package com.shilei.autotest.dao;

import com.shilei.autotest.entity.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ShiLei
 * @date 2022/4/24 15:24
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
public interface ParameterDao extends JpaRepository<Parameter,Long> {

    List<Parameter> findAllByInterfaceId(Long interfaceId);

}
