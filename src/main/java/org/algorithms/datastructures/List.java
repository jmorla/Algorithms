package org.algorithms.datastructures;

/**
 * @author Jorge L. Morla
 * @version 1.0
 * @since 2019
 * */
public interface List <T> extends Iterable<T> {

	Object NULL = null;
	
	/**
	 * Add items at the end of the list
	 * Time complexity {@code O(1)}
	 * 
	 * @param T element to be added {@code T}
	 * */
	void add(T t);
	
	/**
	 * Gets items by index
	 * Time complexity {@code O(n)}
	 * 
	 * @param index
	 * */
	T get(int index);
	
	
	/**
	 * Removes an item by its index
	 * Time complexity {@code O(n)}
	 * 
	 * @param index
	 * @return boolean
	 */
	boolean remove(T t);
	
	
	/**
	 * Check if an item already exist
	 * Time complexity {@code O(n)}
	 * 
	 * @param value
	 * */
	boolean contains(T value);
	
	/**
	 * Returns the size of the list
	 * */
	long size();

}
