import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    @Test
    public void testThatQueueIsEmpty() {
        MyQueue queue = new MyQueue(2);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testThatQueueIsNotEmpty() {
        MyQueue queue = new MyQueue(2);
        queue.add("car");
        queue.add("bike");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testThatThrowsAnExceptionWhenTheQueueIsFull() {
        MyQueue queue = new MyQueue(2);
        queue.add("car");
        queue.add("bus");
        IllegalArgumentException response = assertThrows(IllegalArgumentException.class, () -> {
             queue.add("bike");
         });
            assertEquals("Queue is full", response.getMessage());
        }

    @Test
    public void thatQueueCanRemoveElementsThatWentInFirst(){
        MyQueue queue = new MyQueue(3);
        queue.add("car");
        queue.add("bus");
        queue.add("bike");
        assertEquals("car", queue.remove("car"));
        assertEquals(2, queue.getSize());
    }

    @Test
    public void thatQueueCanElementTheFirstIndex(){
        MyQueue queue = new MyQueue(3);
        queue.add("car");
        queue.add("bike");
        queue.add("bus");
        assertEquals("car", queue.element("car"));
        assertEquals(3, queue.getSize());
    }

    @Test
    public void thatQueueCanOfferAnElement() {
        MyQueue queue = new MyQueue(3);
        assertTrue(queue.offer("car"));
        assertTrue(queue.offer("bus"));
        assertTrue(queue.offer("bike"));
        assertFalse(queue.offer("truck"));
        assertEquals(3, queue.getSize());
    }

    @Test
    public void thatQueueCanPeekAtElement() {
        MyQueue queue = new MyQueue(2);
        queue.add("car");
        queue.add("bus");

        assertEquals("car", queue.peek());
    }

    @Test
    public void thatQueueAddToTheQueueAfterElementIsRemovedFromTheQueue(){
        MyQueue queue = new MyQueue(5);
            queue.add("car");
            queue.add("2");
            queue.add("bus");
            queue.remove("car");
            assertEquals(5,queue.getSize());
            queue.add("bike");
            assertEquals(5,queue.getSize());

        }
}