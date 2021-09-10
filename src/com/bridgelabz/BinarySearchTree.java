package com.bridgelabz;

public class BinarySearchTree {
	
    class Node
    {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
 
    // Root of BST
    Node root;
 
    // Constructor
    BinarySearchTree()
    {
         root = null;
    }
 
    // This method mainly calls insertRec()
    void insert(int key)
    {
         root = insertRec(root, key);
    }
 
    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key)
    {
 
        /* If the tree is empty,
           return a new node */
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        
        return root;
      }
 // This method mainly calls InorderRec()
    void inorder()
    {
         inorderRec(root);
    }
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
        }
    
      //search method
    	void search(int data) {
    		while(root != null) {
    			if(data<root.key) {                           //checking input is lessthan root or not
    				root=root.left;                              //moving into left node
    			}else if(data>root.key) {
    				root=root.right;
    			}
    			else if(data==root.key) {                         //checking data is greater than root
    				System.out.println(data+" is found");         //moving into right children
    				break;
    			}else {
    				System.out.println("no data found");
    			}
    }
    	}
}
