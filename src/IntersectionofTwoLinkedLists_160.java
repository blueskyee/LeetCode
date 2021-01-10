/**
 * Created by henry on 2020/10/26.
 */
public class IntersectionofTwoLinkedLists_160 {
    public static void main(String[] args){

    }

    public _ListNode getIntersectionNode(_ListNode headA, _ListNode headB) {
        if(headA == null || headB == null)
            return null;

        _ListNode a = headA;
        _ListNode b = headB;
        while (a != b){
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }

        return a;
    }
}
