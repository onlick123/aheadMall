package com.ahead.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/9 21:01
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.ahead.mall.mapper","com.ahead.mall.dao"})
public class MyBatisConfig {
}
