import java.util.LinkedList;

/**
 * Created by blueskyee on 2016/2/25.
 */
public class PathSum_29 {
    public static void main(String[] args) {
        try {
            PathSum_29 ps = new PathSum_29();
            System.out.println("has sum:" +
                    ps.hasPathSum(TreeNode.createSampleTree(),7));
            System.out.println("has sum recursive: " +
                    ps.hasPathSumRecursive(TreeNode.createSampleTree(),0,7));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean hasPathSum(TreeNode root , int sum) {
        if(root==null){
            return false;
        }

        LinkedList<TreeNode> treeQueue = new LinkedList<TreeNode>();
        LinkedList<Integer> sumQueue = new LinkedList<Integer>();

        treeQueue.add(root);
        sumQueue.add(root.val);
        while (!treeQueue.isEmpty()){
            TreeNode currNode = treeQueue.poll();
            int currSum = sumQueue.poll();

            if(currNode.left==null && currNode.right==null && currSum==sum){
                return true;
            }
            if(currNode.left!=null){
                treeQueue.add(currNode.left);
                sumQueue.add(currSum + currNode.left.val);
            }
            if(currNode.right!=null){
                treeQueue.add(currNode.right);
                sumQueue.add(currSum + currNode.right.val);
            }
        }

        return false;
    }

    public  boolean hasPathSumRecursive(TreeNode root , int currValue, int sum){
        if(root==null){
            return false;
        }

        currValue = currValue + root.val;
        if(root.left==null && root.right==null && currValue==sum){
            return true;
        }
        if(currValue>sum){
            return false;
        }

        return hasPathSumRecursive(root.left, currValue, sum)
                || hasPathSumRecursive(root.right, currValue, sum);
    }
}
