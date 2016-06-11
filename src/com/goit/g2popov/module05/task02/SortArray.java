package com.goit.g2popov.module05.task02;

/**
 * Class {@code SortArray} realizes two algorithms of array sorting:
 * 1) Bubbles sorting
 * 2) Binary tree sorting
 * @author Andrii Popov
 */
public class SortArray implements Sorting {
        private int anArray[];
        private static int counter = 0;

        SortArray (int inputArray[]) {
             this.anArray = inputArray.clone();
        }

        // Classic Bubbles sorting
        public void sortArray () {
                int arrayLength = this.anArray.length;
                for (int i = arrayLength; i > 0; i--) {
                        for (int j = 0; j < i-1; j++) {
                                if (anArray[j+1]<anArray[j]) {
                                        int tempVariable = anArray[j];
                                        anArray[j] = anArray[j+1];
                                        anArray[j+1] = tempVariable;
                                }
                        }
                }
        }

        // Exquisite binary tree sorting
        public void sortArrayBinaryTree() {
                TreeNode rootNode = createNode(0, anArray[0]);
                int arrayLength = this.anArray.length;
                for (int i = 1; i<arrayLength; i++) {
                        createSubTree(i, anArray[i], rootNode);
                }
                traverseTree(rootNode);
        }

        private TreeNode createNode(int id, int value) {
                TreeNode rootNode = new TreeNode(id, value);
                return rootNode;
        }

        private void createSubTree(int arrayId, int arrayValue, TreeNode root) {
                if (arrayValue <= root.value) {
                        if (root.left == null) {
                                TreeNode leftNode = createNode(arrayId, arrayValue);
                                root.left = leftNode;
                        }
                        else {
                                root = root.left;
                                createSubTree(arrayId, arrayValue, root);
                        }
                }
                else {
                        if (root.right == null) {
                                TreeNode rightNode = createNode(arrayId, arrayValue);
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
                anArray[counter] = node.value;
                counter++;
                if (node.right != null) traverseTree(node.right);
        }

        @Override
        public String toString() {
                String arrayString = "";
                for (int i = 0; i<anArray.length; i++) {
                        arrayString = arrayString + anArray[i]+" ";
                }
                return arrayString;
        }
}

class TreeNode {
        int id;
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int id, int value) {
                this.id = id;
                this.value = value;
        }
}
