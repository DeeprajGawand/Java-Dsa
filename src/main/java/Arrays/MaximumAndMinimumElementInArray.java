package Arrays;

import java.util.Arrays;

public class MaximumAndMinimumElementInArray {
    public static void main(String[] args) {
        int array [] = {1,3,5,2,3,533,42,23};

        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        System.out.println(max);
        System.out.println(min);
    }
}
