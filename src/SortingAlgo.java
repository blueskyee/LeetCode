/**
 * Created by henry on 2021/1/4.
 */
public class SortingAlgo {
    //quick sort
    //ref: https://openhome.cc/Gossip/AlgorithmGossip/QuickSort3.htm
    public static void quick(int[] number) {
        sort(number, 0, number.length - 1);
    }

    private static void sort(int[] number, int left, int right) {
        if (left < right) {
            int q = partition(number, left, right);
            sort(number, left, q - 1);
            sort(number, q + 1, right);
        }
    }

    private static int partition(int number[], int left, int right) {
        //pivot: right
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (number[j] <= number[right]) {
                i++;
                swap(number, i, j);
            }
        }
        swap(number, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] number, int i, int j) {
        int temp = number[i];
        number[i] = number[j];
        number[j] = temp;
    }


    //merge sort
    //ref: https://www.geeksforgeeks.org/merge-sort/
    private static void mergeSort(int[] number, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(number, left, mid);
            mergeSort(number, mid + 1, right);
            merge(number, left, mid, right);
        }
    }

    private static void merge(int[] number, int left, int mid, int right) {
        //step1: copy elements to L[] and R[]
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = number[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = number[mid + 1 + i];
        }

        //step2: copy elements from L[] and R[] back to number[] by number sequence
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                number[k] = L[i];
                i++;
            } else {
                number[k] = R[j];
                j++;
            }
            k++;
        }

        //step3: copy remaining elements
        while (i < n1) {
            number[k] = L[i];
            k++;
            i++;
        }
        while (j < n2) {
            number[k] = R[j];
            k++;
            j++;
        }

    }


    //heap sort
    //ref: https://www.geeksforgeeks.org/heap-sort/
    public static void heapSort(int[] number) {
        if (number == null || number.length < 2)
            return;

        //build max heap
        int n = number.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(number, n, i);
        }
        //swap root (max value) to last element
        for (int i = n - 1; i > 0; i--) {
            swap(number, 0, i);
            heapify(number, i, 0);
        }
    }

    //heapify function make max heap sub-tree from node i
    private static void heapify(int[] number, int n, int i) {
        //step1: compare node i with 2 child nodes
        int lChild = 2 * i + 1;
        int rChild = 2 * i + 2;
        int largest = i;

        if (lChild < n && number[lChild] > number[largest]) {
            largest = lChild;
        }

        if (rChild < n && number[rChild] > number[largest]) {
            largest = rChild;
        }

        //step2.1: swap node i with child node if child node's value is bigger than i
        //step2.2: recursive heapify sub-tree if step2.1 occur
        if (largest != i) {
            swap(number, i, largest);
            heapify(number, n, largest);
        }
    }


    //insertion sort
    //ref: https://www.geeksforgeeks.org/insertion-sort/
    public static void insertionSort(int[] number){
        if (number == null || number.length < 2)
            return;

        for(int i = 1; i < number.length; i++){
            int cur = number[i];
            int j = i - 1;
            while(j >= 0 && number[j] > cur){
                number[j + 1] = number[j];
                j--;
            }
            number[j + 1] = cur;
        }
    }

}
