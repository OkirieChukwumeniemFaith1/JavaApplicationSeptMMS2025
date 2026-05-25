import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number = input.nextInt();

        // initialize largest and smallest with the first number
        int largest = number;
        int smallest = number;

        // read the remaining 4 numbers
        for (int i = 2; i <= 5; i++) {
            System.out.printf("Enter integer %d: ", i);
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.printf("Largest is %d%n", largest);
        System.out.printf("Smallest is %d%n", smallest);
    }
}
