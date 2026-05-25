import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positives = 0;
        int negatives = 0;
        int zeros = 0;

        // read 5 numbers
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Enter integer %d: ", i);
            int number = input.nextInt();

            if (number > 0) {
                positives++;
            } else if (number < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.printf("Number of positive values: %d%n", positives);
        System.out.printf("Number of negative values: %d%n", negatives);
        System.out.printf("Number of zeros: %d%n", zeros);
    }
}
