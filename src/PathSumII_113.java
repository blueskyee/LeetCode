import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2018/9/4.
 */
public class PathSumII_113 {
    public static void main(String[] args){
        PathSumII_113 ps = new PathSumII_113();
        try {
            List<List<Integer>> lists = ps.pathSum(TreeNode.createSymmetricTree(), 7);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result  = new ArrayList<List<Integer>>();
        List<Integer> currentResult  = new ArrayList<Integer>();
        pathSum(root,sum,currentResult,result);
        return result;
    }

    public void pathSum(TreeNode root, int sum,
                            List<Integer> curList,
                            List<List<Integer>> resultList){
        if(root==null) return;
        curList.add(root.val);

        if(root.left==null && root.right==null){
            if(root.val==sum){
                resultList.add(new ArrayList<Integer>(curList));
            }
            curList.remove(curList.size()-1);
            return;
        }else{
            pathSum(root.left, sum-root.val, curList, resultList);
            pathSum(root.right, sum-root.val, curList, resultList);
            curList.remove(curList.size()-1);
        }
    }
}
