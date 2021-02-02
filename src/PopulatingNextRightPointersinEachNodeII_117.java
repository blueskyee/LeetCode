/**
 * Created by henry on 2021/2/2.
 */
public class PopulatingNextRightPointersinEachNodeII_117 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if(root == null) return null;
        Node dummy = new Node(0);
        Node nextRight = dummy;
        Node curNode = root;
        while (curNode != null){
            if(curNode.left != null){
                nextRight.next = curNode.left;
                nextRight = nextRight.next;
            }
            if(curNode.right != null){
                nextRight.next = curNode.right;
                nextRight = nextRight.next;
            }
            if(curNode.next != null){
                curNode = curNode.next;
            }else{
                curNode = dummy.next;
                dummy.next = null;
                nextRight = dummy;
            }
        }
        return root;
    }
}
