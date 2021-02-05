import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by henry on 2021/2/5.
 */
public class SerializeandDeserializeBST_449 {
    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(_TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serial(root, sb);
            return sb.toString();
        }

        private void serial(_TreeNode node, StringBuilder sb){
            if(node == null) return;
            sb.append(node.val).append(",");
            serial(node.left, sb);
            serial(node.right, sb);
        }

        // Decodes your encoded data to tree.
        public _TreeNode deserialize(String data) {
            if(data.isEmpty()) return null;
            Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
            return deserial(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        private _TreeNode deserial(Queue<String> queue, int low, int high){
            if(queue.isEmpty()) return null;
            int val = Integer.valueOf(queue.peek());
            if(val < low || val > high) return null;

            queue.poll();
            _TreeNode node = new _TreeNode(val);
            node.left = deserial(queue, low, val);
            node.right = deserial(queue, val, high);
            return node;
        }
    }
}
