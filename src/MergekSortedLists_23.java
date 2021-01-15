import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2021/1/16.
 */
public class MergekSortedLists_23 {
    public _ListNode mergeKLists(_ListNode[] lists) {
        _ListNode newHead = new _ListNode(0);
        _ListNode p = newHead;
        _ListNode minNode = findMinHead(lists);
        while (minNode != null){
            p.next = minNode;
            p = p.next;
            minNode = findMinHead(lists);
        }
        return newHead.next;
    }

    private _ListNode findMinHead(_ListNode[] lists){
        int minVal = Integer.MAX_VALUE;
        int minIdx = 0;
        _ListNode res = null;
        for(int i = 0; i < lists.length; i++){
            _ListNode node = lists[i];
            if(node != null && node.val < minVal) {
                minVal = node.val;
                minIdx = i;
            }
        }
        if(minVal < Integer.MAX_VALUE){
            res = lists[minIdx];
            lists[minIdx] = lists[minIdx].next;
            res.next = null;
        }
        return res;
    }

}
