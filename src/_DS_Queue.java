/**
 * Created by henry on 2021/3/14.
 */
public class _DS_Queue {
    static public class Queue{
        private int[] arr;      // array to store queue elements
        private int front;      // front points to the front element in the queue
        private int rear;       // rear points to the last element in the queue
        private int capacity;   // maximum capacity of the queue
        private int count;      // current size of the queue

        public Queue(int size){
            this.capacity = size;
            arr = new int[this.capacity];
            front = 0;
            rear = -1;
            count = 0;
        }
        public int dequeue(){
            int res = Integer.MIN_VALUE;
            if(!isEmpty()){
                res = arr[front];
                front = (front + 1) % capacity;
                count--;
            }
            return res;
        }
        public void enqueue(int item){
            if(!isFull()){
                rear = (rear + 1) % capacity;
                arr[rear] = item;
                count++;
            }
        }
        public int peek(){
            if(!isEmpty())
                return arr[front];
            return Integer.MIN_VALUE;
        }
        public Boolean isEmpty() {
            return count == 0;
        }
        public Boolean isFull() {
            return count == capacity;
        }
    }

    public static void main(String[] args){
        Queue q = new Queue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.isFull());
        q.enqueue(6);
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
