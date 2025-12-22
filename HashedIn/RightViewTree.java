// import java.util.ArrayList;
// import java.util.List;

// import javax.swing.tree.TreeNode;

// public class RightViewTree {
    
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class RightView {
//     List<Integer> list = new ArrayList<>();
//     public void dfs(TreeNode node,int level){
//         if(node == null){
//             return;
//         }
//         if(level == list.size()){
//             list.add(node.val);
//         }
//         dfs(node.right,level+1);
//         dfs(node.left,level+1);

//     }

//     public List<Integer> rightSideView(TreeNode root) {

//         dfs(root,0);
//         return list;

        
//     }
// }
// }
