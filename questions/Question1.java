package questions;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,67,7,7,7,8,9,0,11};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr,7,0,list));

       // System.out.println(search(arr,67,0));

    }
    static int search(int[] arr,int target , int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index]== target){
            return index;
        }else {
            return search(arr, target, index+1);
        }
    }


    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list){
        if (index== arr.length) {
        return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
      return findAllIndex(arr, target, index+1,list);

    }
}
