package Interview_programs;

public class ReplaceWithHashTagIncrement {
    public static void main(String[] args) {

        String s = "ANATA";
        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                count++;
                for (int j = 0; j < count; j++) {
                    sb.append("#");
                }

            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb);


    }
}
