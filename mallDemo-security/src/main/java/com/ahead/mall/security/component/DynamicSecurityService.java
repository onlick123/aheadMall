package com.ahead.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @description: 动态权限相关业务类
 * @author: 邹洋洋
 * @time: 2020/3/9 16:07
 */

public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
