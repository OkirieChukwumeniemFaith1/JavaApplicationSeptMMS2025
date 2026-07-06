public class Array{
	public static void main(String[] args){
		int[] numbers = {6,9,5,12,4,8,5,2,16,14};
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		for(int i = 0; i < 10; i++){
			if(numbers[i] % 2 == 0){
				evensum += 1;
			}
			else{
				oddsum += 1;
			}	
		}
		System.out.printf("The sum of even numbers in the array is %d%n",evensum);
	}
}