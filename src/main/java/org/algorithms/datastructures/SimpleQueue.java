package org.algorithms.datastructures;

/**
 *
 * @author jmorla FIFO
 */
public class SimpleQueue<T> implements Queue<T> {

    private static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;

    private Object[] elements; // contains all the elements in the queue;

    private int last; // point to the last index

    public SimpleQueue() {
        this(8);
    }

    private SimpleQueue(int initialSize) {
        elements = new Object[initialSize];
        last = -1;
    }

    @Override
    public boolean offer(T t) {
        if (t == null) {
            throw new NullPointerException(); // fail safe
        }
        if (elements.length == MAX_CAPACITY) {
            return false;
        }

        if (elements.length > (last + 1)) {
            last++;
            elements[last] = t;
        } else {
            grow(); // grows if needed
            last++;
            elements[last] = t;
        }

        return true;
    }

    /**
     * grows the elements array if the elements array is lower than 64 then grow
     * x2 otherwise grow 50%
     */
    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity;
        if (oldCapacity < 64) { // determinate which strategy will use
            newCapacity = oldCapacity * 2;
        } else {
            newCapacity = oldCapacity + (oldCapacity / 2);
        }
        // copy the old array in a new with more capacity
        Object[] newElements = new Object[newCapacity];
        copy(elements, newElements);
        elements = newElements;
    }

    private static void copy(Object[] from, Object[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    @Override
    public T peek() {
        if (last == -1) {
            return null;
        }

        return (T) elements[last];

    }

    @Override
    public T poll() {
        if (last == -1) {
            return null;
        }

        T t = (T) elements[last];
        elements[last] = null;
        last--;
        return t;
    }

}
