/**
 * Created by henry on 2021/3/14.
 */
public class _DS_Heap {
    ////A Min-Heap is a complete binary tree
    // in which the value in each internal node
    // is smaller than or equal to the values in the children of that node
    ////A complete binary tree is a binary tree
    // in which all the levels are completely filled
    // except possibly the lowest one, which is filled from the left.
    public class MinHeap {
        private int[] Heap;
        private int size;
        private int maxsize;

        private static final int FRONT = 1;

        public MinHeap(int maxsize){
            this.maxsize = maxsize;
            this.size = 0;
            this.Heap = new int[maxsize + 1];
            Heap[0] = Integer.MIN_VALUE;
        }
        private int parent(int pos){
            return pos / 2;
        }
        private int leftChild(int pos){
            return pos * 2;
        }
        private int rightChild(int pos){
            return (pos * 2) + 1;
        }
        private boolean isLeaf(int pos){
            return pos > (size / 2) && pos <= size;
        }
        //Function to swap two nodes of the heap
        private void swap(int fpos, int spos){
            int temp = Heap[fpos];
            Heap[fpos] = Heap[spos];
            Heap[spos] = temp;
        }
        // Function to heapify the node at pos: sink down
        private void minHeapify(int pos){
            if(!isLeaf(pos)){
                if((leftChild(pos) <= size && Heap[pos] > Heap[leftChild(pos)])
                        || (rightChild(pos) <= size && Heap[pos] > Heap[rightChild(pos)])){
                    if(rightChild(pos) <= size && Heap[rightChild(pos)] < Heap[leftChild(pos)]){
                        swap(pos, rightChild(pos));
                        minHeapify(rightChild(pos));
                    }else{
                        swap(pos, leftChild(pos));
                        minHeapify(leftChild(pos));
                    }
                }
            }
        }
        public void insert(int element){
            if(size < maxsize){
                Heap[++size] = element;
                int cur = size;
                while(Heap[cur] < Heap[parent(cur)]){
                    swap(cur, parent(cur));
                    cur = parent(cur);
                }
            }
        }
        // Function to build the min heap using
        // the minHeapify
        public void minHeap(){
            for(int i = size / 2; i >= FRONT; i--){
                minHeapify(i);
            }
        }
        // Function to remove and return the minimum
        // element from the heap
        public int remove(){
            int minVal = Heap[FRONT];
            Heap[FRONT] = Heap[size--];
            minHeapify(FRONT);
            return minVal;
        }

    }
}
