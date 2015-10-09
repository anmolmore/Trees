package com.anmol.binarytree.excercise.test;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.anmol.binarytree.BinaryTree;
import com.anmol.binarytree.excercise.Search;
import com.anmol.binarytree.excercise.Search_Without_Recursion;


public class SearchTest {

	static BinaryTree tree;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tree = new BinaryTree();
		tree.add();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testFindMax() {
		Search search = new Search();
		assertEquals(7, search.findMax(tree.root));
	}
	
	@Test
	public void testFindMaxWithoutRecursion() {
		Search_Without_Recursion search = new Search_Without_Recursion();
		assertEquals(7, search.findMax(tree.root));
	}
	
	@Test
	public void testFindInTree() {
		Search search = new Search();
		assertTrue(search.findInTree(tree.root,86));
	}

	@Test
	public void testFindTreeSize() {
		Search_Without_Recursion search = new Search_Without_Recursion();
		assertEquals(search.findTreeSize(tree.root),7);
	}
}
