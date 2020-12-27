import java.util.*;

/**
 * Created by henry on 2020/12/27.
 */
public class CloneGraph_133 {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        //return bfs(node);
        Map<Integer, Node> map = new HashMap<Integer, Node>();
        return dfs(node, map);
    }

    //DFS:
    //need a mpa to record which node has been clone
    private Node dfs(Node node, Map<Integer, Node> map){
        if(node == null) return null;

        if(map.containsKey(node.val)){
            return map.get(node.val);
        }else{
            Node newNode = new Node(node.val);
            map.put(node.val, newNode);
            for(Node neighbor: node.neighbors){
                newNode.neighbors.add(dfs(neighbor, map));
            }

            return newNode;
        }
    }
    
    //BFS:
    //need a map to record which node has been clone, and a queue to bfs create neighbors
    private Node bfs(Node node){
        if(node == null) return null;

        Map<Integer, Node> map = new HashMap<Integer, Node>();
        Queue<Node> queue = new LinkedList();

        Node newNode = new Node(node.val);
        map.put(node.val, newNode);
        queue.add(node);

        while(!queue.isEmpty()){
            Node curNode = queue.poll();
            for(Node neighbor: curNode.neighbors){
                if(!map.containsKey(neighbor.val)){
                    Node newNeighbor = new Node(neighbor.val);
                    map.put(newNeighbor.val, newNeighbor);
                    queue.add(neighbor);
                }

                map.get(curNode.val).neighbors.add(map.get(neighbor.val));
            }
        }

        return newNode;
    }

}
