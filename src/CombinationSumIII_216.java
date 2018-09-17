import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2018/9/17.
 */
public class CombinationSumIII_216 {
    public static void main(String[] args){
        CombinationSumIII_216 cs = new CombinationSumIII_216();
        System.out.println(cs.combinationSum3(3, 9));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<Integer>(), 1, k, n);
        return ans;
    }

    private void combination(List<List<Integer>> ans, List<Integer> comb, int startIdx, int k, int n) {
        if(comb.size()==k && n==0){
            List<Integer> temp = new ArrayList<Integer>(comb);
            ans.add(temp);
            return;
        }else if(comb.size()==k){
            return;
        }else{
            for(int i=startIdx; i<=9; i++){
                comb.add(i);
                combination(ans, comb, i+1, k, n-i);
                comb.remove(comb.size()-1);
            }
        }
    }
}
