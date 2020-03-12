package com.ahead.mall.dto;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
/**
 * @description: 用户登录参数
 * @author: 邹洋洋
 * @time: 2020/3/9 20:55
 */
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
