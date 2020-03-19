package com.ahead.mall.service.impl;

import com.ahead.mall.mapper.UmsResourceCategoryMapper;
import com.ahead.mall.model.UmsResourceCategory;
import com.ahead.mall.model.UmsResourceCategoryExample;
import com.ahead.mall.service.UmsResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/17 19:47
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;
    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
      return   resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory resourceCategory) {
        resourceCategory.setCreateTime(new Date());
        return resourceCategoryMapper.insert(resourceCategory);
    }

    @Override
    public int delete(Long id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(Long id,UmsResourceCategory resourceCategory) {
        resourceCategory.setId(id);
        return resourceCategoryMapper.updateByPrimaryKeySelective(resourceCategory);
    }
}
