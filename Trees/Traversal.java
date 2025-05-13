import javax.swing.tree.TreeNode;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Traversal {
    Node root;

    // Constructor
    public Traversal() {
        root = null;
    }

    // Insert method (for a Binary Search Tree)
    public Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
    if (root != null) {
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
    }
}


    void postorder(Node root) {
    if (root != null) {
    preorder(root.left);
    preorder(root.right);
    System.out.print(root.data + " ");
    }
}

    public static void main(String[] args) {
        Traversal tree = new Traversal();


        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Printing the inorder traversal
        System.out.println("Inorder traversal of binary tree:");
        tree.inorder(tree.root);
    }
}
