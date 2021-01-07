/**
 * Created by henry on 2018/8/8.
 */
public class SameTree_100 {
    public static void main(String[] args){
        try {
            _TreeNode n1 = _TreeNode.createSampleTree();
            _TreeNode n2 = _TreeNode.createSampleTree2();
            SameTree_100 nt = new SameTree_100();
            System.out.println(nt.isSameTree(n1, n2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSameTree(_TreeNode p, _TreeNode q) {
        if(p==null || q==null){
            return (p==null && q==null);
        }else{
            if(p.val == q.val)
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            else
                return false;
        }
    }

/*    public boolean isSameTree(_TreeNode p, _TreeNode q) {
        if(p==null || q==null )
            return (p==null && q==null);
        else{
            if(p.val==q.val)
                return isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right);
            else
                return false;
        }
    }*/
}
