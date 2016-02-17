import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Created by blueskyee on 2016/2/15.
 */
public class ThreeSum_11 {
    public static void main(String[] args) {
        int[] num = {-1,-4,0,1,2,2,3};

        ThreeSum_11 ts = new ThreeSum_11();
        ArrayList<ArrayList<Integer>> resultList = ts.threeSum(num);
        for (ArrayList<Integer> aryList : resultList){
            System.out.print("=> ");
            for (Integer value : aryList){
                System.out.print(value + ",");
            }
            System.out.println("");
        }
    }

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();

        Arrays.sort(num);

        if(num.length<3)
            return resultList;

        for(int i=0; i<num.length-2; i++){
            if(i==0 || num[i]>num[i-1]){ //to avoid duplicate
                int currValue = -num[i];
                int startIdx = i+1;
                int endIdx = num.length-1;

                while (startIdx < endIdx){
                    if(num[startIdx] + num[endIdx] == currValue){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(-currValue);
                        temp.add(num[startIdx]);
                        temp.add(num[endIdx]);
                        resultList.add(temp);

                        startIdx++;
                        endIdx--;
                        //to avoid duplicate
                        while(startIdx < endIdx && num[startIdx]==num[startIdx-1]){
                            startIdx++;
                        }
                        while(startIdx < endIdx && num[endIdx]==num[endIdx+1]){
                            endIdx++;
                        }
                    }else if(num[startIdx] + num[endIdx] < currValue){
                        startIdx++;
                    }else{
                        endIdx--;
                    }
                }
            }
        }

        return resultList;
    }
}
