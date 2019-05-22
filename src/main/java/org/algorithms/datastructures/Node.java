package org.algorithms.datastructures;

/**
 * @author Jorge L. Morla
 * @version 1.0
 * @since
 * */
public class Node<T> {

	protected T VALUE;
	
	protected Node<T> NEXT;
	protected Node<T> PREV;
	
	public Node(T value) {
		this.VALUE = value;
	}	
}
