package com.ahead.mall.service;

import com.ahead.mall.model.UmsResourceCategory;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/17 19:47
 */
public interface UmsResourceCategoryService {
    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();
    /**
     * 添加资源分类
     * */
    int create(UmsResourceCategory resourceCategory);
    /**
     * 删除资源分类
     * */
    int delete(Long id);
    /**
     * 更新资源分类
     * */
    int update(Long id,UmsResourceCategory resourceCategory);
}
