package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionProgram {

	public static void main(String[] args) {
		int[] list1= {3,2,11,4,6,7};
		int[] list2= {1,2,8,4,9,7};			
		 Set<Integer> num1=new HashSet<>();
		 Set<Integer> num2=new HashSet<>();
		 for (int i = 0; i < list1.length; i++)
		 {
			 num1.add(list1[i]);
		 }
		 for (int j = 0; j < list2.length; j++) 
		 {
			num2.add(list2[j]);			
		}
		 System.out.println("First List is : "+num1);
		 System.out.println("Second List is : "+num2);
		 num1.retainAll(num2);
		
			System.out.println("Intersection list is : "+num1);
		}
		
	}


