package collection.set.test;

import java.util.HashSet;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

        HashSet<Integer> set = new HashSet<>();

        for (Integer integer : inputArr) {
            set.add(integer);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
