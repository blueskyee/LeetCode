/**
 * Created by blueskyee on 2016/2/22.
 */
public class LinkedListCycle_19 {

    public boolean hasCycle ( ListNode head ) {
        if(head==null || head.next==null)
            return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                return true;
        }
        return false;
    }
}
