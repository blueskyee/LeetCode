import java.util.ArrayList;

/**
 * Created by blueskyee on 2016/3/3.
 */
public class UndirectedGraphNode {
    int label;
    ArrayList<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x){
        this.label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
