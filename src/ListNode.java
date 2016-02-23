import sun.reflect.annotation.ExceptionProxy;

import java.util.List;

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

    static public ListNode reverseListOrder (ListNode head) throws Exception{
        if(head==null || head.next==null){
            return head;
        }

        ListNode pre = head;
        ListNode curr = head.next;
        while (curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }

        head.next = null;
        return pre;
    }

    static public ListNode mergeList (ListNode l1, ListNode l2) throws Exception{
        ListNode p1 = l1;
        ListNode p2 = l2;

        while (p2!=null){
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }

        return l1;
    }

}

