package Interview_programs;

import java.util.HashMap;
import java.util.Map;

public class Word_Count {

    public static void main(String[] args) {
        String n = "Rajesh kumar rajesh kannan";

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the string into words
        String[] words = n.split(" ");

        // Count word occurrences
        for (String word : words) {
            // Increment count for existing word or add new word with count 1
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        

        // Print word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}


