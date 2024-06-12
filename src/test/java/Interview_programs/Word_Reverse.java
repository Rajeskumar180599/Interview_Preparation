package Interview_programs;

public class Word_Reverse {

    public static void main(String[] args){
        String name ="Rajesh kumar";

        StringBuilder s = new StringBuilder(name);

        String result = s.reverse().toString();

        String[] split_name = result.split(" ");

        System.out.println(split_name[1]+ " " +split_name[0]);


    }
}
