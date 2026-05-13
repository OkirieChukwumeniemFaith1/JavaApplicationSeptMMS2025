public class TypeCasting{
	public static void main(String[] args){
		int num1 = 50;
		int num2 = 200;
		
		double division = (double)num1/num2;
		System.out.printf("The division is %f%n",division);
		
		double price = 7658;
		System.out.printf("The price of laptop is %f%n", price);
		
		double balance = 5693.875;
		int convertedBalance = (int)balance;
		System.out.printf("The converted balance is %d%n",convertedBalance);
		
		char symbol = '?';
		int convertedSymbol = (int)symbol;
		System.out.printf("The converted symbol is %d%n",convertedSymbol);
		// the 63 gotten when it is printed is the character converted to ASCII format
	}
}
// type casting- this is the process of converting from one type to another
//types of type casting
/*
1. implicing/widening type casting- it is done inside the compiler also data is not lost
2. explicit/narrowing type casting- it is done outside the compiler 
*/
/*note: find the difference between unicode and ASCII code, create a note about unicode and ASCII code and
push it
*/
//note: all keywords are tokens
/*tokens- the smallest unit of a program that the compiler understands
identifiers- names given to variables,classes, methods etc. the rules for creating identifiers
 are the same as variable rules
 literal: fixed values in code
 statements:a line like this (System.out.printf("The")). "the" is a string
 semicolon(;)- mark the end of a program
 
 */