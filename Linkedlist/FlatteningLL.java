
class Node {
    int data;
    Node next, child;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }
}

class FlatteningLL {
    public Node flatten(Node head) {
        if (head == null) return null;
        Node dummy = new Node(0), prev = dummy;
        Stack<Node> stack = new Stack<Node>();
        stack.push(head);

        while (!stack.isEmpty()) {
            Node curr = stack.pop();
            prev.next = curr;
            prev = curr;
            if (curr.next != null) stack.push(curr.next);
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
        }
        return dummy.next;
    }
}
