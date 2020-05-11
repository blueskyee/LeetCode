/**
 * Created by blueskyee on 2016/2/25.
 */
public class ConstructBinaryTree_30 {

    public TreeNode buildTree(int[] inorder, int[] postorder){
        int inStart = 0;
        int inEnd = inorder.length-1;
        int postStart = 0;
        int postEnd = postorder.length-1;

        return buildTree(inorder,inStart,inEnd,postorder,postStart,postEnd);
    }

    public TreeNode buildTree(int[] inorder, int inStart, int inEnd,
                              int[] postorder, int postStart, int postEnd){

        if(inStart > inEnd || postStart > postEnd){
            return null;
        }

        int rootValue = postorder[postEnd];
        int rootIdx = 0;
        for(int i=0; i<inorder.length; i++){
            if(inorder[i] == rootValue){
                rootIdx = i;
                break;
            }
        }

        TreeNode root = new TreeNode(rootValue);
        root.left = buildTree(inorder,inStart,rootIdx-1,postorder,postStart,postStart+rootIdx-(inStart+1));
        root.right = buildTree(inorder,rootIdx+1,inEnd,postorder,postStart+rootIdx-inStart,postEnd-1);

        return  root;
    }
}
