import java.util.Stack;

/**
 * Created by blueskyee on 2016/2/25.
 */
public class FlattenBinaryTreeToLinkedList_28 {

    public void flatten (TreeNode root ) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;

        while(p!=null || !stack.isEmpty()){
            if(p.right!=null){
                stack.push(p.right);
            }
            if(p.left!=null){
                p.right = p.left;
                p.left = null;
            }else if(!stack.isEmpty()){
                TreeNode temp = stack.pop();
                p.right = temp;
            }

            p = p.right;
        }
    }
}
