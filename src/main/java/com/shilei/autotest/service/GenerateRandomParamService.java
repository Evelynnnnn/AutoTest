package com.shilei.autotest.service;

import com.shilei.autotest.entity.Parameter;

import java.util.List;

/**
 * @author ShiLei
 * @date 2022/4/24 17:42
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
public interface GenerateRandomParamService {

    List<Parameter> generateByInterface(Long interfaceId);
}
