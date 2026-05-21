import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.print("input the first number:");
	int num1 = input.nextInt();
	System.out.print("input the second number:");
	int num2 = input.nextInt();
	System.out.print("input the third number:");
	int num3 = input.nextInt();
	System.out.print("input the fourth number:");
	int num4 = input.nextInt();
	System.out.print("input the fifth number:");
	int num5 = input.nextInt();
	
	int sum = num1 + num2 + num3 + num4 + num5;
	float average = sum/5;
	int product = num1 * num2 * num3 * num4 * num5;
	
	System.out.println();
    System.out.println("=================");
	
	System.out.printf("the sum of the numbers is %d%n",sum);
	System.out.printf("the average of the numbers is %f%n",average);
	System.out.printf("the product of the numbers is %d%n",product);
	}
}