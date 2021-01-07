import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2020/10/12.
 */
public class BinaryTreePaths_257 {
    static public void main(String[] args) throws Exception {
        _TreeNode tn = _TreeNode.createBST();
        BinaryTreePaths_257 btp = new BinaryTreePaths_257();
        List<String> result = btp.binaryTreePaths(tn);
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    public List<String> binaryTreePaths(_TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root != null)
            buildPaths(root, "", result);
        return result;
    }

    private void buildPaths(_TreeNode root, String curPath, List<String> result) {
        curPath = curPath + "->" + root.val;
        if(root.left == null && root.right == null){
            result.add(curPath.substring(2));
        }
        if(root.left != null){
            buildPaths(root.left, curPath, result);
        }
        if(root.right != null) {
            buildPaths(root.right, curPath, result);
        }
    }
}
