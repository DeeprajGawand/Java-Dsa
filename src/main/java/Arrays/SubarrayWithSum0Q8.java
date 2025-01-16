package Arrays;

import java.util.HashSet;
//so we are adding each elements in array if the elements get repeat we say it has subarray whose sum is 0
//for example at index 0 we have 4 and after adding till index 3 that is 1 we get answer 4 so it contains subarrya
//whose sum is 0
public class SubarrayWithSum0Q8 {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
//        int sum =0;
//        HashSet<Integer> prefixsum = new HashSet<>();
//
//        for (int i =0; i<arr.length;i++){
//            sum = sum+arr[i];
//
//            if(sum==0 || prefixsum.contains(sum) ){
//                System.out.println("subarray contains sum 0");
//                return;
//            }
//            prefixsum.add(sum);
//
//            }
//        System.out.println("no subarray contains sum 0;");
        HashSet<Integer> prefixsum = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum == 0 || prefixsum.contains(sum)) {
                System.out.println("subarray contains sum zero");
                return;
            }
            prefixsum.add(sum);

        }
        System.out.println("no subarrya conatins sum zero");
    }


    }

