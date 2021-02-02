/**
 * Created by henry on 2021/2/3.
 */
public class OddEvenLinkedList_328 {
    public _ListNode oddEvenList(_ListNode head) {
        if(head == null || head.next == null || head.next.next == null)
            return head;
        _ListNode evenHead = head.next;
        _ListNode odd = head;
        _ListNode even = head.next;
        while(true){
            if(odd.next != null && odd.next.next != null){
                odd.next = odd.next.next;
                odd = odd.next;
            }else{
                odd.next = evenHead;
                break;
            }
            if(even.next != null && even.next.next != null){
                even.next = even.next.next;
                even = even.next;
            }else{
                even.next = null;
            }
        }
        return head;
    }
}
