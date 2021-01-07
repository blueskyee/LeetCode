
/**
 * Created by henry on 2020/10/9.
 */
public class RangeSumofBST_938 {
    public static void main(String[] args){
        try {
            _TreeNode tn = _TreeNode.createBST();
            RangeSumofBST_938 rs = new RangeSumofBST_938();
            System.out.println(rs.rangeSumBST(tn, 7, 15));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int rangeSumBST(_TreeNode root, int L, int R) {
        if(root == null) return 0;
        if(root.val < L) return rangeSumBST(root.right, L, R);
        if(root.val > R) return rangeSumBST(root.left, L, R);
        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
