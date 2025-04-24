public class TwoStackRevision {

    int[] stack;
    int top;
    int top2;
    int size, mid;

    TwoStackRevision(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
        this.mid = size / 2;
        this.top2 = mid + 1;
    }

    void push(int data) {
        if (top < mid - 1) {
            stack[++top] = data;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }

    void push2(int data) {
        if (top2 < size) {
            stack[top2++] = data;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    void display() {
        System.out.println("First Stack:");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        System.out.println("\nSecond Stack:");
        for (int i = mid + 1; i < top2; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    public static void main(String[] args) {
        TwoStackRevision stack = new TwoStackRevision(10);
        stack.push(1);
        stack.push2(2);
        stack.push(3);
        stack.push2(4);
        stack.push(5);
        stack.push2(6);
        stack.push(7);
        stack.push2(8);

        stack.display();
    }
}
