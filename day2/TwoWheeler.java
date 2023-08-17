package week1.day2;

public class TwoWheeler 
{
	int noofWheels=4;
	short noOfMirrors=5; 
	long chassisNumber=8765478908654l; 
	boolean punctured=false;
	String bikeName="pulzer";
	double runningKM=500;

public static void main(String[] args)
  {
	TwoWheeler MyTwoWheeler=new TwoWheeler();
	System.out.println("noofWheels= "+ MyTwoWheeler.noofWheels);
	System.out.println("NoOfMirror= "+ MyTwoWheeler.noOfMirrors);
	System.out.println("chassisNumber= "+ MyTwoWheeler.chassisNumber);
	System.out.println("bikeName= "+ MyTwoWheeler.bikeName);
	System.out.println("punctured= "+ MyTwoWheeler.punctured);
	System.out.println("runningKM= "+ MyTwoWheeler.runningKM);
  }
}

	