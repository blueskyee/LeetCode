/**
 * Created by blueskyee on 2016/2/23.
 */
public class CopyListWithRandomPointer_20 {
    public static void main(String[] args) {
        RandomListNode n1 = new RandomListNode(1);
        RandomListNode n2 = new RandomListNode(2);
        RandomListNode n3 = new RandomListNode(3);
        n1.next = n2;
        n2.next = n3;
        n1.random = n3;
        n3.random = n2;

        try {
            CopyListWithRandomPointer_20 cw = new CopyListWithRandomPointer_20();
            RandomListNode r1 = cw.copyRandomList(n1);

            RandomListNode temp = r1;
            while (temp!=null){
                System.out.println("node vale:" + temp.label +
                        "; node's next:" + (temp.next==null?"":temp.next.label) +
                        "; node's random:" + (temp.random==null?"":temp.random.label));
                temp = temp.next;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public RandomListNode copyRandomList(RandomListNode head) throws Exception{
        if(head==null)
            return null;

        //1: copy every node and insert into list
        RandomListNode p = head;
        while (p!=null){
            RandomListNode copy = new RandomListNode(p.label);
            copy.next = p.next;
            p.next = copy;
            p = copy.next;
        }

        //2: copy random pointer
        p = head;
        while (p!=null){
            if(p.random!=null)
                p.next.random = p.random.next;
            p = p.next.next;
        }

        //3: break list into two parts
        p = head;
        RandomListNode newHead = p.next;
        while (p!=null){
            RandomListNode temp = p.next;
            p.next = temp.next;
            if(temp.next!=null)
                temp.next = temp.next.next;
            p = p.next;
        }

        return newHead;
    }
}
