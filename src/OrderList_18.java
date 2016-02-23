/**
 * Created by blueskyee on 2016/2/22.
 */
public class OrderList_18 {
    public static void main(String[] args) {
        ListNode head = ListNode.createListNodeList(new int[]{1,2,3,4,5});

        try {
            OrderList_18 ol = new OrderList_18();
            ol.reorderList(head);
            ListNode.printListNode(head);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void reorderList (ListNode head) throws Exception{
        if(head!=null && head.next!=null){
            ListNode slow = head;
            ListNode fast = head;

            //find middle of list
            while(fast!=null && fast.next!=null && fast.next.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                System.out.println("after " + slow.val + " " + fast . val ) ;
            }
            ListNode secondHalf = slow.next;
            slow.next = null;

            ListNode reversedSecondHalf = ListNode.reverseListOrder(secondHalf);
            ListNode.mergeList(head,reversedSecondHalf);
        }
    }
}
