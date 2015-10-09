package com.anmol.binarytree.excercise;

import com.anmol.binarytree.BinaryTreeNode;

public class Search {
	int max = 0;
	
	public int findMax(BinaryTreeNode root) {
		if(root!=null) {
			int root_val = root.getData();
			int left_val = findMax(root.getLeft());
			int right_val = findMax(root.getRight());
			
			//compare
			if(left_val > right_val) {
				max = left_val;
			}
			else {
				max = right_val;
			}
			if(root_val > max) {
				max = root_val;
			}
		}
		return max;
	}
	
	public boolean findInTree(BinaryTreeNode root, int data) {
		boolean temp;
		if(root!=null) {
			int root_val = root.getData();
			if(root_val == data)
				return true;
			else {
				boolean left = findInTree(root.getLeft(), data);
				if(left!=true) {
					boolean right = findInTree(root.getRight(), data);
					return right;
				}
				else
					return true;
			}
		}
		return false;
	}
}
