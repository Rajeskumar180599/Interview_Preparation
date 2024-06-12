package Interview_programs;

import java.security.SecureRandom;

public class Random_id_generation {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {
        int length = 10; // Length of the random ID

        // Creating an instance of SecureRandom for generating random numbers securely
        SecureRandom random = new SecureRandom();

        // StringBuilder to store the generated random ID
        StringBuilder sb = new StringBuilder(length);

        // Generating random characters and appending them to the StringBuilder
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }

        // Outputting the generated random ID
        String randomID = sb.toString();
        System.out.println("Random ID generated: " + randomID);
    }
}
