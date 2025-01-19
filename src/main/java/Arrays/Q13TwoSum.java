package Arrays;

import java.util.HashMap;

public class Q13TwoSum {
    public static void main(String[] args) {
        int [] arr ={2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i =0;i<arr.length;i++){
            map.put(arr[i], i);
        }
        for(int i =0;i<arr.length; i++){
            int rem = target -arr[i];
            if (map.containsKey(rem) && map.get(rem)!=i){
                int remIndex = map.get(rem);
                System.out.print(i +" "+ remIndex);
                break;
            }
        }

    }
}
