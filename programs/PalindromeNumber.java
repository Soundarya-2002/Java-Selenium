package Important.programs;

public class PalindromeNumber {
	public static void main(String[]args) {
		int rev=0,temp;
		int a=121;
		int b;
		temp=a;
		while(a>0) {
			b=a%10;
			rev=(rev*10)+b;
			a=a/10;
		}
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
