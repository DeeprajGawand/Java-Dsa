package AlgorithmsSearching;
//Traverse the data sequentially to find the target element.
//time complexity is o(n)
//space complexity is o(1) constant
public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int key = 8;
        boolean found = false;

        for(int i =0 ; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("element found at index" + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("element didnt found");
        }

        }
    }



