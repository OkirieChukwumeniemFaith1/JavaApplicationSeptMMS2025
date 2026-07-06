import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		int[] numbers = {5,8,2,3,9,4,1,6,7,10};
		int[] a = {7,9,6};
		int[] b = {8,9,6};
		
		int[] c = {7,9,9};
		int[] d = {7,9,6};
		int[] e = {7,9,6};
		int[] myFillArr = new int[10];
		Arrays.fill(myFillArr,5);
		int[][] randnum = {
			{1,2,3,4,5,6,7,8,9,10},
			{2,3,4,5,6,7,8,9,10,11},
				{3,4,5,6,7,8,9,10,11,12}
			};
		
		Arrays.sort(numbers);
		System.out.println("The elements of the array are");
		
		for(int number : numbers){
			System.out.printf("%d%n",number);
		}
		System.out.println("Binary Search");
		int index = Arrays.binarySearch(numbers,9);
		System.out.printf("The index number of 9 is %d%n",index);
		
		boolean isEqual = Arrays.equals(a,b);
		System.out.printf("The result is %b%n", isEqual);
		
		int isCompare = Arrays.compare(c,d);
		System.out.printf("The result is %d%n", isCompare);
		
		int isCompare2 = Arrays.compare(d,e);
		System.out.printf("The result is %d%n", isCompare2);
		
		int isCompare3 = Arrays.compare(d,c);
		System.out.printf("The result is %d%n", isCompare3);
		
		for(int value : myFillArr){
			System.out.printf("%d%n",value);
		}
		
		int[] evenNumbers = {2,4,6,8,10,12,14,16,18,20};
		int[] copyArr = Arrays.copyOf(evenNumbers,10);
		System.out.println("The elements of the array are");
		for(int arr : copyArr){
			System.out.printf("%d%n",arr);
		}
		System.out.println(Arrays.toString(evenNumbers));
		System.out.println(Arrays.deepToString(randnum));
		
	}
}