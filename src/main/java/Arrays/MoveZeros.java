package Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int nonzeroelement = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonzeroelement] = arr[i];
                nonzeroelement++;
            }
        }
        System.out.println(nonzeroelement);
        for (int i = nonzeroelement; i < n; i++) {
            arr[nonzeroelement] = 0;
        }
    }
}

