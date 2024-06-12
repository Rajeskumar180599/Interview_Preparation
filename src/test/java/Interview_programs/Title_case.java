package Interview_programs;

public class Title_case {

    public static void main(String[] args) {
        String input = "welcome to chennai thanks";
        StringBuilder titleCase = new StringBuilder();
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }
            titleCase.append(c);
        }

        System.out.println(titleCase.toString());
    }

//    private static String toTitleCase(String input) {
//        StringBuilder titleCase = new StringBuilder(input.length());
//        boolean nextTitleCase = true;
//
//        for (char c : input.toCharArray()) {
//            if (Character.isSpaceChar(c)) {
//                nextTitleCase = true;
//            } else if (nextTitleCase) {
//                c = Character.toTitleCase(c);
//                nextTitleCase = false;
//            }
//            titleCase.append(c);
//        }
//
//        return titleCase.toString();
//    }
}


