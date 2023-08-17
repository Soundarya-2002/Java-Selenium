package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class printValues 
{
	public static void main(String[]args)
	{

	int[]num= {10,35,50,40,80};
	
	List<Integer> number=new LinkedList<Integer>();
	
	for(int i=0;i<num.length;i++)
		{	
		   number.add(num[i]);
	    }
		
		Collections.sort(number);
		System.out.println(number);
	}

}