/**
 * Created by henry on 2021/2/12.
 */
public class SumRoottoLeafNumbers_129 {
    public int sumNumbers(_TreeNode root) {
        return helper(root, new StringBuilder());
    }

    private int helper(_TreeNode node, StringBuilder sb){
        if(node == null) return 0;
        sb.append(node.val);
        int sum = 0;
        if(node.left == null && node.right == null){
            sum = Integer.valueOf(sb.toString());
        }else{
            sum = helper(node.left, sb) + helper(node.right, sb);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sum;
    }
}
