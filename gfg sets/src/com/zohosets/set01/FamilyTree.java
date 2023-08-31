package com.zohosets.set01;

import java.util.*;

class TreeNode {
    String value;
    List<TreeNode> children;

    public TreeNode(String value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
}

public class FamilyTree {
    private static int findNumberOfGrandchildren(TreeNode root, String target) {
        TreeNode targetNode = findNode(root, target);
        if (targetNode == null) {
            return 0; // Target person not found in the family tree
        }

        int numberOfGrandchildren = 0;
        for (TreeNode child : targetNode.children) {
            numberOfGrandchildren += countChildren(child);
        }

        return numberOfGrandchildren;
    }

    private static int countChildren(TreeNode node) {
        int count = node.children.size();
        for (TreeNode child : node.children) {
            count += countChildren(child);
        }
        return count;
    }

    private static TreeNode findNode(TreeNode node, String target) {
        if (node == null) {
            return null;
        }

        if (node.value.equals(target)) {
            return node;
        }

        for (TreeNode child : node.children) {
            TreeNode result = findNode(child, target);
            if (result != null) {
                return result;
            }
        }

        return null;
    }

    private static TreeNode findRoot(Map<String, String> input) {
        Set<String> children = new HashSet<>();
        Set<String> fathers = new HashSet<>();

        for (Map.Entry<String, String> entry : input.entrySet()) {
            children.add(entry.getKey());
            fathers.add(entry.getValue());
        }

        // The root will be the person who is not a child in any relationship
        fathers.removeAll(children);
        String rootName = fathers.iterator().next();

        return new TreeNode(rootName);
    }

    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("luke", "shaw");
        input.put("wayne", "rooney");
        input.put("rooney", "ronaldo");
        input.put("shaw", "rooney");

        TreeNode root = findRoot(input);

        Map<String, TreeNode> nodeMap = new HashMap<>();
        for (Map.Entry<String, String> entry : input.entrySet()) {
            String child = entry.getKey();
            String father = entry.getValue();

            TreeNode childNode = nodeMap.getOrDefault(child, new TreeNode(child));
            TreeNode fatherNode = nodeMap.getOrDefault(father, new TreeNode(father));

            childNode.value = child;
            fatherNode.value = father;

            fatherNode.children.add(childNode);
            nodeMap.put(child, childNode);
            nodeMap.put(father, fatherNode);
        }

        String target = "ronaldo";
        int numberOfGrandchildren = findNumberOfGrandchildren(root, target);
        System.out.println("Number of grandchildren for " + target + ": " + numberOfGrandchildren);
    }
}
