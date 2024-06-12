import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testing_potion {

    public static void main(String[] args) {

        String input = "demo";
        StringBuilder result = new StringBuilder();
        String n = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int repeatCount = i + 1; // 1-based position
            for (int j = 0; j < repeatCount; j++) {
//                result.append(currentChar);
                n = n + currentChar;
            }
        }

        System.out.println(n);
    }
}


