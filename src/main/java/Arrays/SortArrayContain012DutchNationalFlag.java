package Arrays;

import java.util.Arrays;

//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
//https://www.youtube.com/watch?v=6sMssUHgaBs
public class SortArrayContain012DutchNationalFlag {
    public static void main(String[] args) {
       int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        sort(arr);

        for (int num : arr){
           System.out.print(num +" ");

        }
    }
//    public static void swap(int arr[], int i,int j){
//        int temp =arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public static void sort(int [] arr){
//        int low=0;
//        int mid =0;
//        int high = arr.length-1;
//
//        while(mid<=high){
//            if (arr[mid]==0){
//                swap(arr, low, mid);
//                low++;
//                mid++;
//
//            } else if (arr[mid]==1) {
//                mid++;
//
//            }else {
//                swap(arr, mid, high);
//                high--;
//            }
//        }
//    }

    public static void swap(int [] arr, int i, int j ){
        int temp = arr[i] ;
        arr[i]=arr[j];
        arr[j] = temp;
    }

    public static void sort(int [] arr){
        int low =0;
        int mid=0;
        int high = arr.length-1;

        while (mid<=high){
            if(arr[mid]==0){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;

            }else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
}
