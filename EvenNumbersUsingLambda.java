package Java;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersUsingLambda {

	public static void main(String [] args) {

		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

		List<Integer> evenNumbers = numbers.stream()
										   .filter(n-> n % 2 ==0)
										   .collect(Collectors.toList());

		System.out.print("Even Numbers in the List: "  + evenNumbers);
	}

}
