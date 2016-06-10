package com.goit.g2popov.module05.task02;

/**
 * Class {@code SortArray} realizes two algorithms of array sorting:
 * 1) Bubbles sorting
 * 2) Binary tree sorting
 * @author Andrii Popov
 */
public class SortArray implements Sorting {
        private int anArray[];

        SortArray (int inputArray[]) {
             this.anArray = inputArray;
        }

        // Classic Bubbles sorting
        public int[] sortArray () {
                int arrayLength = this.anArray.length;
                for (int i = arrayLength; i>0; i--) {
                        for (int j = 0; j < i-1; j++) {
                                if (anArray[j+1]<anArray[j]) {
                                        int tempVariable = anArray[j];
                                        anArray[j] = anArray[j+1];
                                        anArray[j+1] = tempVariable;
                                }
                        }
                }
                return this.anArray;
        }

        // Exquisite binary tree sorting
        public void sortArrayBinaryTree() {
                TreeNode rootNode = initialiseRoot(0, anArray[0]);
                int arrayLength = this.anArray.length;
                for (int i = 1; i<arrayLength; i++) {
                        createSubTree(i, anArray[i], rootNode);
                }
                // Traverse through the tree
                traverseTree(rootNode);
        }

        private TreeNode initialiseRoot(int id, int value) {
                TreeNode rootNode = new TreeNode(id, value);
                return rootNode;
        }

        private TreeNode createNode(int id, int value, TreeNode node) {
                TreeNode rootNode = new TreeNode(id, value, node);
                return rootNode;
        }

        private void createSubTree(int arrayId, int arrayValue, TreeNode root) {
                if (arrayValue <= root.value) {
                        if (root.left == null) {
                                TreeNode leftNode = createNode(arrayId, arrayValue, root);
                                root.left = leftNode;
                        }
                        else {
                                root = root.left;
                                createSubTree(arrayId, arrayValue, root);
                        }
                }
                else {
                        if (root.right == null) {
                                TreeNode rightNode = createNode(arrayId, arrayValue, root);
                                root.right = rightNode;
                        }
                        else {
                                root = root.right;
                                createSubTree(arrayId, arrayValue, root);
                        }
                }
        }

        private void traverseTree(TreeNode node) {
                        if (node.left != null) traverseTree(node.left);
                        System.out.print(node.value+" ");
                        if (node.right != null) traverseTree(node.right);
        }

        private int findMinimalNode(TreeNode root) {
                while (root.left != null) {
                        root = root.left;
                }
                return root.value;
        }
}

class TreeNode {
        int id;
        int value;
        TreeNode parent;
        TreeNode left;
        TreeNode right;

        public TreeNode(int id, int value) {
                this.id = id;
                this.value = value;
        }

        public TreeNode(int id, int value, TreeNode parent) {
                this.id = id;
                this.value = value;
                this.parent = parent;
        }
}
