import java.util.PriorityQueue;

/**
 * Created by henry on 2021/2/27.
 */
public class KthSmallestElementinaSortedMatrix_378 {
    public static void main(String[] args){
        int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};
        KthSmallestElementinaSortedMatrix_378 kse = new KthSmallestElementinaSortedMatrix_378();
        System.out.println(kse.kthSmallest(matrix, 8));
    }

    public class Node{
        int row;
        int col;

        public Node(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Node> queue = new PriorityQueue<Node>((n1, n2) -> matrix[n1.row][n1.col] - matrix[n2.row][n2.col]);
        for(int i = 0; i < k && i < matrix.length; i++){
            queue.offer(new Node(i, 0));
        }
        Node temp;
        int res = 0;
        while(k > 0){
            k--;
            temp = queue.poll();
            res = matrix[temp.row][temp.col];
            temp.col++;
            if(temp.col < matrix[0].length)
                queue.offer(new Node(temp.row, temp.col));
        }

        return res;
    }
}
