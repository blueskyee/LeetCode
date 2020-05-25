import java.util.ArrayList;
import java.util.List;

/**
 * Created by henry on 2020/5/25.
 */
public class PascalsTriangle_118 {
    public static void main(String[] args){
        PascalsTriangle_118 pt = new PascalsTriangle_118();
        System.out.println(pt.generate(6));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(numRows == 0){
            return result;
        }

        result.add(new ArrayList<Integer>());
        result.get(0).add(1);

        for(int i=2; i<=numRows; i++){
            List<Integer> preList = result.get(i-2);
            List<Integer> curList = new ArrayList<Integer>();
            for(int j=0; j<i; j++){
                if(j==0){
                    curList.add(preList.get(0));
                }
                else if(j==i-1){
                    curList.add(preList.get(preList.size()-1));
                }
                else{
                    curList.add(preList.get(j-1)+preList.get(j));
                }
            }

            result.add(curList);
        }

        return result;
    }
}
