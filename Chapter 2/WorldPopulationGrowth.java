import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        double population = input.nextDouble();

        System.out.print("Enter annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble() / 100; // convert to decimal

        System.out.println("\nEstimated world population for the next 5 years:");
        for (int year = 1; year <= 5; year++) {
            double futurePopulation = population * Math.pow(1 + growthRate, year);
            System.out.printf("After %d year(s): %.0f%n", year, futurePopulation);
        }
    }
}
