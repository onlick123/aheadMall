package com.ahead.mall.controller;

import com.ahead.mall.common.api.CommonPage;
import com.ahead.mall.common.api.CommonResult;
import com.ahead.mall.model.UmsResource;
import com.ahead.mall.service.UmsResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 后台资源管理Controller
 * @author: 邹洋洋
 * @time: 2020/3/17 18:49
 */
@Api(tags = "UmsResourceController",description = "后台资源管理")
@RestController
@RequestMapping("/resource")
public class UmsResourceController extends BaseController{
    @Autowired
    private UmsResourceService resourceService;


    @ApiOperation("分页模糊查询后台资源")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public CommonResult<CommonPage<UmsResource>> list(@RequestParam(required = false) Long categoryId,
                                                      @RequestParam(required = false) String nameKeyword,
                                                      @RequestParam(required = false) String urlKeyword,
                                                      @RequestParam(value = "pageSize" ,defaultValue = "10") Integer pageSize,
                                                      @RequestParam(value = "pageNun" ,defaultValue = "1 ")  Integer pageNun){
        List<UmsResource> list = resourceService.list(categoryId, nameKeyword, urlKeyword, pageSize, pageNun);
        return CommonResult.success(CommonPage.restPage(list));
    }

    @ApiOperation("修改后台资源")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult update(@PathVariable Long id,@RequestBody UmsResource umsResource){
        int update = resourceService.update(id, umsResource);
        return check(update);
    }

    @ApiOperation("根据ID删除后台资源")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public CommonResult delete(@PathVariable Long id){
        int delete = resourceService.delete(id);
        return check(delete);
    }

    @ApiOperation("添加后台资源")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsResource umsResource){
        int i = resourceService.create(umsResource);
        return check(i);
    }

    @ApiOperation("根据ID获取资源详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CommonResult<UmsResource> getItem(@PathVariable Long id){
        UmsResource item = resourceService.getItem(id);
        return CommonResult.success(item);
    }

    @ApiOperation("查询所有后台资源")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult<List<UmsResource>> listAll(){
        List<UmsResource> umsResources = resourceService.listAll();
        return CommonResult.success(umsResources);
    }

}
