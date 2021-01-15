/**
 * Created by henry on 2021/1/16.
 */
public class LinkedListCycle_141 {
    public boolean hasCycle(_ListNode head) {
        if(head == null || head.next == null)
            return false;
        _ListNode fast = head.next.next;
        _ListNode slow = head.next;
        while (fast != null){
            if(fast.val == slow.val)
                return true;
            if(fast.next == null)
                return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
