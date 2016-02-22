/**
 * Created by blueskyee on 2016/2/22.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }

    //
    static public ListNode createListNodeList (int [] vals){
        ListNode newHead = new ListNode(0);
        ListNode ptr = newHead;
        for (int val:vals) {
            ptr.next = new ListNode(val);
            ptr = ptr.next;
        }

        return newHead.next;
    }

    static public void printListNode (ListNode l1){
        ListNode ptr = l1;
        while (ptr!=null){
            System.out.print(ptr.val + ",");
            ptr = ptr.next;
        }
    }
}

