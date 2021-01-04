/**
 * Created by henry on 2021/1/4.
 */
public class SortingAlgo {
    //quick sort
    //ref: https://openhome.cc/Gossip/AlgorithmGossip/QuickSort3.htm
    public static void quick(int[] number) {
        sort(number, 0, number.length-1);
    }

    private static void sort(int[] number, int left, int right) {
        if(left < right){
            int q = partition(number, left, right);
            sort(number, left, q-1);
            sort(number, q+1, right);
        }
    }

    private static int partition(int number[], int left, int right) {
        //pivot: right
        int i = left - 1;
        for(int j = left; j < right; j++){
            if(number[j] <= number[right]){
                i++;
                swap(number, i, j);
            }
        }
        swap(number, i+1, right);
        return i+1;
    }

    private static void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }


    //merge sort
    //ref: https://www.geeksforgeeks.org/merge-sort/
    private static void mergeSort(int[] number, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(number, left, mid);
            mergeSort(number, mid+1, right);
            merge(number, left, mid, right);
        }
    }

    private static void merge(int[] number, int left, int mid, int right){
        //step1: copy elements to L[] and R[]
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i < n1; i++){
            L[i] = number[left+i];
        }

        for(int i = 0; i < n2; i++){
            R[i] = number[mid + 1 + i];
        }

        //step2: copy elements from L[] and R[] back to number[] by number sequence
        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                number[k] = L[i];
                i++;
            }else{
                number[k] = R[j];
                j++;
            }
            k++;
        }

        //step3: copy remaining elements
        while(i < n1){
            number[k] = L[i];
            k++;
            i++;
        }
        while(j < n2){
            number[k] = R[j];
            k++;
            j++;
        }

    }

}
