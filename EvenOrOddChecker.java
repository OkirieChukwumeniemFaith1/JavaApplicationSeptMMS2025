import java.util.Scanner;

public class EvenOrOddChecker{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		char option;
		int num;
		do{
			System.out.print("Enter any number: ");
			num = scan.nextInt();
			
			if(num % 2 == 0){
				System.out.printf("The number %d is an even number%n",num);
			}
			else{
				System.out.printf("The number %d is an odd number%n",num);
			}
			System.out.println("");
			System.out.println("========================================");
			System.out.print("Do you want to run the program again(Y/N): ");
			option = scan.next().charAt(0);
		}while(option == 'Y' || option =='y');
		System.out.println("");
		System.out.println("========================================");
		System.out.println("Good bye............");
	}
}