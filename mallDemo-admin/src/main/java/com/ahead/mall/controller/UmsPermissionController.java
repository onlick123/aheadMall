package com.ahead.mall.controller;

import com.ahead.mall.common.api.CommonResult;
import com.ahead.mall.model.UmsPermission;
import com.ahead.mall.service.UmsPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 后台用户权限管理
 * @author: 邹洋洋
 * @time: 2020/3/16 11:37
 */
@RestController
@Api(tags = "UmsPermissionController",description = "后台用户权限管理")
@RequestMapping("/permission")
public class UmsPermissionController extends BaseController{
    @Autowired
    private UmsPermissionService permissionService;

    @ApiOperation("获取所有权限列表")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<List<UmsPermission>> list(){
        List<UmsPermission> list = permissionService.list();
        return CommonResult.success(list);
    }
    @ApiOperation("添加权限")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsPermission umsPermission){
        int result = permissionService.create(umsPermission);
        return check(result);
    }
    @ApiOperation("修改权限")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult update(@PathVariable Long id, @RequestBody UmsPermission umsPermission){
        int result = permissionService.update(id,umsPermission);
        return check(result);
    }
    @ApiOperation("根据id批量删除权限")
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public CommonResult delete(@RequestParam("ids") List<Long> ids){
        int result = permissionService.delete(ids);
        return check(result);
    }




}
