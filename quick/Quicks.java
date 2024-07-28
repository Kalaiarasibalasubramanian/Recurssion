package quick;

import java.util.Arrays;

public class Quicks {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr);

    }
    static  void quicksort(int[] arr ,int low , int high){
        if (low>=high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;
        int pivot =   arr[mid];
        while (start<= end ){
            while (arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if (start<= end){
                int temp = arr[start];
                arr[start]= arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(arr,low,end);
        quicksort(arr,start,high);
    }
}
