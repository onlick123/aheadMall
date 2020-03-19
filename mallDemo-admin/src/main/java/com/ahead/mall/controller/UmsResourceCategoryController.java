package com.ahead.mall.controller;

import com.ahead.mall.common.api.CommonResult;
import com.ahead.mall.model.UmsResourceCategory;
import com.ahead.mall.service.UmsResourceCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 后台资源分类管理Controller
 * @author: 邹洋洋
 * @time: 2020/3/17 19:46
 */
@Api(tags = "UmsResourceCategoryController",description = "后台资源分类管理")
@RestController
@RequestMapping("/resourceCategory")
public class UmsResourceCategoryController extends  BaseController {
    @Autowired
    private UmsResourceCategoryService resourceCategoryService;

    @ApiOperation("查询所有后台资源分类")
    @RequestMapping(value = "/listAll",method = RequestMethod.GET)
    public CommonResult<List<UmsResourceCategory>> listAll(){
        List<UmsResourceCategory> umsResourceCategories = resourceCategoryService.listAll();
        return CommonResult.success(umsResourceCategories);
    }

    @ApiOperation("添加后台资源分类")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public CommonResult create(@RequestBody UmsResourceCategory resourceCategory){
        int create= resourceCategoryService.create(resourceCategory);
        return check(create);
    }
    @ApiOperation("根据ID删除后台资源")
    @RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
    public CommonResult delete(@PathVariable Long id){
        int delete= resourceCategoryService.delete(id);
        return check(delete);
    }
    @ApiOperation("修改后台资源分类")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult update(@PathVariable Long id,@RequestBody UmsResourceCategory resourceCategory){
       int update= resourceCategoryService.update(id,resourceCategory);
       return check(update);
    }

}
