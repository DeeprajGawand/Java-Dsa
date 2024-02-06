package Arrays;

public class MaximumSubarrayLeetcode {
    public static void main(String[] args) {
         int array [] ={-2,1,-3,4,-1,2,1,-5,4};

         int sum = 0;
         int maxsum = array[0];
         for (int i =0; i< array.length ; i++){
                sum = sum + array[i];
                if (sum>maxsum)maxsum=sum;
                if(sum<0)sum=0;
         }
        System.out.println(sum);
    }
}
