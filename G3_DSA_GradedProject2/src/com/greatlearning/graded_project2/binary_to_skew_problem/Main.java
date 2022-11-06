package com.greatlearning.graded_project2.binary_to_skew_problem;

import com.greatlearning.graded_project2.binary_to_skew_problem.entity.Node;
import com.greatlearning.graded_project2.binary_to_skew_problem.entity.Tree;

public class Main {
    public static void main(String[] args) {

        Node root  = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(10);
        root.right.left = new Node(55);


        Tree tree = new Tree(root);

        tree.convertRightSkewedTree();
        tree.printTree();


    }
}
