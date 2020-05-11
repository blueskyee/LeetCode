/**
 * Created by blueskyee on 2016/3/3.
 */
public class MergeSortLinkedList_32 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        try {
            ListNode sorted = mergeSortList(l1);
            ListNode.printListNode(sorted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ListNode mergeSortList(ListNode head) {
        if(head==null || head.next==null)
            return head;

        //count total to cal. middle
        int count = 0;
        ListNode ptr = head;
        while (ptr!=null){
            count++;
            ptr = ptr.next;
        }
        int middle = count/2;
        //divide list
        ListNode l = head;
        ListNode r = null;
        ptr = head;
        count = 0;
        while (ptr!=null){
            count++;
            if(count==middle){
                r = ptr.next;
                ptr.next = null;
            }
            ptr = ptr.next;
        }
        ListNode firstPart = mergeSortList(l);
        ListNode secondPart = mergeSortList(r);
        //merge
        ListNode result = merge(firstPart,secondPart);
        return result;
    }

    public static ListNode merge(ListNode l , ListNode r) {
        ListNode p1 = l;
        ListNode p2 = r;

        ListNode newHead = new ListNode(0);
        ListNode ptrNew = newHead;

        while (p1!=null || p2!=null){
            if(p1==null){
                ptrNew.next = new ListNode(p2.val);
                p2 = p2.next;
            }else if(p2==null){
                ptrNew.next = new ListNode(p1.val);
                p1 = p1.next;
            }else{
                if(p1.val > p2.val){
                    ptrNew.next = new ListNode(p2.val);
                    p2 = p2.next;
                }else{
                    ptrNew.next = new ListNode(p1.val);
                    p1 = p1.next;
                }
            }
            ptrNew = ptrNew.next;
        }

        return newHead.next;
    }
}
