package com.ahead.mall.service.impl;

import com.ahead.mall.mapper.UmsPermissionMapper;
import com.ahead.mall.model.UmsPermission;
import com.ahead.mall.model.UmsPermissionExample;
import com.ahead.mall.service.UmsPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/16 13:49
 */
@Service
public class UmsPermissionServiceImpl implements UmsPermissionService {

    @Autowired
    private UmsPermissionMapper permissionMapper;
    @Override
    public List<UmsPermission> list() {
        return permissionMapper.selectByExample(new UmsPermissionExample());
    }

    @Override
    public int create(UmsPermission umsPermission) {
        umsPermission.setStatus(1);
        umsPermission.setSort(0);
        umsPermission.setCreateTime(new Date());
        return permissionMapper.insert(umsPermission);
    }

    @Override
    public int update(Long id, UmsPermission umsPermission) {
      umsPermission.setId(id);
        return permissionMapper.updateByPrimaryKeySelective(umsPermission);
    }

    @Override
    public int delete(List<Long> ids) {
        UmsPermissionExample example=new UmsPermissionExample();
        example.createCriteria().andIdIn(ids);
        return permissionMapper.deleteByExample(example);
    }
}
