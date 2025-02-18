import java.util.Scanner;

class Stack {
    private static final int MAX = 10;
    private int[] stack = new int[MAX];
    private int top = -1;

    public void push(int data) {
        if (top == MAX - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
            System.out.println("Element added in stack");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Nothing to delete");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("No peek element");
        } else {
            System.out.println("Data at top = " + stack[top]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Nothing to print");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
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