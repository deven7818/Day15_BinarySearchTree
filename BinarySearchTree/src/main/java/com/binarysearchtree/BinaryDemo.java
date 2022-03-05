package com.binarysearchtree;
//Java code to add all greater values to
//every node in a given BST

//A binary tree node
class Node {

	int data;
	Node left, right;

	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class BinarySearchTree {

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree()
	{
		root = null;
	}

	// Inorder traversal of the tree
	void inorder()
	{
		inorderUtil(this.root);
	}

	// Utility function for inorder traversal of
	// the tree
	void inorderUtil(Node node)
	{
		if (node == null)
			return;

		inorderUtil(node.left);
		System.out.print(node.data + " ");
		inorderUtil(node.right);
	}

	// adding new node
	public void insert(int data)
	{
		this.root = this.insertRec(this.root, data);
	}

	/* A utility function to insert a new node with
	given data in BST */
	Node insertRec(Node node, int data)
	{
		/* If the tree is empty, return a new node */
		if (node == null) {
			this.root = new Node(data);
			return this.root;
		}

		/* Otherwise, recur down the tree */
		if (data <= node.data) {
			node.left = this.insertRec(node.left, data);
		}
		else {
			node.right = this.insertRec(node.right, data);
		}
		return node;
	}

	// This class initialises the value of sum to 0
	public class Sum {
		int sum = 0;
	}

		// Driver Function
	public static void main(String[] args)
	{
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		// print inorder traversal of the modified BST
		tree.inorder();
	}
}

//This code is contributed by Kamal Rawal
