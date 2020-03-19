package com.ahead.mall.dto;

import com.ahead.mall.model.UmsMenu;

import java.util.List;

/**
 * @description:
 * @author: 邹洋洋
 * @time: 2020/3/16 10:13
 */
public class UmsMenuNode  extends UmsMenu {
    private List<UmsMenuNode> children;

    public List<UmsMenuNode> getChildren() {
        return children;
    }

    public void setChildren(List<UmsMenuNode> children) {
        this.children = children;
    }
}
