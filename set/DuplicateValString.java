package collections.set;

import java.util.LinkedHashSet;
import java.util.Set;


public class DuplicateValString {
	public static void main(String[]args)
	{
		String text="we learn java basics as part of java sessions in week1 we learn";
		
		String[]split=text.split("\\s ");
		
		//create an empty set
		Set<String> val=new LinkedHashSet<String>();
		
		//iterate the values from split array
		for(String uniqueWords : split)
		{
			//add the words in set
			val.add(uniqueWords);
			
		}
		System.out.println(val);      
		
	}

}
