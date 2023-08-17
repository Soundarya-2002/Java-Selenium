package week1.day3;

public class Factorial {
	public static void main(String[] args) {
		//5*4*3*2*1=120
		int fact=1;                 //Initialize temp variable as fact
		for(int i=5;i>=1;i--) {    //iterate for loop using reverse order
			fact=fact*i;           //multiply the iterating value and store in fact variable
			System.out.println(fact);
		}
	}

}
