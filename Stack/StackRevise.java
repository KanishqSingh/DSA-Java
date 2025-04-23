import java.util.*;

public class StackRevise {

    static int[] arr = new int[5];
    static int top = -1;

    public static void push(int data) {
        if(top == arr.length - 1){
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = data;
            System.out.println("Element added: " + data);
        }
    }

    public static int pop() {
        if(top == -1){
            System.out.println("Stack is empty");
            return -1;
        } else {
            int data = arr[top];
            top--;
            System.out.println("Popped element: " + data);
            return data;
        }
    }

    public static void display() {
        if(top == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack contents:");
            for(int i = 0; i <= top; i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple menu for testing
        while(true){
            System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter element to push: ");
                    int data = sc.nextInt();
                    push(data);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
