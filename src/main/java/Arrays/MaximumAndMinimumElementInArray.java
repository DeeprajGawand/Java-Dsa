package Arrays;

import java.util.Arrays;

public class MaximumAndMinimumElementInArray {
    public static void main(String[] args) {

        int [] array = {1,2,3,22, 6565,4,5};

        int mini = array[0];
        int maxi=array[0];

        for (int i =0; i< array.length; i++){
          if (mini>array[i]){
              mini = array[i];
          } else if (maxi < array[i]) {
              maxi = array[i];

          }

        }
        System.out.println(maxi);
        System.out.println(mini);
        }

    }

