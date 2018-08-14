/**
 * Created by henry on 2018/8/14.
 */
public class MaxDepthOfBT_104 {
    public static void main(String[] args){
        try {
            TreeNode tn = TreeNode.createSampleTree();
            MaxDepthOfBT_104 md = new MaxDepthOfBT_104();
            System.out.println(md.maxDepth(tn));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return leafDepth(root, 0);
        }
    }

    public int leafDepth(TreeNode tn, int depth){
        if(tn == null){
            return depth;
        }else{
            return Math.max(leafDepth(tn.left, depth+1),
                    leafDepth(tn.right, depth+1));
        }
    }

}
