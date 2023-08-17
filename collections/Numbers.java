package collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Numbers {
	public static void main(String[]args)
	{
	List<Integer> number=new LinkedList<Integer>();
		number.add(10);
		number.add(50);
		number.add(100);
		number.add(40);
		
		 System.out.println(number);
		 
		 
		Collections.sort(number);
		//sort=> print ascending order
		System.out.println(number);
		
		Collections.reverse(number);
	    //reverse=>print descending order
		System.out.println(number);
		
				
		boolean contains=number.contains(40);
		//contains-> to check if the element is existing or not
		System.out.println(contains);
		
		
	    //number.clear();
		//clear()-> to delete the values 
		
		boolean empty = number.isEmpty();
		System.out.println(empty);
		
	}

}
