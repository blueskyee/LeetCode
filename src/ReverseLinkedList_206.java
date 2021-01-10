/**
 * Created by henry on 2020/10/22.
 */
public class ReverseLinkedList_206 {

    public static void main(String[] args){
        _ListNode n5 = new _ListNode(5);
        _ListNode n4 = new _ListNode(4,n5);
        _ListNode n3 = new _ListNode(3,n4);
        _ListNode n2 = new _ListNode(2,n3);
        _ListNode n1 = new _ListNode(1,n2);

        ReverseLinkedList_206 rl = new ReverseLinkedList_206();
        _ListNode reveredList = rl.reverseList(n1);
    }

    public _ListNode reverseList(_ListNode head) {
        if(head == null || head.next == null)
            return head;

        _ListNode pre = head;
        _ListNode cur = head.next;
        _ListNode next;
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
