/**
 * Created by blueskyee on 2016/2/17.
 */
public class MergeSortedArray_13 {
    public static void main(String[] args) {
        int[] A = {1,3,4,5,7,9,12,0,0,0,0};
        int[] B = {2,6,8,16};

        try {
            MergeSortedArray_13 ms = new MergeSortedArray_13();
            ms.merge(A,7,B,4);

            for(int i=0; i<A.length; i++){
                System.out.print(A[i] + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void merge(int A[] , int m, int B[] , int n) throws Exception{
        while(m > 0 && n > 0){
            if(A[m-1] > B[n-1]){
                A[m+n-1] = A[m-1];
                m--;
            }else{
                A[m+n-1] = B[n-1];
                n--;
            }
        }

        while(n > 0){
            A[n-1] = B[n-1];
            n--;
        }
    }
}
