package Arrays;

public class PrintArrayMaximumSubArrayQ7 {
    public static void main(String[] args) {
        int array [] ={-2,1,-3,4,-1,2,1,-5,4};

        int sum=0;
        int maxsum= array[0];
        int start = 0;// Tracks the starting index of the current subarray
        int tempStart =0; // Temporary start index for when a new subarray starts
        int end =0;// Tracks the starting index of the current subarray

        for (int i =0;i< array.length;i++){
            sum = sum +array[i];
            if(sum>maxsum){
                maxsum=sum;
                start = tempStart;
                end =i;
            }
            if (sum<0){
                sum =0;
                tempStart=i+1;
            }
        }

        System.out.println(maxsum);
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
