/**
 * Created by henry on 2021/2/5.
 */
public class DesignCircularQueue_622 {
    public static void main(String[] args){
        MyCircularQueue mq = new MyCircularQueue(3);
        System.out.println(mq.enQueue(1));
        System.out.println(mq.enQueue(2));
        System.out.println(mq.enQueue(3));
        System.out.println(mq.enQueue(4));
        System.out.println(mq.Rear());
        System.out.println(mq.isFull());
        System.out.println(mq.deQueue());
        System.out.println(mq.enQueue(4));
        System.out.println(mq.Rear());
    }

    static class MyCircularQueue {
        int SIZE;
        int[] items;
        int front, rear;

        public MyCircularQueue(int k) {
            SIZE = k;
            items = new int[SIZE];
            front = -1;
            rear = -1;
        }

        public boolean enQueue(int value) {
            if(isFull())
                return false;
            if(front == -1)
                front = 0;
            rear = (rear + 1) % SIZE;
            items[rear] = value;
            return true;
        }

        public boolean deQueue() {
            if(isEmpty())
                return false;
            if(front == rear){
                front = -1;
                rear = -1;
                return true;
            }else{
                front = (front + 1) % SIZE;
                return true;
            }
        }

        public int Front() {
            if(front != -1)
                return items[front];
            return -1;
        }

        public int Rear() {
            if(rear != -1)
                return items[rear];
            return -1;
        }

        public boolean isEmpty() {
            if(front == -1 && rear == -1)
                return true;
            return false;
        }

        public boolean isFull() {
            if(front == -1 && rear == -1)
                return false;
            if((rear + 1) % SIZE == front)
                return true;
            else
                return false;
        }
    }

    //ref. https://www.programiz.com/java-programming/examples/queue-implementation
    //implement Queue
    public class Queue {
        int SIZE = 5;
        int items[] = new int[SIZE];
        int front, rear;

        Queue() {
            front = -1;
            rear = -1;
        }

        // check if the queue is full
        boolean isFull() {
            if (rear == SIZE - 1) {
                return true;
            }
            return false;
        }

        // check if the queue is empty
        boolean isEmpty() {
            if (front == -1)
                return true;
            else
                return false;
        }

        // insert elements to the queue
        void enQueue(int element) {

            // if queue is full
            if (isFull()) {
                System.out.println("Queue is full");
            } else {
                if (front == -1) {
                    // mark front denote first element of queue
                    front = 0;
                }

                rear++;
                // insert element at the rear
                items[rear] = element;
                System.out.println("Insert " + element);
            }
        }

        // delete element from the queue
        int deQueue() {
            int element;

            // if queue is empty
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return (-1);
            } else {
                // remove element from the front of queue
                element = items[front];

                // if the queue has only one element
                if (front >= rear) {
                    front = -1;
                    rear = -1;
                } else {
                    // mark next element as the front
                    front++;
                }
                System.out.println(element + " Deleted");
                return (element);
            }
        }

        // display element of the queue
        void display() {
            int i;
            if (isEmpty()) {
                System.out.println("Empty Queue");
            } else {
                // display the front of the queue
                System.out.println("\nFront index-> " + front);

                // display element of the queue
                System.out.println("Items -> ");
                for (i = front; i <= rear; i++)
                    System.out.print(items[i] + "  ");

                // display the rear of the queue
                System.out.println("\nRear index-> " + rear);
            }
        }
    }
}
