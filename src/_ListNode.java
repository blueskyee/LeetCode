/**
 * Created by blueskyee on 2016/2/22.
 */
public class _ListNode {
    int val;
    _ListNode next;
    _ListNode(int x){
        this.val = x;
        this.next = null;
    }

    _ListNode(int x, _ListNode next){
        this.val = x;
        this.next = next;
    }

    //
    static public _ListNode createListNodeList (int [] vals){
        _ListNode newHead = new _ListNode(0);
        _ListNode ptr = newHead;
        for (int val:vals) {
            ptr.next = new _ListNode(val);
            ptr = ptr.next;
        }

        return newHead.next;
    }

    static public void printListNode (_ListNode l1){
        _ListNode ptr = l1;
        while (ptr!=null){
            System.out.print(ptr.val + ",");
            ptr = ptr.next;
        }
    }

    static public _ListNode reverseListOrder (_ListNode head) throws Exception{
        if(head==null || head.next==null){
            return head;
        }

        _ListNode pre = head;
        _ListNode curr = head.next;
        while (curr != null){
            _ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }

        head.next = null;
        return pre;
    }

    static public _ListNode mergeList (_ListNode l1, _ListNode l2) throws Exception{
        _ListNode p1 = l1;
        _ListNode p2 = l2;

        while (p2!=null){
            _ListNode temp1 = p1.next;
            _ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }

        return l1;
    }

}

