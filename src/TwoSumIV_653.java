import java.util.HashSet;

/**
 * Created by henry on 2020/12/13.
 */
public class TwoSumIV_653 {
    public static void main(String[] args) throws Exception {
        _TreeNode tn = _TreeNode.createBST();
        TwoSumIV_653 ts = new TwoSumIV_653();
        System.out.println(ts.findTarget(tn, 10));
    }

    public boolean findTarget(_TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<Integer>();
        return findTargetByHashSet(root, k, set);
    }

    private boolean findTargetByHashSet(_TreeNode root, int k, HashSet<Integer> set){
        if(root == null)
            return false;
        if(set.contains(k - root.val))
            return true;
        set.add(root.val);
        return findTargetByHashSet(root.left, k, set) || findTargetByHashSet(root.right, k , set);
    }
}
