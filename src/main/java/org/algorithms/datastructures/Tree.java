package org.algorithms.datastructures;

public interface Tree<E> {
	
	Object NULL = null;
	
	void insert(E e);
	
	boolean delete(E e);
	
	boolean contains(E e);

}
