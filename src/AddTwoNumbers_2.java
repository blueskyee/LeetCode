/**
 * Created by blueskyee on 2016/2/22.
 */
public class AddTwoNumbers_2 {
    public static void main(String[] args) {
        _ListNode l1 = _ListNode.createListNodeList(new int[]{3,7,5});
        _ListNode l2 = _ListNode.createListNodeList(new int[]{1,6,8});

        try {
            AddTwoNumbers_2 atn = new AddTwoNumbers_2();
            _ListNode sum = atn.addTwoNumbers(l1,l2);
            _ListNode.printListNode(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public _ListNode addTwoNumbers(_ListNode l1, _ListNode l2) {
        _ListNode p1 = l1;
        _ListNode p2 = l2;
        _ListNode result = new _ListNode(0);
        _ListNode cur = result;

        int curSum = 0;
        while (p1 != null || p2 != null){
            if(p1 != null){
                curSum += p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                curSum += p2.val;
                p2 = p2.next;
            }
            cur.next = new _ListNode(curSum%10);
            cur = cur.next;
            curSum /= 10;
        }
        if(curSum == 1)
            cur.next = new _ListNode(1);

        return result.next;
    }

/*
    public _ListNode addTwoNumbers( _ListNode l1 , _ListNode l2 ) {
        _ListNode newHead = new _ListNode(0);
        _ListNode p1 = l1;
        _ListNode p2 = l2;
        _ListNode p3 = newHead;

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
            p3.next = new _ListNode(currValue%10);
            p3 = p3.next;
            currValue = currValue/10;
        }
        if(currValue==1){
            p3.next = new _ListNode(1);
        }
        return newHead.next;
    }
*/


}
