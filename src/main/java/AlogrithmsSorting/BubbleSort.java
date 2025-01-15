package AlogrithmsSorting;
//time complexity =o(n)square
//space complexity = o(1)

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={32,23,2,42,1,432};
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int num : arr){
            System.out.print(num+" ");
        }

    }
}
