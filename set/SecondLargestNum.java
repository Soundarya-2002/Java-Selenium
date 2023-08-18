package collections.set;

//import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNum
{
	public static void main(String[]args)
	{
		int[] number= {100,400,700,200,500,100,500,200,80};
		
		//create empty set
		Set<Integer> val=new TreeSet<Integer>();
		
		for(int i=0;i<number.length;i++)
		{
			//add the values
			val.add(number[i]);
		}
		
		//print unique num
		System.out.println(val);
		
		//create empty list and convert set into list
		List<Integer> SecondNum=new ArrayList<Integer>(val);
		System.out.println(SecondNum);
		
		//print first largest number
		System.out.println("SecondLargestNumber"+SecondNum.get(SecondNum.size()-2));
		
		
			
			
		}
		
		
	}


