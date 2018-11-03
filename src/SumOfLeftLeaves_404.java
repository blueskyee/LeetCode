

/**
 * Created by henry on 2018/11/3.
 */
public class SumOfLeftLeaves_404 {
    public static void main(String[] args){
        SumOfLeftLeaves_404 sll = new SumOfLeftLeaves_404();
        try {
            TreeNode tn = TreeNode.createSymmetricTree();
            System.out.print(sll.sumOfLeftLeaves(tn));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        
        int sum=0;
        if(root.left!=null){
            if(root.left.left==null && root.left.right==null){
                sum += root.left.val;
            }else{
                sum += sumOfLeftLeaves(root.left);
            }
        }
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
