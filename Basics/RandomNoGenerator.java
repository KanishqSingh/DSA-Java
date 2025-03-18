
import java.security.SecureRandom;

public class RandomNoGenerator {
    private static final SecureRandom RANDOM = new SecureRandom();

    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value must be less than or equal to max value");
        }
        return RANDOM.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNumber = generateRandomNumber(min, max);
        System.out.println("Generated Random Number: " + randomNumber);
    }
}
