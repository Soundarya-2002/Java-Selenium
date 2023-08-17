package week1.day3;

public class Arithmatic {
	public void addition(int addition) {
		System.out.println("Addition= "+ addition);
	}
	public void subtraction(long subtraction) {
		System.out.println("subtraction= "+subtraction);
	}
	public void multiplication(int multiplication) {
		System.out.println("multiplication= "+multiplication);
	}
	public void devision(int devision) {
		System.out.println("devision= "+devision);
	}
	public void modulos(int modulas) {
		System.out.println("modulas= "+modulas);
	}
	public static void main(String[]args) {
		Arithmatic operators=new Arithmatic();
		operators.addition(8+6);
		operators.subtraction(9-6);
		operators.multiplication(7*8);
		operators.devision(9/6);
		operators.modulos(8%4);
	}
}
		
	
