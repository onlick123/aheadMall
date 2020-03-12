package com.ahead.mall.dao;

import com.ahead.mall.model.UmsMenu;
import com.ahead.mall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/9 20:58
 */
public interface UmsRoleDao {
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);

}
