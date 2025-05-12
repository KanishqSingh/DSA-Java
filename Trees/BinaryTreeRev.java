
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BinaryTreeRev {
    Node root;

    BinaryTreeRev() {
        root = null;
    }

    public Node insert(Node root , int data){
        if(root == null){
            root = new Node(data);
            return root;
            
        } 
        else{

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        }
        return root;
    }

    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }

        public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

    
        System.out.println("Inorder traversal of binary tree:");
        tree.inorder(tree.root);
    }


    
}
