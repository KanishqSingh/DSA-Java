public class Queue {

    private int[] queue;
    private int front, end, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.end = 0;
    }

    private boolean isFull() {
        return end == capacity;
    }

    private boolean isEmpty() {
        return front == end;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        queue[end++] = item;
        System.out.println(item + " enqueued.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front++];
        System.out.println(item + " dequeued.");
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i < end; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); 
        q.display();

        q.dequeue();
        q.dequeue();
        q.display();

        q.enqueue(60); 
        q.enqueue(70);
        q.display();
    }
}
