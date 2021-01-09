import java.util.*;

/**
 * Created by henry on 2021/1/8.
 */
public class BinaryTreeLevelOrderTraversal_102 {

    public List<List<Integer>> levelOrder(_TreeNode root) {
        //queue: store node to traverse by bfs
        //[x]map: store node's level according to its value. for duplicate node value, use another queue
        Queue<_TreeNode> queue = new LinkedList<>();
        Queue<Integer> levelQ = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;

        queue.offer(root);
        levelQ.offer(0);

        while(!queue.isEmpty()){
            _TreeNode node = queue.poll();
            int nodeLevel = levelQ.poll();
            if(res.size() < nodeLevel + 1){
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                res.add(list);
            }else{
                res.get(nodeLevel).add(node.val);
            }
            if(node.left != null){
                queue.offer(node.left);
                levelQ.offer(nodeLevel + 1);
            }

            if(node.right != null){
                queue.offer(node.right);
                levelQ.offer(nodeLevel + 1);
            }

        }

        return res;
    }

}
