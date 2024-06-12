package Interview_programs;

public class replace_reverse_string {
    public static void main(String[] args) {
        String name = "32132132154automation8444846";

        String replaced_string = name.replaceAll("[^a-z]","");

        StringBuilder sb = new StringBuilder(replaced_string);

        String output = sb.reverse().toString();
        System.out.println(output);

    }
}
