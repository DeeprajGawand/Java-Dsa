package Arrays;

import java.util.HashMap;

public class Q16ContainsDuplicate {
    public static void main(String[] args) {
        int array [] = {1,2,3,1};
        HashMap<Integer,Integer>map=new HashMap();
        boolean containsdup = false;

        for (int i =0;i < array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i]+1) );
                containsdup = true;
                break;

            }else {
                map.put(array[i],1 );
            }

        }
        if(containsdup){
            System.out.println("contains duplicate");
        }


    }
}
