import java.util.Scanner;

public class OddEven2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		System.out.println();
        System.out.println("===========================================");
		
		boolean result = (num % 2 == 0);
		
		System.out.printf("number %d is even: %b%n ",num,result);
		System.out.printf("number %d is %b",num,result);
	}	
}