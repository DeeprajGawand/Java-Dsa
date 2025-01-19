package Arrays;

public class Q14RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int [] arr = {0,1,1,1,1,2,2,3,3,4};
        int count =1;
        for(int i =1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[count] =arr[i];
                count++;
            }
        }
        System.out.println(count);
        for (int num : arr){
            System.out.print(num +" ");
        }
    }
}
