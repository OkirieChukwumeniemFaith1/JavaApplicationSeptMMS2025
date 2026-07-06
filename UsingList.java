import java.util.List;
import java.util.ArrayList;

public class UsingList{
	public static void main(String[] args){
		List<String> cars = new ArrayList<>();
		
		
		cars.add("Toyota");
		cars.add("Rolls-Royce");
		cars.add("BMW");
		cars.add("Mercedes-Benz");
		cars.add(1,"Ford");
		
		System.out.println(cars.size());
		
		//set the value of an element
		cars.set(0,"Dodge");
		
		//removing an elementfrom the list
		cars.remove(0);
		
		System.out.printf("The size: %d%n%n",cars.size());
		
		//get element using the indexing
		System.out.printf("%s%n",cars.get(1));
		
		for(String car : cars){
			System.out.println(car);
		}
		
		System.out.println(cars);
	}
}