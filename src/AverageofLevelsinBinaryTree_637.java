import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by henry on 2020/10/10.
 */
public class AverageofLevelsinBinaryTree_637 {
    static public void main(String[] args) throws Exception {
        _TreeNode tn = _TreeNode.createBST();
        AverageofLevelsinBinaryTree_637 albt = new AverageofLevelsinBinaryTree_637();
        List<Double> result = albt.averageOfLevels(tn);
        for(Double d:result){
            System.out.println(d);
        }
    }

    public List<Double> averageOfLevels(_TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        Queue<_TreeNode> queue = new LinkedList<_TreeNode>();

        if(root == null) return result;
        queue.add(root);
        while (!queue.isEmpty()){
            int nodeNum = queue.size();
            Double sum = 0.0;
            for(int i=0; i<nodeNum; i++){
                _TreeNode t = queue.poll();
                sum += t.val;
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
            }
            result.add(sum / nodeNum);
        }

        return result;
    }
}

