package com.hust.zx;

/**
 * Created by zx on 2016/4/16.
 */
public class TreeBuilder {

    public static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0)
            return null;
        TreeNode[] trees = new TreeNode[nodes.length + 1];
        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i].equals("null")) {
                trees[i + 1] = null;
            } else {
                trees[i + 1] = new TreeNode(Integer.parseInt(nodes[i]));
            }
        }
        for (int i = 1; i < trees.length; i++) {
            if (trees[i] != null) {
                if (i * 2 < trees.length && trees[2 * i] != null) {
                    trees[i].left = trees[2 * i];
                } else {
                    trees[i].left = null;
                }
                if (i * 2 + 1 < trees.length && trees[2 * i + 1] != null) {
                    trees[i].right = trees[2 * i + 1];
                } else {
                    trees[i].right = null;
                }
            }
        }
        return trees[1];
    }

    public static TreeNode buildTree(String nodes){
        String[] nodeStrings = nodes.split(",");
        return buildTree(nodeStrings);
    }

    public static void showTree(TreeNode root) {
        if (root == null) {
            System.out.println("null");
        } else {
            System.out.println(root.val);
            showTree(root.left);
            showTree(root.right);
        }
    }

}
