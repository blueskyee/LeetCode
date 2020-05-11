import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by blueskyee on 2016/2/23.
 */
public class PreorderTraversal_23 {

    public static void main(String[] args) {
        try {
            PreorderTraversal_23 pt = new PreorderTraversal_23();
            ArrayList<Integer> resultList
                    =  pt.preorderTraversal(TreeNode.createSampleTree());
            System.out.print("preorder traversal:");
            for(Integer val: resultList){
                System.out.print(val + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
        if(root==null)
            return returnList;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode curr = stack.pop();
            returnList.add(curr.val);

            if(curr.right!=null)
                stack.push(curr.right);
            if(curr.left!=null)
                stack.push(curr.left);
        }

        return returnList;
    }
}
