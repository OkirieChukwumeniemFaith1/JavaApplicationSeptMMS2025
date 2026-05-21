import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your address: ");
        String address = input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();
		
		System.out.println();
        System.out.printf("Information about %s%n", name);
        System.out.println("===========================================");

        System.out.printf("Hello %s, you are welcome to NIIT%n", name);
        System.out.printf("You are %d years old%n", age);
		System.out.printf("And you live in %s",address);
	}
}