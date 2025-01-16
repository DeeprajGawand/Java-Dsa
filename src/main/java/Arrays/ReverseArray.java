package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7};

//        int start = 0;
//        int end = array.length-1;
//        while (start<end){
//            int temp = array[start];
//            array[start]=array[end];
//            array[end]= temp;
//            start++;
//            end--;
//        }

        int start =0;
        int end = array.length-1;
        while(start<end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }





        for (int num : array){
            System.out.print(num+" ");
        }
    }
}
