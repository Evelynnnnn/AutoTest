package com.shilei.autotest.service.impl;

import com.shilei.autotest.dao.InterfaceDao;
import com.shilei.autotest.dao.ParameterDao;
import com.shilei.autotest.entity.Interface;
import com.shilei.autotest.entity.Parameter;
import com.shilei.autotest.service.GenerateRandomParamService;
import com.shilei.autotest.utils.NullUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author ShiLei
 * @date 2022/4/24 17:42
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Service
public class GenerateRandomParamServiceImpl implements GenerateRandomParamService {

    @Autowired
    InterfaceDao interfaceDao;

    @Autowired
    ParameterDao parameterDao;

    @Override
    public List<Parameter> generateByInterface(Long interfaceId) {
        Interface interfaceEntity = interfaceDao.findInterfaceById(interfaceId);
        NullUtil.check(interfaceEntity);
        List<Parameter> parameters = parameterDao.findAllByInterfaceId(interfaceId);
        NullUtil.checkList(parameters);
        return null;
    }

}
