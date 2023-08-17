package week3.day1;

public class LearnReplaceAll {
	public static void main(String[]args) {
	String text="gmail1234leaf";
	//String replace=text.replaceAll("[^
		String replaceNumber=text.replaceAll("[^0-9]", " " );
		String replaceText=text.replaceAll("[^a-z]","  ")	;	
		System.out.println(replaceNumber);
		System.out.println(replaceText);
	
}
}

