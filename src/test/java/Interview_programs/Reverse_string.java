package Interview_programs;

public class Reverse_string {
    public static void main(String[] args) {
        String s = "Rajesh";

        String v = "";
/*--------------------------------------------WITHOUT USING PREDEFINED FUNCTIONS------------------------------------------ */
        for(int i=0;i<s.length();i++){

             char c = s.charAt(i);
              v = c+v;
        }
        System.out.println(v);

 /*-----------------------------------------WITH USING PREDEFINED FUNCTIONS--------------------------------------------*/
        StringBuilder sb = new StringBuilder(s);
        String name =sb.reverse().toString();
        System.out.println(name);


    }
}
