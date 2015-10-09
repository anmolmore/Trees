package com.anmol.binarytree.excercise;

import java.util.LinkedList;
import java.util.Queue;

import com.anmol.binarytree.BinaryTreeNode;

public class Search_Without_Recursion {

	public int findMax(BinaryTreeNode root) {
		int max = -1;
		
		Queue Q = new LinkedList();
		Q.add(root);
		while(!Q.isEmpty()) {
			BinaryTreeNode temp = (BinaryTreeNode) Q.remove();
			if(max < temp.getData());
				max = temp.getData();
			if(temp.getLeft() != null) {
				Q.add(temp.getLeft());
			}
			if(temp.getRight() != null) {
				Q.add(temp.getRight());
			}
		}
		Q.clear();
		return max;
	}
	
	public int findTreeSize(BinaryTreeNode root) {
		int size = 0;
		Queue Q = new LinkedList();
		Q.add(root);
		while(!Q.isEmpty()) {
			BinaryTreeNode temp = (BinaryTreeNode) Q.remove();
			size++;
			if(temp.getLeft() != null) {
				Q.add(temp.getLeft());
			}
			if(temp.getRight() != null) {
				Q.add(temp.getRight());
			}
		}
		Q.clear();
		return size;
	}
}