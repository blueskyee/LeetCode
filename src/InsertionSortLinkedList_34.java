/**
 * Created by blueskyee on 2016/3/3.
 */
public class InsertionSortLinkedList_34 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(8);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        try {
            ListNode sorted = insertionSortList(l1);
            ListNode.printListNode(sorted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ListNode insertionSortList (ListNode head) {
        if(head==null || head.next==null)
            return head;

        ListNode sortedList = head;
        head = head.next;
        sortedList.next = null;
        while (head!=null){
            //advance the node
            ListNode curr = head;
            head = head.next;

            if(curr.val < sortedList.val){
                curr.next = sortedList;
                sortedList = curr;
            }else{
                //search correct position of current
                ListNode search = sortedList;
                while(search.next!=null && curr.val>search.next.val)
                    search = search.next;
                curr.next = search.next;
                search.next = curr;
            }
        }

        return sortedList;
    }
}
