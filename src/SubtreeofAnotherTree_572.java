/**
 * Created by henry on 2021/1/10.
 */
public class SubtreeofAnotherTree_572 {
    public boolean isSubtree(_TreeNode s, _TreeNode t) {
        if(s == null) return false;
        if(isSameTree(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(_TreeNode s, _TreeNode t){
        if(s == null || t == null)
            return s == null && t == null;
        if(s.val != t.val)
            return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}
