/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // 传入的俩参数是某二叉树的前序遍历和中序遍历的结果，要求重建二叉树，并且返回起根节点
        // 前序：根左右 中序：左根右
        // 关键就在于有一个中序遍历，只要有这个就可以区分节点是在左子树还是右子树上
        TreeNode t = new TreeNode();
        // 检查遍历结果是否为空
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        // 给根节点赋值为前序遍历第一元素（前序的第一个一定是根节点）
        t.val = preorder[0];
        // 遍历中序遍历的结果，找到根节点的位置
        for (int i = 0; i < inorder.length; i++) {
            // 这里循环的目的是找到根节点的位置，然后将中序遍历的结果分为左右子树
            // i就是根节点位置
            if (inorder[i] == t.val) {
                // 找到根节点后，将中序遍历的结果分为左右子树
                // Arrays.copyOfRange()方法是将数组中的某一部分拷贝到一个新的数组中
                // 左子树
                // 在前序遍历结果中截取左子树 想重建左子树需要传入前序遍历中根节点到分界位置的所有元素
                int[] left_pre = Arrays.copyOfRange(preorder, 1, i + 1);
                // 在中序遍历结果中截取左子树 想重建左子树需要传入中序遍历左半的所有元素
                int[] left_in = Arrays.copyOfRange(inorder, 0, i);
                // 右子树 想重建右子树只需要传入右子树的前序遍历和中序遍历结果就行
                int[] right_pre = Arrays.copyOfRange(preorder, i + 1, preorder.length);
                int[] right_in = Arrays.copyOfRange(inorder, i + 1, inorder.length);
                // 递归重建左右子树 分别传入的是重建左右子树能用到的信息就行
                t.left = buildTree(left_pre, left_in);
                t.right = buildTree(right_pre, right_in);
                // 返回根节点
                return t;
            }
        }
        return null;
    }
}