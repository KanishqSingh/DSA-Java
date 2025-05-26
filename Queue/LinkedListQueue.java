
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListQueue {
    private Node front, rear;

    public LinkedListQueue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); 

        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Front element: " + queue.peek()); 

            queue.display(); 
    }
}
