public class OperatorPart2 {
    public static void main(String[] args) {
		//Logical Operator(AND(&&), OR(||), NOT(!))
		int num1 = 15;
		int num2 = 30;
		int num3 = 18;
		boolean andOperator = (num1 > num2) && (num1 > num3);
		System.out.printf("Is (%d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,andOperator);
		
		boolean orOperator = (num1 > num2) || (num1 > num3);
		System.out.printf("Is (%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,orOperator);
		
		//Unary Operator(increment(++),decrement(--))
		/*Increment- pre increment(++x) is putting the variable before the increment while post increment(x++)
		is putting the increment after the variable
		Decrement-
		*/
        System.out.println();
        System.out.println("=================");
		
		int x = 5;
		int y = 10;
		
		System.out.printf("The value of x is %d%n",++x);
		System.out.printf("The value of y is %d%n",y++);
		System.out.printf("The value of y is %d%n",y);
		
		System.out.println();
        System.out.println("=================");
		
		System.out.printf("The value of x is %d%n",--x);
		System.out.printf("The value of y is %d%n",y--);
		System.out.printf("The value of y is %d%n",y);
	}
}