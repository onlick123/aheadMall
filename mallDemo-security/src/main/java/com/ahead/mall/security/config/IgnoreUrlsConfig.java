package com.ahead.mall.security.config;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;
/**
 * @description: 用于配置不需要保护的资源路径
 * @author: 邹洋洋
 * @time: 2020/3/9 16:10
 */


@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {

    private List<String> urls = new ArrayList<>();

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}