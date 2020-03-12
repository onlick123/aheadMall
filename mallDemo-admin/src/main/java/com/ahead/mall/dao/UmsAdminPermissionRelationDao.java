package com.ahead.mall.dao;

import com.ahead.mall.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/9 20:44
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
