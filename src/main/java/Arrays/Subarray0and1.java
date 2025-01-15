package Arrays;

import java.util.HashMap;

public class Subarray0and1 {
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,0,1,1};
        System.out.println(subarraycount0and1(arr));
    }
    public static int subarraycount0and1(int [] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int balance = 0;
        int count = 0 ;

        for(int i =0; i<arr.length; i++){
            if(arr[i]==0){
                balance = balance-1;
            }else {
                balance = balance+1;
            }
            if(map.containsKey(balance)){
                count= count+map.get(balance);
             }
            map.put(balance,map.getOrDefault(balance,0)+1);
        }



        return count;
    }
}
