
package org.algorithms.datastructures;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jmorla
 */
public class SimpleQueueTest {
    
    
    @Test
    public void whenOfferAndElement_TheElementIsInTheQueue() {
        
        Queue<Integer> queue = new SimpleQueue<>();
        queue.offer(10);
        
        Assert.assertEquals((Integer)10, queue.peek());
    }
    
    @Test
    public void whenPollQueueWithSingleElement_ThenQueueIsEmpty() {
        
        Queue<Integer> queue = new SimpleQueue<>();
        queue.offer(10);
        queue.poll();
        
        Assert.assertNull(queue.poll());
    }
    
    
    @Test
    public void whenPeekQueueWithSingleElement_ThenStillHasOneElement() {
        
        Queue<Integer> queue = new SimpleQueue<>();
        queue.offer(20);
        queue.peek();
        
        Assert.assertNotNull(queue.peek());
    }
    
    @Test(expected = NullPointerException.class)
    public void whenOfferNull_ThenQueueThrowNullPointerException() {
        
        Queue<Integer> queue = new SimpleQueue<>();
        queue.offer(null);
    }
    
    @Test
    public void whenOffering_GivenBoundaryLimit_GrowCapacity() {
        Queue<Integer> queue = new SimpleQueue<>();
        IntStream.range(0, 100).forEach(queue::offer);
        
    }
}
