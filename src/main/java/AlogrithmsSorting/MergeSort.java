package AlogrithmsSorting;
//merge sort sorts the array recurseivle using divide and conqure
public class MergeSort {

    public static void sortedMerge(int [] arr, int mid, int si, int ei){
    int [] merge =  new int[ei-si+1];

    int indx1 = si;
    int indx2 = mid+1;
    int x =0;

    while (indx1 <= mid && indx2 <= ei){
        if (arr[indx1]<= arr[indx2]){
            merge[x++] = arr[indx1++];
        }else{
            merge[x++]=arr[indx2++];
        }
    }

    while(indx1 <= mid){
        merge[x++]= arr[indx1++];

    }

    while(indx2 <= ei){
            merge[x++]= arr[indx2++];
        }
    for(int i =0, j=si; i<merge.length; i++,j++){
        arr[j] = merge[i];
    }

    }

    public static void divide(int [] arr, int si, int ei){
        if(si>=ei){
            return;
        }
       int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        sortedMerge(arr, mid, si, ei);

    }
    public static void main(String[] args) {
        int arr [] ={23,2,3,25,62,2};
        int n = arr.length;

        divide(arr, 0,n-1);
        for (int num: arr){
            System.out.print(num + " ");
        }
    }
}
