/**
 * Created by henry on 2020/9/14.
 */
public class MonotonicArray_896 {
    public static void main(String[] args){
        int[] input = {1,2,2,3};

        MonotonicArray_896 ma = new MonotonicArray_896();
        System.out.println(ma.isMonotonic(input));
    }

    public boolean isMonotonic(int[] A) {
        int inc = 1;
        int dec = 1;

        for(int i=1; i<A.length; i++){
            if(A[i] > A[i-1]){
                inc++;
            }else if(A[i] < A[i-1]){
                dec++;
            }else{
                inc++; dec++;
            }
        }

        return inc==A.length || dec==A.length;
    }
}
