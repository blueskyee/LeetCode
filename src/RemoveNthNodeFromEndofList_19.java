/**
 * Created by henry on 2020/10/22.
 */
public class RemoveNthNodeFromEndofList_19 {
    public static void main(String[] args){
        int[] nodeVals = {1,2,3,4,5};
        _ListNode listHead = _ListNode.createListNodeList(nodeVals);
        ReverseLinkedList_206 rl = new ReverseLinkedList_206();
        rl.reverseList(listHead);
    }

    public _ListNode removeNthFromEnd(_ListNode head, int n) {
        //1: find the length of list(l)
        //2: remove the (l-n+1) th node
        if(head == null)
            return head;

        int length = 0;
        _ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        int nthNodeFromHead = length-n;
        _ListNode start = new _ListNode(0);
        start.next = head;
        temp = start;
        for(int i=0; i<nthNodeFromHead; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return start.next;
    }
}
