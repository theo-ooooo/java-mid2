package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String Text = "orange banana apple apple banana apple";
        String[] array = Text.split(" ");
        System.out.println(Arrays.toString(array));

        Map<String, Integer> map = new HashMap<>();
        for (String word : array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}
