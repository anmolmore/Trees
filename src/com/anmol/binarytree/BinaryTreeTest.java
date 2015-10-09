package com.anmol.binarytree;

import com.anmol.binarytree.excercise.Search;

public class BinaryTreeTest {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		//tree.preOrder(tree.root);
		tree.preOrderNonRecursive(tree.root);
		
		Search search = new Search();
		System.out.println(search.findMax(tree.root));
	}
}
