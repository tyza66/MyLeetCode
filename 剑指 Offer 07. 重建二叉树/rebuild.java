/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //传入的俩参数是某二叉树的前序遍历和中序遍历的结果，要求重建二叉树，并且返回起根节点
        //前序：根左右 中序：左根右
        //关键就在于有一个中序遍历，只要有这个就可以区分节点是在左子树还是右子树上
        TreeNode t = new TreeNode();
        //检查遍历结果是否为空
        if(preorder.length == 0 || inorder.length == 0) return null;
        //给根节点赋值为前序遍历第一元素（前序的第一个一定是根节点）
        t.val = preorder[0];
        //遍历中序遍历的结果，找到根节点的位置
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == t.val){
                //找到根节点后，将中序遍历的结果分为左右子树
                //左子树
                int[] left_pre = Arrays.copyOfRange(preorder, 1, i+1);
                int[] left_in = Arrays.copyOfRange(inorder, 0, i);
                //右子树
                int[] right_pre = Arrays.copyOfRange(preorder, i+1, preorder.length);
                int[] right_in = Arrays.copyOfRange(inorder, i+1, inorder.length);
                //递归重建左右子树
                t.left = buildTree(left_pre, left_in);
                t.right = buildTree(right_pre, right_in);
                //返回根节点
                return t;
            }
        }
        return null;
    }
}