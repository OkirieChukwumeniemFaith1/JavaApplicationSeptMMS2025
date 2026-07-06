import java.util.Set;
import java.util.HashSet;

public class UsingSet2{
	public static void main(String[] args){
		Set<String> emails = new HashSet<>();
		
		emails.add("johndoe@gmail.com");
		emails.add("johdoe@gmail.com");
		emails.add("johnoe@gmail.com");
		emails.add("johndo@gmail.com");
		emails.add("jhnde@gmail.com");
		emails.add("jondoe@gmail.com");
		emails.add("jamesdoe@gmail.com");
		emails.add("jakedoe@gmail.com");
		emails.add("junedoe@gmail.com");
		emails.add("julydoe@gmail.com");
		
		System.out.println(emails);
		
		for(String email: emails){
			System.out.println(email);
		};
		
		
		//studentID.remove(104);
		
		//System.out.println(studentID);
		
		//System.out.println("Does Student ID contains 103 " + studentID.contains(102));
		//System.out.println("Does Student ID contains 104 " + studentID.contains(10));
		
	}
}