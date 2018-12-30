/**
 * Created by henry on 2018/12/30.
 */
public class DiameterofBinaryTree_543 {
    public static void main(String[] args){
        TreeNode nd = null;
        try {
            nd = TreeNode.createSampleTree2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        DiameterofBinaryTree_543 db = new DiameterofBinaryTree_543();
        System.out.println(db.diameterOfBinaryTree(nd));
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int dia = maxDepth(root.left) + maxDepth(root.right);
        int lDia = diameterOfBinaryTree(root.left);
        int rDia = diameterOfBinaryTree(root.right);
        return Math.max(dia, Math.max(lDia,rDia));
    }

    private int maxDepth(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
