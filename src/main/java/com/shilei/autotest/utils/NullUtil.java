package com.shilei.autotest.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjectUtil;
import com.shilei.autotest.entity.Interface;
import com.shilei.autotest.entity.Parameter;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * @author ShiLei
 * @date 2022/4/24 15:50
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Component
public class NullUtil {

    public static void check(Object o){
        if (ObjectUtil.isEmpty(o)){
            throw new ServiceException("Object should not be null!");
        }
    }

    public static void check(Parameter o){
        if (ObjectUtil.isEmpty(o)){
            throw new ServiceException("Object should not be null!");
        }
        if (ObjectUtil.isEmpty(o.getName())){
            throw new ServiceException("Object.name should not be null!");
        }
    }

    public static void check(Interface o){
        if (ObjectUtil.isEmpty(o)){
            throw new ServiceException("Object should not be null!");
        }
        if (ObjectUtil.isEmpty(o.getName())){
            throw new ServiceException("Object.name should not be null!");
        }
        if (ObjectUtil.isEmpty(o.getUrl())){
            throw new ServiceException("Object.url should not be null!");
        }
        if (ObjectUtil.isEmpty(o.getRequestMethod())){
            throw new ServiceException("Object.getRequestMethod should not be null!");
        }
    }

    public static void checkList(List<?> list){
        if (CollUtil.isEmpty(list)){
            throw new ServiceException("List should not be null!");
        }
    }
}
