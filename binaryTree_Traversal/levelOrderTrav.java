// package binaryTree_Traversal;
// import java.util.*;
// public class levelOrderTrav {
//     public static void main(String[] args) {
//         TreeNode t=new TreeNode(0, null, null);
        
//     }
// }
//     //Definition for a binary tree node.
//   public class TreeNode {
//       int val;
//       TreeNode left;
//     TreeNode right;
//     // TreeNode() {}
//     //  TreeNode(int val) 
//     //  { 
//     //     this.val = val;
//     //  }
//           TreeNode(int val, TreeNode left, TreeNode right) 
//      {
//           this.val = val;
//           this.left = left;
//           this.right = right;
//       }
//   }

// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>>ans=new ArrayList<>();
//         if(root==null){
//             return ans;
//         }
//        List<Integer>currAns=new ArrayList<>();

//         Queue<TreeNode> main=new ArrayDeque<>();
//         Queue<TreeNode> helper=new ArrayDeque<>();

//         main.add(root);

//         while(main.size()>0){
//             TreeNode temp=main.remove();

//             currAns.add(temp.val);

//             if(temp.left!=null){
//                 helper.add(temp.left);
//             }
//             if(temp.right!=null){
//                 helper.add(temp.right);
//             }
//             if(main.size()==0){
//                 ans.add(currAns);
//                 currAns=new ArrayList<>();

//                 Queue<TreeNode> temp2=main;
//                 main=helper;
//                 helper=temp2;
//             }
//         }
//            return ans;
//     }
// }
