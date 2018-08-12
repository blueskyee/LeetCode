/**
 * Created by blueskyee on 2016/2/23.
 */
public class TreeNode {
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int x) { val = x; }

    //
    static public TreeNode createSampleTree() throws Exception{
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        return root;
    }

    static public TreeNode createSampleTree2() throws Exception{
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        return root;
    }

    static public TreeNode createSymmetricTree() throws Exception{
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        return root;
    }

}
