package Arraycommon;

import java.util.HashMap;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");
//        arraySum();
//        evenOdd();
//        arrayEqualorNot();
//        findMissingNumber();
//        findMaxMinElement();
//        duplicateElement();
        secondLargest();
    }

    // 1.Sum of elements in Array
    public static void arraySum() {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in array: " + sum);
    }

    // 2.Program to print even and odd elements in array
    public static void evenOdd() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Even number: " + arr[i]);
            } else {
                System.out.println("Odd number: " + arr[i]);
            }
        }
    }

    // 3.Program to check if arrays are equal or not
    public static void arrayEqualorNot() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println("Arrays are not equal");
                return;
            }
        }
        System.out.println("Arrays are equal");
    }

    // 4.Program to find the missing number
    public static void findMissingNumber() {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum = actualSum + num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }

    // 5. Program to find max and min element in array
    public static void findMaxMinElement(){
        int[] arr={1,2,4,5,6,7};
        int max = arr[0];
        int min = arr[0];
        for (int i =0; i < arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }if(min>arr[i]){
                max=arr[i];
            }
        }
        System.out.println("maximum element "+max +" "+ "minimum element " + min);

    }

    //program to find duplicate element in array
    public static void duplicateElement(){
       int [] arr ={1,2,4,5,6,6};
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int i =0 ; i<arr.length; i++){
           if (map.containsKey(arr[i])){
               System.out.println("the duplicate value is "+ arr[i]);
               return;
           }else{
               map.put(arr[i], 1);
           }
       }
        System.out.println("no duplicate value found");
    }

    public static void secondLargest(){
        int [] arr ={1,2,3,4,5,6,6};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++){
            if(largest<arr[i]){
                secondLargest=largest;
                largest=arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest ) {
                secondLargest =arr[i];
                
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element in array");
        }else {
            System.out.println("The second largest element is " + secondLargest);
        }
    }
}
