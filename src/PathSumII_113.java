import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2020/11/4.
 */
public class PathSumII_113 {
    public static void main(String[] args){

    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(root, sum, cur, res);
        return res;
    }

    private void dfs(TreeNode root, int sum, List<Integer> cur, List<List<Integer>> res){
        if(root == null) return;
        cur.add(root.val);
        if(root.left==null && root.right==null && sum-root.val==0){
            res.add(new ArrayList<>(cur));
        }else{
            dfs(root.left, sum-root.val, cur, res);
            dfs(root.right, sum-root.val, cur, res);
        }
        cur.remove(cur.size()-1);
        return;
    }
}
