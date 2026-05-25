import java.util.Scanner;

public class DayOfTheWeek{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("Please enter the number for the day of the week ranging from 1-7:" );
		System.out.print("Enter the day of the week: ");
		num = input.nextInt();
		
		System.out.println("");
		System.out.println("=================");
		
		if(num == 1){
			System.out.printf("day %d%n is Sunday", num);
		}
		else if(num == 2){
			System.out.printf("day %d%n is Monday", num);
		}
		else if(num == 3){
			System.out.printf("day %d%n is Tuesday", num);
		}
		else if(num == 4){
			System.out.printf("day %d%n is Wednesday", num);
		}
		else if(num == 5){
			System.out.printf("day %d%n is Thursday", num);
		}
		else if(num == 6){
			System.out.printf("day %d%n is Friday", num);
		}
		else if(num == 7){
			System.out.printf("day %d%n is Saturday", num);
		}
		else{
			System.out.println("Invalid input");
		}
	}
}