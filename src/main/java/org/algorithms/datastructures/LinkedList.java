package org.algorithms.datastructures;

import java.util.Iterator;

/**
 * @author Jorge L. Morla
 * */
public class LinkedList <E> implements List<E>{

	private long size = 0;
	
	private Node<E> head;
	
	private Node<E> tail;
	
	
	/**
	 * @param 
	 * */
	public void add(E e) {
		Node<E> n = new Node<E>(e);
		
		if(head == NULL) {
			head = n;
			tail = n;
		}else {
			tail.NEXT = n;
			tail = n;
		}
		
		size++;
	}

	/**
	 * Return items by its index
	 * Time complexity : O(n)
	 *  
	 * 
	 * @param index
	 * @return Item by index
	 * @throws IndexOutOfBoundsException
	 * 
	 * */
	public E get(int index) throws IndexOutOfBoundsException {
		if(size <= index)
			throw new IndexOutOfBoundsException("index: "+index+", size: "+size);
		
		int pos = 0;
		Node<E> n = head;
		while(pos < index) {
			pos++;
			n = n.NEXT;
		}
		
		return n.VALUE;
	}

	public boolean remove(E e) {
		
		if(head == NULL)
			return false;
		
		Node<E> n = head;
		
		if(n.VALUE == e) {
			if(head == tail) {
				head = null;
				tail = null;
			}else {
				head = head.NEXT;
			}
			
			size--;
			return true;
		}
		
		while(n.NEXT != NULL && n.NEXT.VALUE != e) {
			n = n.NEXT;
		}
		
		if(n.NEXT != NULL) {
			if(n.NEXT == tail) {
				tail = n;
			}
			
			n.NEXT = n.NEXT.NEXT;
			size--;
			return true;
		}
		
		return false;
	}

	public Iterator<E> iterator() {
		return null;
	}

	
	public boolean contains(E value) {
		Node<E> n = head;
		while(n != null && n.VALUE != value)
			n = n.NEXT;
		
		if(n != null)
			return true;
		
		return false;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArrayList[");
		
		if(head == null) {
			builder.append("]");
			return builder.toString();
		}
		
		Node<E> n = head;
		while(n != tail) {
			builder.append(n.VALUE).append(", ");
			n = n.NEXT;
		}
		builder.append(tail.VALUE).append("]");
		
		return builder.toString();
		
	}

	public long size() {
		return size;
	}
	
}
