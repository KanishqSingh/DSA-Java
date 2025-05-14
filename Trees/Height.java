
class Node {
    int data;
    Node left, right;
    
    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Height {

    Node root;

    int height(Node node) {
        if (node == null) {
            return -1;  // Use 0 if you want to count nodes instead of edges
        } else {
            int leftheight = height(node.left);
            int rightheight = height(node.right);
            return Math.max(leftheight, rightheight) + 1;
        }
    }

    public static void main(String[] args) {
        Height tree = new Height();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is: " + tree.height(tree.root));
    }
}
