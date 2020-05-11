/**
 * Created by blueskyee on 2016/2/14.
 */
public class MedianOfTwoSortedArray_6 {
    public static void main(String[] args) {
        MedianOfTwoSortedArray_6 ms = new MedianOfTwoSortedArray_6();
        //ms.intDivTest();
        int A[] = new int[]{1,2,3};
        int B[] = new int[]{3,4,5};
        try {
            System.out.print("median:" + ms.findMedianSortedArrays(A,B));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double findMedianSortedArrays(int A[], int B[]) throws  Exception{
        int lengthA = A.length;
        int lengthB = B.length;

        double median = 0;
        if((lengthA+lengthB)%2==0){
            median = ((double)(findMedianSortedArrays(A,0,lengthA,B,0,lengthB,(lengthA+lengthB)/2)
                    +(double)findMedianSortedArrays(A,0,lengthA,B,0,lengthB,(lengthA+lengthB)/2+1)))/2;
        }else{
            median = findMedianSortedArrays(A,0,lengthA,B,0,lengthB,(lengthA+lengthB+1)/2);
        }
        return median;
    }

    public int findMedianSortedArrays(int A[], int startA, int endA, int B[], int startB, int endB, int k) {
        int n = endA - startA;
        int m = endB - startB;

        if (n <= 0)
            return B[startB + k - 1];
        if (m <= 0)
            return A[startA + k - 1];
//        if (k == 1)
//            return A[startA] < B[startB] ? A[startA] : B[startB];

        int midA = (startA + endA) / 2;
        int midB = (startB + endB) / 2;

        if (A[midA] <= B[midB]) {
            //Not only throws the half part of an array, we also throws the mid element out.
            //So we will compare k with n / 2 + m / 2 + 1
            if (n / 2 + m / 2 + 1 >= k)
                return findMedianSortedArrays(A, startA, endA, B, startB, midB, k);
            else
                //A中間那個也丟掉，所以k要多減一
                return findMedianSortedArrays(A, midA + 1, endA, B, startB, endB, k - n / 2 - 1);
        } else {
            if (n / 2 + m / 2 + 1 >= k)
                return findMedianSortedArrays(A, startA, midA, B, startB, endB, k);
            else
                return findMedianSortedArrays(A, startA, endA, B, midB + 1, endB, k - m / 2 - 1);

        }
    }

    //int divide will be rounded
    public void intDivTest(){
        int n = 3;
        System.out.print("n/2=" + n/2);
    }
}
