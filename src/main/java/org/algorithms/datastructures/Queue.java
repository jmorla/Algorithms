package org.algorithms.datastructures;

/**
 * @author Jorge L. Morla
 * 
 * Queue implementation
 * @param <T>
 */
public interface Queue<T> {

    /**
     * Add Element to the end of the queue
     * @param t element to be added
     * @return if success
     */
    boolean offer(T t);
    
    
    /**
     * return the next element in the queue
     * if queue empty then return null;
     * 
     * @return T the element to be returned
     */
    T peek();
    
    /**
     * return and remove the next element
     * if queue is empty then return null
     * 
     * @return T the element to be returned
     */
    T poll();
}
