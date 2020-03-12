package com.ahead.mall.dao;

import com.ahead.mall.model.UmsAdminRoleRelation;
import com.ahead.mall.model.UmsPermission;
import com.ahead.mall.model.UmsResource;
import com.ahead.mall.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/9 20:44
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);
}
