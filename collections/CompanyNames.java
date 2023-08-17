package collections;

import java.util.ArrayList;
import java.util.List;

public class CompanyNames {
	public static void main(String[]args)
	{
	List<String> Name=new ArrayList<String>();
	Name.add("Infosys");
	Name.add("Amazon");
	Name.add("Cognizant");
	Name.add("Google");
	 System.out.println(Name);
	 
	 //to get the size of the values
	 System.out.println(Name.size());
	 
	for(int i=0;i<Name.size();i++)
	{
		String value=Name.get(i);
		System.out.println(value);
	}
	   
	   String string=Name.get(2);
	   System.out.println("Index"+string);
		}
}
