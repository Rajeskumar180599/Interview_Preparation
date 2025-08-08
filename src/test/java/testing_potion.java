public class testing_potion {

    public static void main(String[] args) {

        String input = "ANATA";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'A') {
                // Append (i + 1) number of '#'
                for (int j = 0; j < i + 1; j++) {
                    output.append('#');
                }
            } else {
                output.append(ch);
            }
        }

        System.out.println("Output: " + output.toString());
    }
}






