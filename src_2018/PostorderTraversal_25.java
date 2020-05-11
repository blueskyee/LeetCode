import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by blueskyee on 2016/2/25.
 */
public class PostorderTraversal_25 {
    public static void main(String[] args) {
        try {
            PostorderTraversal_25 pt = new PostorderTraversal_25();
            ArrayList<Integer> resultList
                    = pt.postorderTraversal(TreeNode.createSampleTree());
            System.out.print("postorder traversal:");
            for(Integer val: resultList){
                System.out.print(val + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root){
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        if(root==null)
            return resultList;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        TreeNode prev = null;
        while(!stack.isEmpty()){
            TreeNode curr = stack.peek();
            //go down
            if(prev==null || prev.left==curr || prev.right==curr){
                if(curr.left!=null){
                    stack.push(curr.left);
                }else if(curr.right!=null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    resultList.add(curr.val);
                }
            }else if(curr.left==prev){  //go up from left child
                if(curr.right!=null){
                    stack.push(curr.right);
                }else{
                    stack.pop();
                    resultList.add(curr.val);
                }
            }else if(curr.right==prev){ //go up from right child
                stack.pop();
                resultList.add(curr.val);
            }

            prev = curr;
        }

        return  resultList;
    }
}
