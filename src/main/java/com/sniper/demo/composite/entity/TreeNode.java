package com.sniper.demo.composite.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sniper
 * @date 2021/8/2 22:14
 **/

public class TreeNode {
    private String nodeName;
    private TreeNode parent;
    private List<TreeNode> children;

    public TreeNode() {
    }

    public TreeNode(String nodeName, TreeNode parent) {
        this.nodeName = nodeName;
        this.parent = parent;
        children = new ArrayList<>();
    }

    public TreeNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public void addChild(TreeNode node){
        children.add(node);
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
