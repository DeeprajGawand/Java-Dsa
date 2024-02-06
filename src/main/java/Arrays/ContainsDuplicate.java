package Arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int array [] = {1,2,3,1};
        HashMap<Integer,Integer>map=new HashMap();

        for (int i =0;i < array.length;i++){
            map.putIfAbsent(array[i],0);
            map.put(array[i], map.get(array[i])+1);
            if (map.get(array[i]) > 1){
                System.out.println("contains duplicate ");

            }
        }


    }
}
