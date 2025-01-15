package Arrays;

import java.util.Arrays;

//Move all the negative elements to one side of the array
public class LoveBabbarQ5 {
    public static void main(String[] args) {
//        int [] neg = new int[];
        int [] arr =  {-12, 11, -13, -5, 6, -7, 5, -3, -6};
       int start =0;
       int end = arr.length-1;

       while (start<end){
           while (arr[start]<0)start++;
           while (arr[end]>0)end--;
            if(start>=end)break;
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end] = temp;


       }
       for (int num : arr){
           System.out.print(num+" ");
       }

    }
}
