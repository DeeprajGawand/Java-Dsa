package Arrays;

import java.util.HashMap;

public class ArthimeticProgression {
    public static void main(String[] args) {
        int [] arr = {0,12,4,8};
        System.out.println(canFormAp(arr));
    }

    public static String canFormAp(int [] arr){
        if(arr.length <=1){
            return "yes";
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if (num<min){
                min = num;

            }
            if(num>max){
                max = num;
            }
        }
        int n = arr.length;
        int commonDifference = (max - min)/(n-1);

        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for(int num : arr){
            map.put(num , true);
        }

        for(int i = 0; i<arr.length ; i++){
            int expectedElement = min + i*commonDifference;
            if(!map.containsKey(expectedElement)){
                return "false";
            }
        }



        return "true";
    }
}
