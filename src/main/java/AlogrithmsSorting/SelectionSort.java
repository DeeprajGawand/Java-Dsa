package AlogrithmsSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr ={22,3,4,2,34,53,23};
        int n = arr.length;

      for(int i =0;i<n;i++){
          int minIndex = i;
          for (int j =i+1;j<n;j++){
              if(arr[j]<arr[minIndex]){
                  minIndex = j;
              }
              int temp = arr[minIndex];
              arr[minIndex] =arr[i];
              arr[i] =temp;
          }
      }
      for (int num : arr){
          System.out.print(num+" ");
      }

    }
}
