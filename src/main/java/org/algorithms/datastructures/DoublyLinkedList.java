package org.algorithms.datastructures;

import java.util.Iterator;

/**
 * @author Jorge L. Morla
 * @version 1.0
 * 
 * 
 * */
public class DoublyLinkedList<E> implements List<E> {

	private int size;
	
	private Node<E> head;
	
	private Node<E> tail;
	
	
	public void add(E e) {
		Node<E> node = new Node<E>(e);
		if(head == NULL) {
			head = node;
			tail = node;
		}else {
			node.PREV = tail;
			tail.NEXT = node;
			tail = node;
		}
		
		size++;
		
	}

	public E get(int index) {
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
		
		if(head.VALUE == e) {
			if(head == tail) {
				head = null;
				tail = null;
			}else {
				head = head.NEXT;
				head.PREV = null;
			}
			size--;
			return true;
		}
		
		Node<E> n = head.NEXT;
		
		while(n != NULL && n.VALUE != e) {
			n = n.NEXT;
		}
		
		if(n == tail) {
			tail = tail.PREV;
			tail.NEXT = null;
			
			size--;
			return true;
			
		}else if(n != NULL) {
			n.PREV.NEXT = n.NEXT;
			n.NEXT.PREV = n.PREV;
			
			size--;
			return true;
		}
		
		return false;
	}

	public boolean contains(E value) {
		// TODO Auto-generated method stub
		return false;
	}

	public long size() {
		return size;
	}
	
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}
