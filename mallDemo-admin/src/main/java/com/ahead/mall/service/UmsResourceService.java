package com.ahead.mall.service;

import com.ahead.mall.model.UmsResource;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/16 15:59
 */
public interface UmsResourceService {
    /**
     * 查询后台所有资源信息
     * */
    List<UmsResource> listAll();

    /**
     * 根据id查询资源信息
     * */
    UmsResource getItem(Long id);
    /**
     * 创建资源
     * */
    int create(UmsResource umsResource);
    /**
     *
     * 删除后台资源
     * */
    int delete(Long id );
    /**
     * 修改后台资源
     **/
    int update(Long id ,UmsResource umsResource);
    /**
     * 分页查询资源
     */
    List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);
}
