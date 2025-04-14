import java.util.Stack;


public class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

     void push(int val){

        st.push(val);
        if(minstack.isEmpty() || val <= minstack.peek() ){
            minstack.push(val);
        }
    } 

    void pop(){
        int removed = st.pop();
        if(removed == minstack.peek()){
            minstack.pop();
        }
    }

    int top(){
        return st.peek();
    }

     int getmin(){
       return minstack.peek();
    }

    public static void main(String[] args) {

        MinStack stack = new MinStack();
        stack.push(-3);
        stack.push(0);
        stack.push(2);
        stack.push(-8);



        System.out.println("MINIMUM --> " + stack.getmin());

        stack.pop();

        System.out.println("TOP --> " + stack.top());

        System.out.println("MINIMUM --> " + stack.getmin());

        
    }
    
}
