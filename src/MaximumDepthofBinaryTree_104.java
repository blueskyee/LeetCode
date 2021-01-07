/**
 * Created by henry on 2021/1/7.
 */
public class MaximumDepthofBinaryTree_104 {

    public int maxDepth(_TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
