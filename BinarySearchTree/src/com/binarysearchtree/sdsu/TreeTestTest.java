package com.binarysearchtree.sdsu;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeTestTest {

	@Test
	public void insertTest() {
		String[] months = {"a","i","b","f","h","m"};
		Tree tree = new Tree();
		for (int i = 0; i < months.length; i++)
			tree.insert(months[i]);
		assertEquals("m",tree.get("m").data);
	}
	
	
	@Test
	public void testMain() {
		String[] months = {"a","i","b","f","h","m"};
		Tree tree = new Tree();
		for (int i = 0; i < months.length; i++)
			tree.insert(months[i]);
		String result = " a b f h i m";
		assertEquals(result, tree.inorderTraversal());
	}

	@Test
	public void falseTest() {
		String[] months = {"a","i","i","f","h","m"};
		Tree tree = new Tree();
		for (int i = 0; i < months.length; i++)
			tree.insert(months[i]);
		String result = " a b f h i m";
		assertFalse(tree.inorderTraversal() == result);
	}


	@Test
	public void reverse() {
		String[] months = {"karen","bob","tom","ellen","hg","mg"};
		Tree tree = new Tree();
		for (int i = 0; i < months.length; i++)
			tree.insert(months[i]);
		String result = " ellen";
		assertEquals(result,tree.reverseorderTraversal());
	}

	@Test
	public void resultFalse() {
		String[] months = {"a","i","i","f","h","m"};
		Tree tree = new Tree();
		for (int i = 0; i < months.length; i++)
			tree.insert(months[i]);
		String result = " i a";
		assertFalse(tree.inorderTraversal() == result);



	}



}