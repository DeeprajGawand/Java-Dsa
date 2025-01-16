package Arrays;
//6.	Kadane's Algorithm (maximum subarray sum).6.	Kadane's Algorithm (maximum subarray sum).
//https://www.youtube.com/watch?v=usxn9PV6Fdo&t=235s

public class MaximumSubarrayQ6 {
    public static void main(String[] args) {
         int array [] ={-2,1,-3,4,-1,2,1,-5,4};

        int sum=0;
        int max_sum = array[0];

        for (int i =0; i< array.length;i++){
           sum = sum+array[i];
           if(sum>max_sum)max_sum=sum;
           if(sum<0)sum=0;
        }
        System.out.println(max_sum);


    }
}
