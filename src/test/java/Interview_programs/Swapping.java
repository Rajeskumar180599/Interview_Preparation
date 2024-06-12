package Interview_programs;

public class Swapping {
    public static void main(String[] args) {

//        int a = 10;
//        int b = 20;
//        int temp;
//
//        temp =a;
//        a=b;
//        b=temp;
//
//        System.out.println(a);
//        System.out.println(b);

        //  ---------Without using temp variable -----------------------

        int a = 100;
        int b = 200;

        a = a + b; // 100+200 = 300
        b = a - b; // 300-200 = 100
        a = a - b; // 300-100 = 200

        System.out.println(a); // Output: 200
        System.out.println(b); // Output: 100
        

    }
}
