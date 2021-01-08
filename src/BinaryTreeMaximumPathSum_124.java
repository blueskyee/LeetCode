/**
 * Created by henry on 2021/1/8.
 */
public class BinaryTreeMaximumPathSum_124 {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(_TreeNode root) {
        maxCurNodeSum(root);
        return maxSum;
    }

    private int maxCurNodeSum(_TreeNode node){
        if(node == null)
            return 0;
        int leftSum = Math.max(maxCurNodeSum(node.left), 0);
        int rightSum = Math.max(maxCurNodeSum(node.right), 0);

        maxSum = Math.max(maxSum, node.val + leftSum + rightSum);
        return node.val + Math.max(leftSum, rightSum);
    }
}
