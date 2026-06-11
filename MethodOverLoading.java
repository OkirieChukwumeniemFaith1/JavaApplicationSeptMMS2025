import java.util.Scanner;

public class MethodOverLoading{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("=========Calculate Perimeter of Shapes=======");
		System.out.println("Enter 1. for square");
		System.out.println("Enter 2. for Rectangle");
		System.out.println("Enter 3. for Triangle");
		System.out.println("Enter 4. for Exit program");
		System.out.println("=======================================\n");
		System.out.print("Enter your choice: ");
		int choice = scan.nextInt();
		
		switch(choice){
			case 1:
					System.out.print("Enter the length of the square: ");
					int lenofSquare = scan.nextInt();
					perimeter(lenofSquare);
			break;
			case 2:
					System.out.print("Enter the length of the rectangle: ");
					int lenofRect = scan.nextInt();
					System.out.print("Enter the width of the rectangle: ");
					int widthofRect = scan.nextInt();
					perimeter(lenofRect,widthofRect);
			break;
			case 3:
					System.out.print("Enter sideA: ");
					int sideA = scan.nextInt();
					System.out.print("Enter sideB: ");
					int sideB = scan.nextInt();
					System.out.print("Enter sideC: ");
					int sideC = scan.nextInt();
					perimeter(sideA,sideB,sideC);
			break;
			default:
						System.out.println("Program Exited, Good Bye..........");
		}
	}
	public static void perimeter(int lenofSquare){
		int perimeterOfSquare = 4 * lenofSquare;
		
		System.out.printf("The perimeter of the square is %d%n",perimeterOfSquare);
	}
	
	public static void perimeter(int lenofRect, int widthofRect){
		int perimeterOfRect = 2* (lenofRect + widthofRect);
		
		System.out.printf("The perimeter of the rectangle is %d%n",perimeterOfRect);
	}
	
	public static void perimeter(int sideA, int sideB, int sideC){
		int perimeterOfTriangle = sideA + sideB + sideC;
		
		System.out.printf("The perimeter of the triangle is %d%n",perimeterOfTriangle);
	}
}