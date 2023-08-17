package week3.day1;

public class EqualMethod {
     public static void main(String[]args) {
	String text="testleaf";
	String text2="testleaf";
	if(text.equals(text2)) {
		System.out.println("both are equal");
	}
	else {
		System.out.println("not equal");
	}
	if(text==text2) {
		System.out.println("equal");
	}
	else {
		System.out.println("using==" +"both not equal");
}
}
}