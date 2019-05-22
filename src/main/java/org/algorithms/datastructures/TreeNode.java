package org.algorithms.datastructures;

/**
 * @author Jorge L. Morla
 * @version v1.0
 * */
public class TreeNode<E>{
	
	private E value;
	
	private TreeNode<E> left;
	
	private TreeNode<E> right;

	public TreeNode() {}
	
	public TreeNode(E e) {
		this.value = e;
	}
	
	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public TreeNode<E> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}

	public TreeNode<E> getRight() {
		return right;
	}

	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
}
