package com.example.week2test;

public class BinarySearchTree {
    BSTNode root = null;

    int[] A;
    int i;


    public void printInorder(){
        if(!isEmpty()) root.printInorder();

    }

    public void insert (int x){
        if (isEmpty()) root = new BSTNode(x);
        else root.insert(x);
    }
    public boolean isEmpty(){
        return (root == null);

    }

    public class BSTNode{
        int x;

        BSTNode left = null;
        BSTNode right= null;

        public BSTNode(int x){
            this.x = x;
        }

        public BSTNode(int x, BSTNode left, BSTNode right){
            this.x        = x;
            this.left     = left;
            this.right    = right;

        }

        public void insert (int value){
            if (value < x){
                if (left != null) left.insert(value);

                else              left = new BSTNode(value);
            }

            if (value > x){
                if (right != null) right.insert(value);

                else              right = new BSTNode(value);
            }
        }

        public void printInorder(){
            if (left != null)left.printInorder();
            System.out.println(x);
            if (right != null) right.printInorder();
        }
    }


    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();

        int[] myArray = {50,32,13,65,34,22,3,76,90};

        for (int i = 0 ; i < myArray.length; i++) {
            tree.insert(myArray[i]);
        }
        tree.printInorder();

    }
}