import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by blueskyee on 2016/3/3.
 */
public class CloneGraph_31 {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        if(node == null)
            return null;

        //need a queue to traverse each node
        LinkedList<UndirectedGraphNode> queue
                = new LinkedList<UndirectedGraphNode>();
        //need a map to check if current node has appeared before
        Map<UndirectedGraphNode,UndirectedGraphNode> map
                = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();

        UndirectedGraphNode newHead = new UndirectedGraphNode(node.label);
        queue.push(node);
        map.put(node,newHead);
        while (!queue.isEmpty()){
            UndirectedGraphNode origNode = queue.pop();
            ArrayList<UndirectedGraphNode> origNeighbors = origNode.neighbors;

            for(UndirectedGraphNode aNeighbor:origNeighbors){
                if(!map.containsKey(aNeighbor)){
                    UndirectedGraphNode newNode = new UndirectedGraphNode(aNeighbor.label);
                    map.put(aNeighbor,newNode);
                    map.get(origNode).neighbors.add(newNode);
                    queue.add(aNeighbor);
                }else{
                    map.get(origNode).neighbors.add(map.get(aNeighbor));
                }
            }
        }

        return newHead;
    }

}
