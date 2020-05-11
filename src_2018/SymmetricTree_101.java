
/**
 * Created by henry on 2018/8/9.
 */
public class SymmetricTree_101 {
    public static void main(String[] args){
        try {
            TreeNode ts = TreeNode.createSymmetricTree();
            SymmetricTree_101 st = new SymmetricTree_101();
            System.out.println(st.isSymmetric(ts));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        else return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left==null && right==null){
            return true;
        }else if(left==null || right==null || left.val!=right.val){
            return false;
        }else{
            return isSymmetric(left.left, right.right) &&
                    isSymmetric(left.right, right.left);
        }
    }
}
