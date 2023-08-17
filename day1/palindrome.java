package week3.day1;

public class palindrome {
	public static void main(String[]args) {
		String text="malayalam";  //declare String
		String rev="";     //initialize the temp String as rev
		char[] charArray=text.toCharArray();  // convert String into character(to declare single letter)
		for(int i=charArray.length-1;i>=0;i--) { 
			//iterate the character using  reverse for loop
			rev=rev+charArray[i];
			System.out.println(rev);
			if(text.equals(rev)) {
				System.out.println(" It is palindrom");
			}
			else {
				System.out.println(" It is not palindrom");
			
			}
		}
	}
}
		
