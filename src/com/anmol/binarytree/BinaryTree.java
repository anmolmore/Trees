package com.anmol.binarytree;

import java.util.Stack;

public class BinaryTree {
	
	public BinaryTreeNode root;
	
	public BinaryTree() {
		add();
	}
	
	public void add() {
		this.root = new BinaryTreeNode(1);
		this.root.setLeft(new BinaryTreeNode(2));
		this.root.setRight(new BinaryTreeNode(3));
		BinaryTreeNode rootLeft = this.root.getLeft();
		BinaryTreeNode rootRight = this.root.getRight();
		
		rootLeft.setLeft(new BinaryTreeNode(4));
		rootLeft.setRight(new BinaryTreeNode(5));
		
		rootRight.setLeft(new BinaryTreeNode(6));
		rootRight.setRight(new BinaryTreeNode(7));
	}
	
	public void insert(BinaryTreeNode root, int data) {
		if(this.root == null) {
			BinaryTreeNode rootNode = new BinaryTreeNode(data, null, null);
			this.root = rootNode;
			return;
		}
		if(root.getData() < data){
			if(this.root.getLeft() == null) {
				BinaryTreeNode rootNode = new BinaryTreeNode(data, null, null);
				root.setLeft(rootNode);
				return;
			}
			else {
				insert(root.getLeft(),data);
			}
		}
		else {
			if(root.getRight() == null) {
				BinaryTreeNode rootNode = new BinaryTreeNode(data, null, null);
				root.setRight(rootNode);
				return;
			}
			else {
				insert(root.getRight(),data);
			}
		}
	}
	
	public void preOrder(BinaryTreeNode root) {
		if(root != null) {
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}
	
	public void preOrderNonRecursive(BinaryTreeNode root) {
		Stack<BinaryTreeNode> s = new Stack<BinaryTreeNode>();
		while(true) {
			while(root != null) {
				System.out.println(root.getData());
				s.push(root);
				root = root.getLeft();
			}
			if(s.isEmpty())
				break;
			root = (BinaryTreeNode) s.pop();
			root = root.getRight();
		}
	}
	
	public void inOrder(BinaryTreeNode root) {
		if(root != null) {
			inOrder(root.getLeft());
			System.out.println();
			inOrder(root.getRight());
		}
	}
	
	//TODO 
	public void inOrderNonRecursive(BinaryTreeNode root) {
		if(root == null) return;
		Stack<BinaryTreeNode> s = new Stack();
		while(true) {
			while(root != null) {
				s.push(root);
				
			}
		}
	}
}
