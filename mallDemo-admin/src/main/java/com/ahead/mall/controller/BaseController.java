package com.ahead.mall.controller;

import com.ahead.mall.common.api.CommonResult;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/17 19:11
 */
@Controller
public class BaseController {
    //简单的校验
    public CommonResult check(int result){
        if(result>0){
            return CommonResult.success(result);
        }else{
            return  CommonResult.failed();
        }
    }
}
