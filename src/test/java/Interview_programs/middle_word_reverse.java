package Interview_programs;

import java.util.HashMap;
import java.util.Map;

public class middle_word_reverse {
    public static void main(String[] args) {

        String input = "Rajesh kumar kannan";

        // Split the input string into words
        String[] words = input.split(" ");

        String middle_word = words[1];
        String reverse_word = "";
        for(char c: middle_word.toCharArray()){
            reverse_word = c+reverse_word;

        }

        words[1] = reverse_word;

        // Reconstruct the output string
        String output = String.join(" ", words);

        // Print the output
        System.out.println(output);

//   ------------------------------------------------------------------------------------------------------------


//        // Split the input string into words
//        String[] words = input.split(" ");
//
//        // Define the mapping of the middle name to its replacement
//        Map<String, String> middleNameMap = new HashMap<>();
//        middleNameMap.put("kumar", "ramuk");
//
//        // Replace the middle name using the map
//        if (words.length == 3) {
//            String middleName = words[1];
//            if (middleNameMap.containsKey(middleName)) {
//                words[1] = middleNameMap.get(middleName);
//            }
//        }
//
//        // Reconstruct the output string
//        String output = String.join(" ", words);
//
//        // Print the output
//        System.out.println(output);
//



    }
}
