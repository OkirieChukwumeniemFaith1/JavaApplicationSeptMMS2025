public class EnhancedForLoop2{
	public static void main(String[] args){
		int[] marks = {69,80,100,70,50,2,3,4,5,7};
		
		System.out.println("Students marks are");
		for(int mark : marks){
			System.out.printf("%d%n",mark);
		}
	}
}