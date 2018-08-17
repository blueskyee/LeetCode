/**
 * Created by henry on 2018/8/17.
 */
public class MinDepthOfBT_111 {
    public static void main(String[] arg){
        try {
            TreeNode tn = TreeNode.createSampleTree();
            MinDepthOfBT_111 md = new MinDepthOfBT_111();
            System.out.println(md.minDepth(tn));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        } else if(root.left == null && root.right == null){
            return 1;
        }else if(root.left == null){
            return minDepth(root.right)+1;
        }else if(root.right == null){
            return minDepth(root.left)+1;
        }else{
            return Math.min(minDepth(root.left),
                    minDepth(root.right))+1;
        }
    }

}
