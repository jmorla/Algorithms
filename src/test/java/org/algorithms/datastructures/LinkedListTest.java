package org.algorithms.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void shouldAddElements() {
        List<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

    }

    @Test
    public void shouldContainsElements() {
        List<String> list = new LinkedList<>();
        list.add("Hello world");

        assertTrue(list.contains("Hello world"));
    }

    @Test
    public void shouldRemoveElement() {
        List<Integer> list = new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.remove(40);
    }

    @Test
    public void testingUtilArrayList() {

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);

        Assert.assertEquals((Integer)10, list.get(0));
    }
}
