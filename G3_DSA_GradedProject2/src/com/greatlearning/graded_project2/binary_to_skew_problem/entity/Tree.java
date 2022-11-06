package com.greatlearning.graded_project2.binary_to_skew_problem.entity;

public class Tree {

    Node root;
    Node temp;
    Node newRoot;
    public Tree(Node root) {
        this.root = root;
    }

    public void convertRightSkewedTree() {
        inorderTraversal(this.root);
    }
    private void inorderTraversal(Node root) {


        if(root == null)
            return;

        inorderTraversal(root.left);

        if(newRoot == null) {
            newRoot = root;
            temp = root;
        }

        else {
            temp.right = root;
            root.left = null;
            temp = root;
        }

        inorderTraversal(root.right);
    }

    public void printTree() {

        printTreeHelper(this.newRoot);

    }

    public void printTreeHelper(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        printTreeHelper(root.right);
    }

}
