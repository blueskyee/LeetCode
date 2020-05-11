import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by blueskyee on 2016/2/23.
 */
public class InorderTraversal_24 {
    public static void main(String[] args) {
        try {
            InorderTraversal_24 it = new InorderTraversal_24();
            ArrayList<Integer> resultList
                    = it.inorderTraversal(TreeNode.createSampleTree());
            System.out.print("inorder traversal:");
            for(Integer val: resultList){
                System.out.print(val + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if(root==null)
            return resultList;

        TreeNode p = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p = p.left;
            }else{
                p = stack.pop();
                resultList.add(p.val);
                p = p.right;
            }
        }

        return resultList;
    }
}
