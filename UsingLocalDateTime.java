import java.time.LocalDateTime;

public class UsingLocalDateTime{
	public static void main(String[] args){
		
		LocalDateTime todaysDateTime = LocalDateTime.now();
		LocalDateTime meetingDateTime = LocalDateTime.of(2021,05,15,06,30,45);
		LocalDateTime businessDateTime = LocalDateTime.parse("2026-10-05T07:05:45");
		
		System.out.printf("The current date and time is %s%n",todaysDateTime);
		System.out.printf("The meeting date and time is %s%n",meetingDateTime);
		System.out.printf("The business date and time is %s%n",businessDateTime);
	}
}