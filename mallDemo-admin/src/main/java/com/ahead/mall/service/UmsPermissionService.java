package com.ahead.mall.service;

import com.ahead.mall.model.UmsPermission;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/16 13:49
 */
public interface UmsPermissionService {
    /**
     * 获取所有权限
     */
    List<UmsPermission> list();
    /**
     * 添加权限
     */
    int  create(UmsPermission umsPermission);
    /**
     * 修改权限
     */
    int update(Long id,UmsPermission umsPermission);
    /**
     * 批量删除权限
     */
    int delete(List<Long> ids);
}
