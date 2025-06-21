
class Node {
    Node left;
    int data;
    Node right;

     Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}

public class SumFromRootToLeaf {
    Node root;

    SumFromRootToLeaf() {
        root = null;
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Core logic: calculate sum of all root-to-leaf numbers
    public int sumRootToLeaf(Node root, int val) {
        if(root == null) 
        {return 0;
        }
   
        
        val = val *10 + root.data;

        if(root.left == null && root.right == null){
            return val;
        }

        return sumRootToLeaf(root.left, val) + sumRootToLeaf(root.right, val);

  
    }

    public static void main(String[] args) {
        SumFromRootToLeaf tree = new SumFromRootToLeaf();
        
        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 15);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 7);
        tree.insert(tree.root, 12);
        tree.insert(tree.root, 18);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        int totalSum = tree.sumRootToLeaf(tree.root, 0);
        System.out.println("Sum of Root-to-Leaf Paths: " + totalSum);
    }
}
