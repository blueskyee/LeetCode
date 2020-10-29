import java.util.Arrays;
import java.util.List;

/**
 * Created by henry on 2020/10/29.
 */
public class PascalsTriangleII_119 {
    public static void main(String[] args){
        int rowIdx = 3;
        PascalsTriangleII_119 pt = new PascalsTriangleII_119();
        List<Integer> res = pt.getRow(rowIdx);
        for(Integer i:res){
            System.out.print(i + ",");
        }
    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] res = new Integer[rowIndex+1];
        Arrays.fill(res, 0);
        res[0] = 1;

        for(int i=1; i<=rowIndex; i++){
            for(int j=i; j>=1; j--){
                res[j] = res[j] + res[j-1];
            }
        }

        return Arrays.asList(res);
    }
}
