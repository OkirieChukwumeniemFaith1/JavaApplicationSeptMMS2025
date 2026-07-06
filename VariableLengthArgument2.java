public class VariableLengthArgument2{
	public static void main(String[] args){
		System.out.printf("The oddcount is %d%n",oddcounter(5,6,8,9,3,2,1));
		System.out.printf("The oddcount is %d%n",oddcounter(8,6,4,7,5,6));
		System.out.printf("The oddcount is %d%n",oddcounter(5,6,8,9,4));
		System.out.printf("The oddcount is %d%n",oddcounter(5,6,8,6));
		System.out.printf("The oddcount is %d%n",oddcounter(5,6,8));
		System.out.printf("The oddcount is %d%n",oddcounter(5,6));
		System.out.printf("The oddcount is %d%n",oddcounter(5));
		System.out.printf("The oddcount is %d%n",oddcounter());
	}
	public static int oddcounter(int... numbers){
		int oddsum = 0;
		for(int number : numbers){
			if(number % 2 != 0){
				oddsum += 1;
			}
		}
		return oddsum;
	}
}