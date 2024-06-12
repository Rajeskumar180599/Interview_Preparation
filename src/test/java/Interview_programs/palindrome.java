package Interview_programs;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

//        String s = "madam";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");

        String s = sc.nextLine();
        String n = "";
//        for (int i = 0; i < s.toLowerCase().length(); i++) {
//            char c = s.charAt(i);
//            n = c + n;
//
//        }

        StringBuilder sb = new StringBuilder(s);
         n = sb.reverse().toString();

        if (s.equals(n)) {
            System.out.println("is palindrome");

        } else {
            System.out.println("isn't palindrome");
        }


    }
}
