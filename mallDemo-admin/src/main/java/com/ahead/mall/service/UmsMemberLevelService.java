package com.ahead.mall.service;

import com.ahead.mall.model.UmsMemberLevel;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/16 10:59
 */
public interface UmsMemberLevelService {
    /**
     * 获取所有会员登录
     * @param defaultStatus 是否为默认会员
     */
    List<UmsMemberLevel> list(Integer defaultStatus);
}
