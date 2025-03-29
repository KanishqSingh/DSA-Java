class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1; 
    }


    private boolean isFull() {
        return size == capacity;
    }

   
    private boolean isEmpty() {
        return size == 0;
    }


    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity; 
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued.");
    }

  
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity; 
        size--;
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
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

 
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60); 

        cq.display();
        cq.dequeue();
        cq.dequeue();
        cq.display();

        cq.enqueue(60);
        cq.enqueue(70);
        cq.display();
    }
}
