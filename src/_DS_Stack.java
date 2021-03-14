/**
 * Created by henry on 2021/3/14.
 */
public class _DS_Stack {
    //stack could be implemented by array or linked list
    ////array: pros: easy to implement; cons: not dynamic
    public class Stack {
        int maxsize;
        int top;
        int a[];

        public Stack(int maxsize){
            this.maxsize = maxsize;
            this.top = -1;
            this.a = new int[maxsize];
        }
        public boolean isEmpty(){
            return top < 0;
        }
        public boolean push(int x){
            if(top < maxsize - 1){
                a[++top] = x;
                return true;
            }
            return false;
        }
        public int pop(){
            int res = Integer.MIN_VALUE;
            if(top >= 0){
                res = a[top--];
            }
            return res;
        }
        public int peek(){
            int res = Integer.MIN_VALUE;
            if(top >= 0){
                res = a[top];
            }
            return res;
        }
    }

    //// linked list
    public class StackAsLinkedList {

        StackNode root;

        private class StackNode {
            int data;
            StackNode next;
            StackNode(int data) { this.data = data;}
        }

        public boolean isEmpty(){
            return root == null;
        }
        public boolean push(int x){
            StackNode newNode = new StackNode(x);
            if(root == null){
                root = newNode;
            }else{
                StackNode temp = root;
                root = newNode;
                newNode.next = temp;
            }
            return true;
        }
        public int pop(){
            int res = Integer.MIN_VALUE;
            if(root != null){
                res = root.data;
                root = root.next;
            }
            return res;
        }
        public int peek(){
            int res = Integer.MIN_VALUE;
            if(root != null){
                res = root.data;
            }
            return res;
        }
    }
}
