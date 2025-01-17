package AlgorithmsSearching;
//binary search in sorted array
//works on divide and conqure
//time complexity o(logn)
//space complexity o(logn)

public class BinarySearch {
    public static void main(String[] args) {
    int [] arr ={1,2,3,4,5,6,7};
    int target = 2;
    int low = 0;
    int high = arr.length-1;
    while (low<high){
        int mid = low+high/2;
        if(arr[mid]==target){
            System.out.println("element found at index" + mid);
            break;
        } else if (arr[mid]<target) {
            low = mid+1;
        }else {
            high=mid-1;
        }
    }
    }
}
