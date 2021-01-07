/**
 * Created by henry on 2021/1/7.
 */
public class InvertBinaryTree_226 {
    public _TreeNode invertTree(_TreeNode root) {
        if(root == null || (root.left == null && root.right == null)){
            return root;
        }else{
            invertTree(root.left);
            invertTree(root.right);

            //swap left and right child node
            _TreeNode tempNode = root.left;
            root.left = root.right;
            root.right = tempNode;
            return root;
        }
    }
}
