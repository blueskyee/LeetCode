/**
 * Created by blueskyee on 2016/2/3.
 */
public class RemoveDuplicateFromSortedList_83 {

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(3);
        ListNode ln4 = new ListNode(4);

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

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }

        return head;
    }
}
