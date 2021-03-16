import sun.reflect.generics.tree.Tree;

import java.util.HashMap;

/**
 * Author:Viper
 * Data:2021/3/10
 * description:
 */
public class problem07 {
    public class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    HashMap<Integer,Integer> map = new HashMap();
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i <preorder.length ; i++) {
            map.put(inorder[i],i);
        }
        return recur(0,0,inorder.length-1);
    }

    private TreeNode recur(int root, int left, int right) {
        if(left>right) return null;
        TreeNode node = new TreeNode(preorder[root]);
        int i = map.get(preorder[root]);
        node.left = recur(root+1,left,i-1);
        node.right = recur(i-left+root+1,i+1,right);
        return node;
    }
}
