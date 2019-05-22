package org.algorithms.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTreeTest {
	
	
	@Test
	public void shouldInsertElementsInOrder() {
		Tree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(10);
		tree.insert(5);
		tree.insert(20);
		
		assertTrue(tree.contains(10));
		assertTrue(tree.contains(5));
		assertTrue(tree.contains(20));
	}
	
	@Test
	public void shouldDeleteElement() {
		Tree<Integer> tree = new BinarySearchTree<Integer>();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(6);
		tree.insert(12);
		
		tree.delete(10);
		
	}

}
