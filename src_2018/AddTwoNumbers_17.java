/**
 * Created by blueskyee on 2016/2/22.
 */
public class AddTwoNumbers_17 {
    public static void main(String[] args) {
        ListNode l1 = ListNode.createListNodeList(new int[]{3,7,5});
        ListNode l2 = ListNode.createListNodeList(new int[]{1,6,8});

        try {
            AddTwoNumbers_17 atn = new AddTwoNumbers_17();
            ListNode sum = atn.addTwoNumbers(l1,l2);
            ListNode.printListNode(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ListNode addTwoNumbers( ListNode l1 , ListNode l2 ) {
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = newHead;

        int currValue = 0;
        while(p1!=null || p2!=null){
            if(p1!=null){
                currValue += p1.val;
                p1 = p1.next;
            }
            if(p2!=null){
                currValue += p2.val;
                p2 = p2.next;
            }
            p3.next = new ListNode(currValue%10);
            p3 = p3.next;
            currValue = currValue/10;
        }
        if(currValue==1){
            p3.next = new ListNode(1);
        }
        return newHead.next;
    }


}
