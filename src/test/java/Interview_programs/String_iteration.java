package Interview_programs;

public class String_iteration {
    public static void main(String[] args) {

        String input = "demo";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            int repeatCount = i + 1; // 1-based position

            for (int j = 0; j < repeatCount; j++) {
                result.append(currentChar);
            }
        }

        System.out.println(result.toString());
    }
}
