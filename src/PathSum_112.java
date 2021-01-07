/**
 * Created by henry on 2020/11/4.
 */
public class PathSum_112 {
    public static void main(String[] args) throws Exception {
        _TreeNode tn = _TreeNode.createBST();
        PathSum_112 ps = new PathSum_112();
        System.out.println(ps.hasPathSum(tn, 22));
    }

    public boolean hasPathSum(_TreeNode root, int sum) {
        if(root == null) return false;
        if(sum - root.val == 0 && root.left==null && root.right==null){
            return true;
        }else{
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}
