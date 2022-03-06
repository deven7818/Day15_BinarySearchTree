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
	
	public static void main(String [] args) {
		BinarySearch tree = new BinarySearch();
		
		/*
		 * insert element to tree 
		 */
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		tree.inorder();
	}
	
}














