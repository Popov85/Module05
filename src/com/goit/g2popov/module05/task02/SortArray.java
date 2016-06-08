package com.goit.g2popov.module05.task02;

/**
 * Created by Андрей on 03.06.2016.
 */
public class SortArray {
        private int anArray[];

        SortArray (int inputArray[]) {
             this.anArray = inputArray;
        }

        // Classic Bubbles sorting
        public int[] sortArray () {
                int arrayLength = this.anArray.length;
                for (int i = arrayLength; i>0; i--) {
                        for (int j = 1; j < i-1; j++) {
                                if (anArray[j+1]<anArray[j]) {
                                        int tempVariable = anArray[j];
                                        anArray[j] = anArray[j+1];
                                        anArray[j+1] = tempVariable;
                                }
                        }
                }
                return this.anArray;
        }

        public void formBinaryTree() {
                TreeNode rootNode = initialiseRoot(0, anArray[0]);
                int arrayLength = this.anArray.length;
                for (int i = 1; i<arrayLength; i++) {
                        formSubTree(i, anArray[i], rootNode);
                }
                // Launch a method to traverse the tree built (rootNode);
        }

        private TreeNode initialiseRoot(int id, int value) {
                TreeNode rootNode = new TreeNode(id, value);
                return rootNode;
        }

        private TreeNode createNode(int id, int value, TreeNode node) {
                TreeNode rootNode = new TreeNode(id, value, node);
                return rootNode;
        }

        private void formSubTree(int arrayId, int arrayValue, TreeNode root) {
                if (arrayValue < root.value) {
                        if (root.left == null) {
                                TreeNode leftNode = createNode(arrayId, arrayValue, root);
                                root.left = leftNode;
                        }
                        else {
                                root = root.left;
                                formSubTree(arrayId, arrayValue, root);
                        }
                }
                else {
                        if (root.right == null) {
                                TreeNode rightNode = createNode(arrayId, arrayValue, root);
                                root.right = rightNode;
                        }
                        else {
                                root = root.right;
                                formSubTree(arrayId, arrayValue, root);
                        }
                }
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
