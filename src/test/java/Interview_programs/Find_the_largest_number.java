package Interview_programs;

import java.util.Arrays;
import java.util.Collections;

public class Find_the_largest_number {
    public static void main(String[] args) {

        int[] array = {11, 89, 54, 78, 90};



//---------------------------------------------SIMPLE FORMAT ---------------------------------------
//
        Arrays.sort(array);

        System.out.println(array[array.length-1]);


  //-------------------------------------------------WITHOUT PREDEFIND FUNCTIONS---------------------------------------
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//
//            if (array[i] < max) {
//                max = array[i];
//
//            }
//
//        }
//        System.out.println(max);

    }
}
