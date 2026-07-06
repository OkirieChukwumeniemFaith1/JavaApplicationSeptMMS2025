public class EnhacedForLoop{
	public static void main(String[] args){
		String[] names = {"John","Jack","Mary","James","Lucy"};
		int[] marks = {69,80,100,70,50};
		System.out.println("EEEEEEE   N     N   H     H     A     N     N   CCCCC   EEEEEEE   DDDDD");
        System.out.println("E         NN    N   H     H    A A    NN    N   C       E         D    D");
        System.out.println("EEEEE     N N   N   HHHHHHH   AAAAA   N N   N   C       EEEEE     D     D");
        System.out.println("E         N  N  N   H     H   A   A   N  N  N   C       E         D    D");
        System.out.println("EEEEEEE   N   N N   H     H   A   A   N   N N   CCCCC   EEEEEEE   DDDDD");

        System.out.println();

        System.out.println("FFFFFFF    OOOOO   RRRRR            L       OOOOO   OOOOO   PPPPP");
        System.out.println("F         O     O  R    R           L      O     O O     O  P    P");
        System.out.println("FFFFF     O     O  RRRRR            L      O     O O     O  PPPPP");
        System.out.println("F         O     O  R   R            L      O     O O     O  P");
        System.out.println("F          OOOOO   R    RR          LLLLL   OOOOO   OOOOO   P");
		
		for(int i = 0; i < 5; i++){
			if(marks[i] >= 75){
				System.out.println("=========================================");
				System.out.printf("Student Name: %s%n",names[i]);
				System.out.printf("Student Name: %d%n",marks[i]);
				System.out.println("Grade A");
			}
			else if(marks[i] >= 60){
				System.out.println("=========================================");
				System.out.printf("Student Name: %s%n",names[i]);
				System.out.printf("Student Name: %d%n",marks[i]);
				System.out.println("Grade B");
			}
			else if(marks[i] >= 50){
				System.out.println("=========================================");
				System.out.printf("Student Name: %s%n",names[i]);
				System.out.printf("Student Name: %d%n",marks[i]);
				System.out.println("Grade C");
			}
			else if(marks[i] >= 40){
				System.out.println("=========================================");
				System.out.printf("Student Name: %s%n",names[i]);
				System.out.printf("Student Name: %d%n",marks[i]);
				System.out.println("Grade D");
			}
		}//Traditional for loop ends here
		System.out.println("Student name");
		for(String name : names | int mark : marks){
			System.out.printf("%s has a score of %d%n",name,mark);
		}
	}
}