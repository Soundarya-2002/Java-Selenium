package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {
	
		public static void main(String[]args, Object Integer)
		{
			int[] num= {10,2,3,4,9,5,6,7};
			
			List<Integer>val =new ArrayList<Integer>();
			
			for(int i=0;i<num.length;i++) 
			{
				val.add(num[i]);
			}
			
			System.out.println(val);
			
			Collections.sort(val);
			 System.out.println(val);
			 
			 //print first largest number
		     Integer integer = val.get(val.size()-2);
			//-1=> last value
			System.out.println(integer);
			 
		}
		
	}
		
