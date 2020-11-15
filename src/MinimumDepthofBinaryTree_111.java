/**
 * Created by henry on 2020/11/15.
 */
public class MinimumDepthofBinaryTree_111 {
    public static void main(String[] args){
        try {
            TreeNode tn = TreeNode.createBST();
            MinimumDepthofBinaryTree_111 md = new MinimumDepthofBinaryTree_111();
            System.out.println(md.minDepth(tn));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int leftDep = minDepth(root.left);
        int rightDep = minDepth(root.right);
        return (leftDep == 0 || rightDep == 0) ? (leftDep + rightDep + 1) : Math.min(leftDep, rightDep) + 1;
    }
}
