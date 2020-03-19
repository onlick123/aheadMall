package com.ahead.mall.service.impl;

import com.ahead.mall.mapper.UmsMemberLevelMapper;
import com.ahead.mall.model.UmsMemberLevel;
import com.ahead.mall.model.UmsMemberLevelExample;
import com.ahead.mall.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/16 10:59
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;
    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example=new UmsMemberLevelExample();
        UmsMemberLevelExample.Criteria criteria = example.createCriteria();
        criteria.andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
