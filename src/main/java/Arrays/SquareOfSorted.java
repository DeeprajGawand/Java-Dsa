package Arrays;

public class SquareOfSorted {
    public static void main(String[] args) {
        int [] arr = {-4,-1,0,3,10};

        int n = arr.length;
        int [] res = new int[n];
        int start =0;
        int end = n-1;
        int index = n-1;

       while(start<end){
           int startSquare = arr[start]*arr[start];
           int endSquare = arr[end]*arr[end];
           if(startSquare>endSquare){
               res[index] = startSquare;
               start++;
           }else {
               res[index] = endSquare;
               end--;
           }
           index--;
       }
        for (int num : res) {
            System.out.print(num + " ");
        }

    }
}
