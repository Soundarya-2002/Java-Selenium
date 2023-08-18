package collections.set;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatedValue
{
	public static void main(String[]args)
	{
	
		int[] num= {1,2,3,6,9,2,1,6,7};
	Set<Integer> val=new TreeSet<Integer>();
	
	  for(int i=0;i<num.length;i++)
	  {
	    if(!val.add(num[i]))
	     {
			System.out.println(num[i]);
			
			
	      }

	   }
    }
}