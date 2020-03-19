package com.ahead.mall.service;

import com.ahead.mall.dto.UmsMenuNode;
import com.ahead.mall.model.UmsMenu;

import java.util.List;

/**
 * @description: 后台菜单管理Service
 * @author: 邹洋洋
 * @time: 2020/3/15 17:09
 */
public interface UmsMenuService {
    /**
    * 创建菜单
    * */
    int create(UmsMenu umsMenu);
    /**
     * 分页查询后台菜单
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 根据ID获取菜单详情
     */
    UmsMenu getItem(Long id);

    /**
     * 修改菜单显示状态
     */
    int updateHidden(Long id,Integer hidden);
    /**
     * 修改后台菜单
     */
    int update(Long id,UmsMenu umsMenu);
    /**
     * 根据ID删除菜单
     */
    int  delete(Long id);
    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNode> treeList();
}
