/**
 * Created by henry on 2021/1/16.
 */
public class ReorderList_143 {
    public void reorderList(_ListNode head) {
        if(head == null || head.next == null) return;
        while (head.next.next != null){
            _ListNode p1 = head;
            _ListNode p2 = head;
            while (p2.next.next != null){
                p2 = p2.next;
            }
            p2.next.next = p1.next;
            p1.next = p2.next;
            p2.next = null;
            head = p1.next.next;
        }
    }
}
