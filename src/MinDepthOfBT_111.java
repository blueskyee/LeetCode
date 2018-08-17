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
        } else{
            return leafDepth(root, 0);
        }
    }

    public int leafDepth(TreeNode tn, int depth){
        if (tn == null){
            return depth;
        }else{
            return Math.min(leafDepth(tn.left, depth+1),
                    leafDepth(tn.right, depth+1));
        }
    }
}
