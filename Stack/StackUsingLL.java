
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLL {
    

    // public StackUsingLL() {
    //     this.top = null;
    // }
    // Node top = null;
    private Node top = null;
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Element added in stack");
    }

    public int pop() {
        if (top == null) {
            System.out.println("Nothing to delete");
            return -1;
        } else {
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public void peek() {
        if (top == null) {
            System.out.println("No peek element");
        } else {
            System.out.println("Data at top = " + top.data);
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Nothing to print");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.println(" | " + temp.data + " | ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackUsingLL stack = new StackUsingLL();
        int choice, data;

        while (true) {
            System.out.println("Enter choice:");
            System.out.println("1 - Push");
            System.out.println("2 - Pop");
            System.out.println("3 - Peek");
            System.out.println("4 - Display");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter data to be pushed:");
                    data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    data = stack.pop();
                    if (data != -1) {
                        System.out.println("Data deleted is: " + data);
                    }
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
