import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by henry on 2021/1/10.
 */
public class SerializeandDeserializeBinaryTree_297 {
    public class Codec {
        // Encodes a tree to a single string.
        public String serialize(_TreeNode root) {
            StringBuilder sb = new StringBuilder();
            serial(root, sb);
            return sb.toString();
        }

        final String splitter = ",";
        final String LN = "#";
        private void serial(_TreeNode node, StringBuilder sb){
            if(node == null){
                sb.append(LN).append(splitter);
            }else{
                sb.append(node.val).append(splitter);
                serial(node.left, sb);
                serial(node.right, sb);
            }
        }

        // Decodes your encoded data to tree.
        public _TreeNode deserialize(String data) {
            Queue<String> queue = new LinkedList<>();
            queue.addAll(Arrays.asList(data.split(splitter)));
            return deserial(queue);
        }

        private _TreeNode deserial(Queue<String> queue){
            String nodeVal = queue.poll();
            if(nodeVal.equals(LN))
                return null;
            _TreeNode root = new _TreeNode(Integer.valueOf(nodeVal));
            root.left = deserial(queue);
            root.right = deserial(queue);
            return root;
        }
    }
}
