package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumberUsingList {

	public static void main(String[] args) {
		/*- Declare an array {3, 2, 11, 4, 6, 7}.
- Pick the 2nd element from the last and print it.
Hints to Solve:
- Arrange the collection in ascending order
- Use the get method to print the second largest number
*/
		int num[]= {3,2,11,4,6,7};
		List<Integer> list=new ArrayList<>();		
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);			
		}
		System.out.println("The given List is : "+list);
		Collections.sort(list);
		System.out.println("Sorted list is : "+list);
		System.out.println("Second largest number in given list is : "+list.get(num.length-2));

	}

}
