/**
 * Created by blueskyee on 2016/2/25.
 */
public class ValidateBST_27 {
    public static void main(String[] args) {
        try {
            ValidateBST_27 vb = new ValidateBST_27();
            System.out.print("is valid:" + vb.isValidBST(TreeNode.createSampleTree()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean validate(TreeNode root, int minValue, int maxValue) {
        if(root==null) {
            return true;
        }
        if(root.val<=minValue || root.val>=maxValue) {
            return false;
        }
        return validate(root.left,minValue,root.val)
                && validate(root.right, root.val,maxValue);
    }
}
