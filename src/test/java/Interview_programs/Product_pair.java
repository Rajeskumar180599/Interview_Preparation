package Interview_programs;

public class Product_pair {

    public static void main(String[] args) {

        int target = 24;

        System.out.println("Pairs of integers that multiply to " + target + ":");
        for (int i = 1; i <= target; i++) {
            if (target % i == 0) {
                int pair = target / i;
                System.out.println(i + " * " + pair + " = " + target);
                System.out.println(-i + " * " + -pair + " = " + target);
            }
        }
    }
}
