package com.binarysearchtree;

public class BinarySearch {

	/**
	 * Root of Binary search Tree
	 */
	BNode root;

	/*
	 * Constructor
	 */
	public BinarySearch() {
		root = null;
	}
	
	/**
	 * In-order traversal of the tree
	 */
	void inorder() {
		inorderUtil(this.root);
	}
	
	/*
	 * Utility function for In-order traversal of the tree
	 */
	void inorderUtil(BNode node) {
		if(node == null)
			return;
		
		inorderUtil(node.left);
		System.out.println(node.data + " ");
		inorderUtil(node.right);
	}
	
	/*
	 *adding new node
	 */
	public void insert(int data) {
		this.root = this.insertRec(this.root, data);
	}
	
	BNode insertRec(BNode node , int data){
	
		/*
		 * if the tree is empty, then return a new node
		 */
		if(node == null) {
			this.root = new BNode(data);
			return this.root;
		}
		
		/*
		 * Otherwise ,check data is less than root then post to left
		 */
		if(data <= node.data) {
			node.left = this.insertRec(node.left, data);
		}
		/*
		 * else post to right
		 */
		else {
			node.right = this.insertRec(node.right, data);
		}
		/*
		 * return node
		*/
		return node;
	}
	
	/*
	 * this class Initializes the value of sum to 0
	 */
	public class Sum{
		int sum = 0;
	}
	/*
	 * 
	 */
	public static boolean flag = false;
	
	/*
	 * Search Node element 
	 */
	public void searchNode(BNode temp , int value) {
		/*
		 *Check weather tree is empty  
		 */
		if(root == null) {
			System.out.println("Tree is Empty");
		}else {
			 //If value is found in the given binary tree then, set the flag to true 
			if(temp.data == value) {
				flag = true;
				return;
			}
			/*
			 * Search in left subtree
			 */
			if (flag == false && temp.left!=null) {
				searchNode(temp.left, value);
			}
			if(flag == false && temp.right!=null) {
				searchNode(temp.right, value);
	
			}
			
		}
		System.out.println("value present at" +temp.data);
	}
	
	public static void main(String [] args) {
		BinarySearch tree = new BinarySearch();
		
		/*
		 * insert element to tree 
		 */
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.insert(22);
		tree.insert(40);
		tree.insert(60);
		tree.insert(95);
		tree.insert(11);
		tree.insert(65);
		tree.insert(3);
		tree.insert(16);
		tree.insert(63);
		tree.insert(67);
		
		
		tree.inorder();
		tree.searchNode(tree.root, 67);
	}
	
}














