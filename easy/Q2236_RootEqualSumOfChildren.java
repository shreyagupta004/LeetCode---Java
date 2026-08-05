package easy;

import javax.swing.tree.TreeNode;

public class Q2236_RootEqualSumOfChildren {
    public static void main(String[] args) {
    
         Q2236_RootEqualSumOfChildren obj = new Q2236_RootEqualSumOfChildren();
           TreeNode root = new TreeNode(10);
           root.left = new TreeNode(4);
           root.right = new TreeNode(6);

            System.out.println(obj.checkTree(root));
    
        
    }


     public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


     public static boolean checkTree(TreeNode root) {
        if(root.val == root.left.val + root.right.val){
            return true;
        }else{
            return false;
        }
    }
}
