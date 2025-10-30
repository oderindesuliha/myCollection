public class MyQueue {
    private String[] queueSize;
    private int count;


    public MyQueue(int size) {
        this.queueSize = new String[size];
        this.count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void add(String element) {
        if (count < queueSize.length) {
            queueSize[count] = element;
            count++;
        } else throw new IllegalArgumentException("Queue is full");
    }

    public String remove(String element) {
    String temp = queueSize[0];
        for (String counter : queueSize) {
            if (counter.equals(element)) {
                temp = counter;
                count--;
                return temp;
            }
        }
        return "Empty";
    }

    public int getSize() {
        return count + 1;
    }

    public String element(String index) {
        if(isEmpty()) throw new IllegalArgumentException("Queue is Empty");
        String temp = queueSize[0];
        for (String counter : queueSize) {
            if (counter.equals(index)) {
                temp = counter;
                return temp;
            }
        }
        return "Empty";
    }

    public boolean offer(String element) {
        if (count < queueSize.length) {
            queueSize[count] = element;
            count++;
            return true;
        } else return false;
    }


    public String peek() {
            if (isEmpty()) return null;
            return queueSize[0];

    }

}
