package week3.day1;

public class SecretCharacterANdDigit {
	public static void main(String[]args) {

	String text="gmail1234leaf";
	//replace the letters using replace method
	String replaceAll=text.replaceAll( "[^0-9]", "");
	//print digit
	System.out.println(replaceAll);
	//replace the digit using replace method
	String replaceAll2=text.replaceAll("[^a-z]", "");
			//print letters
			System.out.println(replaceAll2);
}
}
