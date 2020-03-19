package com.ahead.mall.controller;

import com.ahead.mall.common.api.CommonPage;
import com.ahead.mall.common.api.CommonResult;
import com.ahead.mall.dto.UmsMenuNode;
import com.ahead.mall.model.UmsMenu;
import com.ahead.mall.service.UmsMenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description: 后台菜单管里controller
 * @author: 邹洋洋
 * @time: 2020/3/15 17:04
 */
@Api(tags = "UmsMenuController", description = "后台菜单管理")
@RestController
@RequestMapping("/menu")
public class UmsMenuController extends  BaseController{


    @Autowired
    private UmsMenuService menuService;

    @ApiOperation("添加后台菜单")
    @RequestMapping(value = "/create", method = RequestMethod.POST)

    public CommonResult create(@RequestBody UmsMenu umsMenu) {
        int count = menuService.create(umsMenu);
        return check(count);
    }
    @ApiOperation("根据ID获取菜单详情")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)

    public CommonResult<UmsMenu> getItem(@PathVariable Long id) {
        UmsMenu umsMenu = menuService.getItem(id);
        return CommonResult.success(umsMenu);
    }

    @ApiOperation("分页查询后台菜单")
    @RequestMapping(value = "/list/{parentId}", method = RequestMethod.GET)

    public CommonResult<CommonPage<UmsMenu>> list(@PathVariable Long parentId,
                                                  @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<UmsMenu> menuList = menuService.list(parentId, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(menuList));
    }
    @ApiOperation("修改菜单显示状态")
    @RequestMapping(value = "/updateHidden/{id}",method = RequestMethod.POST)

    public CommonResult updateHidden(@PathVariable Long id,@RequestParam("hidden") Integer hidden){
        int result = menuService.updateHidden(id, hidden);
        return check(result);
    }
    @ApiOperation("修改后台菜单")
    @RequestMapping(value = "/update/{id}",method = RequestMethod.POST)
    public CommonResult update(@PathVariable Long id ,@RequestBody UmsMenu umsMenu){
        int update = menuService.update(id, umsMenu);
        return check(update);
    }
    @ApiOperation("根据ID删除后台菜单")
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.POST)
    public CommonResult delete(@PathVariable Long id){
        int delete = menuService.delete(id);
        return check(delete);
    }

    @ApiOperation("树形结构返回所有菜单列表")
    @RequestMapping(value = "/treeList", method = RequestMethod.GET)
    public CommonResult<List<UmsMenuNode>> treeList(){
        List<UmsMenuNode> list = menuService.treeList();
        return CommonResult.success(list);
    }


}
