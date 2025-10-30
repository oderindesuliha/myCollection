public class MyStack {
    private int[] stackSize;
    private int count;


    public MyStack(int size) {
        this.stackSize = new int[size];
        this.count = 0;
    }

    public boolean isEmpty() {

        return count == 0;
    }

    public void push(int element) {
        if (count < stackSize.length) {
            stackSize[count] = element;
            count++;
        } else throw new IllegalArgumentException("Stack Overflow");

    }

    public int pop() {
        return stackSize[--count];

    }

    public int peek() {
        if (isEmpty()) throw new IllegalArgumentException("Stack is Empty");
        return stackSize[count - 1];
    }

    public int search(int element) {
        for (int counter : stackSize)
            if (element == counter)
                return element;
        return -1;
    }

}


