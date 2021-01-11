import javax.swing.tree.TreeNode;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by henry on 2021/1/11.
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal_105 {
    public _TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return buildSubTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1, map);
    }

    private _TreeNode buildSubTree(int[] preorder, int[] inorder,
                                   int preStart, int preEnd,
                                   int inStart, int inEnd,
                                   HashMap<Integer, Integer> map){
        if(preStart > preEnd || inStart > inEnd) return null;
        _TreeNode node = new _TreeNode(preorder[preStart]);
        int inRootIdx = map.get(preorder[preStart]);
        int numsLeft = inRootIdx - inStart;
        node.left = buildSubTree(preorder, inorder, preStart + 1, preStart + numsLeft, inStart, inRootIdx - 1, map);
        node.right = buildSubTree(preorder, inorder, preStart + numsLeft + 1, preEnd,  inRootIdx + 1, inEnd, map);
        return node;
    }
}
