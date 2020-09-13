/**
 * Created by henry on 2020/9/12.
 */
public class DiameterofBinaryTree_543 {
    public static void main(String[] args){
        try {
            TreeNode tr = TreeNode.createSampleTree();
            DiameterofBinaryTree_543 db = new DiameterofBinaryTree_543();
            System.out.println(db.diameterOfBinaryTree(tr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        int localDist = maxDepth(root.left) + maxDepth(root.right);
        int leftLocalDist = diameterOfBinaryTree(root.left);
        int rightLocalDist = diameterOfBinaryTree(root.right);

        return Math.max(localDist, Math.max(leftLocalDist, rightLocalDist));
    }

    private int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left),
                          maxDepth(root.right));
    }

}
