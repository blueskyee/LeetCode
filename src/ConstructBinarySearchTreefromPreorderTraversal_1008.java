/**
 * Created by henry on 2021/2/27.
 */
public class ConstructBinarySearchTreefromPreorderTraversal_1008 {

    public _TreeNode bstFromPreorder(int[] preorder) {
        return buildTree(preorder, 0, preorder.length - 1);
    }

    private _TreeNode buildTree(int[] preorder, int start, int end){
        if(start > end) return null;

        int curNodeVal = preorder[start];
        _TreeNode node = new _TreeNode(curNodeVal);
        int rightStart = -1;
        for(int i = start; i <= end; i++){
            if(preorder[i] > curNodeVal){
                rightStart = i;
                break;
            }
        }
        node.left = buildTree(preorder, start + 1, rightStart > 0 ? rightStart - 1 : end);
        node.right = buildTree(preorder, rightStart > 0 ? rightStart : Integer.MAX_VALUE, end);

        return node;
    }
}
