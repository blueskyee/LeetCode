/**
 * Created by blueskyee on 2016/2/23.
 */
public class _TreeNode {
    int val ;
    _TreeNode left ;
    _TreeNode right ;
    _TreeNode(int x) { val = x; }

    //
    static public _TreeNode createSampleTree() throws Exception{
        _TreeNode root = new _TreeNode(0);
        root.left = new _TreeNode(1);
        root.right = new _TreeNode(2);

        root.left.left = new _TreeNode(3);
        root.left.right = new _TreeNode(4);
        root.right.left = new _TreeNode(5);
        root.right.right = new _TreeNode(6);

        return root;
    }

    static public _TreeNode createSampleTree2() throws Exception{
        _TreeNode root = new _TreeNode(0);
        root.left = new _TreeNode(1);
        root.right = new _TreeNode(2);

        root.left.left = new _TreeNode(3);
        root.right.right = new _TreeNode(6);

        return root;
    }

    static public _TreeNode createSymmetricTree() throws Exception{
        _TreeNode root = new _TreeNode(1);
        root.left = new _TreeNode(2);
        root.right = new _TreeNode(2);
        root.left.left = new _TreeNode(3);
        root.left.right = new _TreeNode(4);
        root.right.left = new _TreeNode(4);
        root.right.right = new _TreeNode(3);

        return root;
    }

    static public _TreeNode createBST() throws Exception{
        _TreeNode root = new _TreeNode(10);
        root.left = new _TreeNode(5);
        root.right= new _TreeNode(15);

        root.left.left = new _TreeNode(3);
        root.left.right = new _TreeNode(7);

        root.right.right = new _TreeNode(18);

        return root;
    }

}
