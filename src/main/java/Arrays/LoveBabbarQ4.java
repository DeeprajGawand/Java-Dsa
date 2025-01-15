package Arrays;
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
public class LoveBabbarQ4 {
    public static void main(String[] args) {
       int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
       int zero=0, one=0, two=0;

       for(int i =0; i<arr.length; i++){
           if(arr[i]==0)zero++;
           if(arr[i]==1)one++;
           if(arr[i]==2)two++;
       }
        for (int i =0; i<zero; i++)arr[i]=0;
        for (int i =zero; i<zero+one; i++)arr[i]=1;
        for (int i =zero+one; i<zero+one+two; i++)arr[i]=2;

        for (int num : arr){
            System.out.print(num +" ");
        }
    }
}
