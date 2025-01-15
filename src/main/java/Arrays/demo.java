package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        String s = "tree";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(frequencyMap);
    }
}