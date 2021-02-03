/**
 * Created by henry on 2021/2/3.
 */
public class SwapNodesinPairs_24 {

    public _ListNode swapPairs(_ListNode head) {
        if(head == null || head.next == null)
            return head;
        _ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;

        return newHead;
    }
}
