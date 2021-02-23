import java.util.HashMap;
import java.util.Map;

/**
 * Created by henry on 2021/2/23.
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal_106 {

    public _TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildSubTree(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1, map);
    }

    private _TreeNode buildSubTree(int[] inorder, int[] postorder,
                                   int inStart, int inEnd,
                                   int postStart, int postEnd,
                                   Map<Integer, Integer> map){
        if(inStart > inEnd || postStart > postStart)
            return null;

        _TreeNode node = new _TreeNode(postorder[postEnd]);
        int numLeft = map.get(postorder[postEnd]) - inStart;
        node.left = buildSubTree(inorder, postorder, inStart, inStart + numLeft - 1, postStart, postStart + numLeft - 1, map);
        node.right = buildSubTree(inorder, postorder, inStart + numLeft + 1, inEnd, postStart + numLeft, postEnd - 1, map);
        return node;
    }
}
