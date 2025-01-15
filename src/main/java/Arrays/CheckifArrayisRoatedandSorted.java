//package Arrays;
//
//import java.util.Arrays;
//
//public class CheckifArrayisRoatedandSorted {
//    public static void main(String[] args) {
//        int [] arr ={3,4,5,1,2};
//        int k =3;
//       int [] reversedArray =  rotated(arr);
//        System.out.println(Arrays.toString(reversedArray));
//    }
//
//    public static int[] rotated(int [] arr, int k ){
//        int n = arr.length-1;
//       reverse(arr, 0, k);
//       return arr;
//    }
//
//    public static int[] reverse(int[] arr){
//       int  n =arr.length-1;
//        int start = 0;
//        int end = n;
//        while(start<=end){
//            int temp = arr[start];
//            arr[start]= arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        return arr;
//    }
//}
