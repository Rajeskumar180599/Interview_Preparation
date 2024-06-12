package Interview_programs;

import java.util.HashSet;

public class Duplicate_Array_found {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 6, 7, 8, 9, 10, 3, 4};

        HashSet<Integer> original = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int num : array) {
            if (!original.add(num)){
                duplicate.add(num);

            }
        }
        System.out.println(duplicate);

    }

}
