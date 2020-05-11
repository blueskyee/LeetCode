import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by henry on 2019/1/6.
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class MaximumDepthofNaryTree_559 {
    public static void main(String[] args){

    }

    public int maxDepth(Node root) {
        if(root==null) return 0;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        int depth = 0;
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i=0; i<qSize; i++){
                Node current = q.poll();
                for(Node child:current.children){
                    q.offer(child);
                }
            }
            depth++;
        }

        return depth;
    }
}
