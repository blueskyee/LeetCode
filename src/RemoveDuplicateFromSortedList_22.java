/**
 * Created by blueskyee on 2016/2/3.
 */
public class RemoveDuplicateFromSortedList_22 {

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(2);
        ListNode ln4 = new ListNode(3);

        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;

        ln1 = deleteDuplicates(ln1);

        ListNode p = ln1;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
