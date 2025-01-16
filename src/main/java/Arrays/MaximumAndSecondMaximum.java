package Arrays;

public class MaximumAndSecondMaximum {
    public static void main(String[] args) {
        int [] arr ={2,3,4,1,7,8,3,42,42};
         int max = Integer.MIN_VALUE;
         int secondMax= Integer.MIN_VALUE;

         for(int i =0;i< arr.length;i++){
             if(arr[i]>max){
                 secondMax=max;
                 max = arr[i];

                 //this condition when arr having duplicate max numbers
             }else if (arr[i]>secondMax && arr[i]!=max){
                 secondMax = arr[i];
             }
         }

        System.out.println("maximum number" +max);
        System.out.println("second maximum number" +secondMax);
    }
}
