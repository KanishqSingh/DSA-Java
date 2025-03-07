import java.util.LinkedList;
import java.util.Queue;

class StackUsingSingleQueue {
    private Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        int size = queue.size();
        queue.add(x);
        
        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.remove();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue stack = new StackUsingSingleQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.top()); 
        System.out.println(stack.pop()); 
        System.out.println(stack.top()); 
        System.out.println(stack.isEmpty()); 
    }
}
