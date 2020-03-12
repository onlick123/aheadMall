package com.ahead.mall.dao;

import com.ahead.mall.model.UmsPermission;
import com.ahead.mall.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/12 12:23
 */
public interface UmsRolePermissionRelationDao {
    /**
     * 批量插入角色和权限关系
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * 根据角色获取权限
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}

