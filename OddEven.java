import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		System.out.println();
        System.out.println("===========================================");
		
		boolean result = (num % 2 == 0);
		
		System.out.printf("Question: Is the number %d even %c%n ",num,'?');
		System.out.printf("Answer: %b",result);
	}	
}