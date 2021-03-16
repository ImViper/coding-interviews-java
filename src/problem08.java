/**
 * Author:Viper
 * Data:2021/3/10
 * description:
 */
public class problem08 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        // 第一种情况
        if (pNode.right != null) {
            TreeLinkNode rNode = pNode.right;
            while (rNode.left != null) {
                rNode = rNode.left;
            }
            return rNode;
        } else {
            // 第二种情况
            while (pNode.parent != null) {
                TreeLinkNode parentNode = pNode.parent;
                if (parentNode.left == pNode) {
                    return parentNode;
                }
                pNode = pNode.parent;

            }

        }
        return null;
    }

    private class TreeLinkNode {
        TreeLinkNode left;
        TreeLinkNode right;
        TreeLinkNode parent;
    }
}
