package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] str= {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> list=new ArrayList<>();
		
		for (int i = 0; i < str.length; i++) {
			list.add(str[i]);			
		}
		System.out.println("Array List is "+list);
		Collections.sort(list);
		System.out.println("Ascending order : "+list);
		Collections.reverse(list);
		System.out.println("Reverse Order "+list);
		
		}
}
