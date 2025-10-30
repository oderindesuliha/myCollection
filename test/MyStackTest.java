import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {


    @Test
    public void testThatStackIsEmpty() {
        MyStack stack = new MyStack(3);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testToPushElementsToStack() {
        MyStack stack = new MyStack(3);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertFalse(stack.isEmpty());
    }


    @Test
    public void testToPush3ElementsAndPop1Element() {
        MyStack stack = new MyStack(3);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        assertEquals(9, stack.pop());
    }

    @Test
    public void testToPushElementFourElementsAndStackIsFull() {
        MyStack stack = new MyStack(3);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        IllegalArgumentException response = assertThrows(IllegalArgumentException.class, () -> {
            stack.push(10);
        });
        assertEquals("Stack Overflow", response.getMessage());
    }

    @Test
    public void
    testToPush3ElementsAndPopElement() {
        MyStack stack = new MyStack(3);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        assertEquals(9, stack.pop());
    }

    @Test
    public void testToPeekElementFromStack() {
        MyStack stack = new MyStack(3);
        stack.push(15);
        stack.push(35);
        stack.push(70);
        assertEquals(70, stack.peek());

    }

    @Test
    public void testToReturnExceptionWhenYouPeekFromAnEmptyStack() {
        MyStack stack = new MyStack(3);
        IllegalArgumentException response = assertThrows(IllegalArgumentException.class, () -> {stack.peek();});
        assertEquals("Stack is Empty", response.getMessage());

    }

    @Test
    public void testToReturnTheLastElementWhenYouPeekFromAStack() {
        MyStack stack = new MyStack(3);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        assertEquals(9, stack.peek());
    }

    @Test
    public void testToSearchFromTheStack() {
        MyStack stack = new MyStack(3);
        stack.push(5);
        stack.push(8);
        stack.push(9);
        assertEquals(-1, stack.search(50));

    }

}
