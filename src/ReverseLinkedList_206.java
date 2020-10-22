/**
 * Created by henry on 2020/10/22.
 */
public class ReverseLinkedList_206 {

    public static void main(String[] args){
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);

        ReverseLinkedList_206 rl = new ReverseLinkedList_206();
        ListNode reveredList = rl.reverseList(n1);
    }

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode pre = head;
        ListNode cur = head.next;
        ListNode next;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        head.next = null;
        return pre;
    }
}
