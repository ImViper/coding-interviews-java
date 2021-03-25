/**
 * Author:Viper
 * Data:2021/3/24
 * description:
 */
public class problem26 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null && B!=null) && (recur(A,B) || isSubStructure(A.left,B) || isSubStructure(A.right,B));
    }
    public boolean recur(TreeNode A,TreeNode B){
        if(B==null) return true;
        if(A==null || A.val != B.val) return false;
        return recur(A.left,B.left) && recur(A.right,B.right);
    }
}
