package Encapsulation;

public class Payment {
	
		private  String creditCardNumber="1111 1111 1111 1111";
		
		String getcreditCardnumber()
		{
		  return creditCardNumber;
		  //return-> to access from this class to another class
		}
		
		public void setCreditCardNumber(String creditCardNumber)
		{
			this.creditCardNumber = creditCardNumber;
			//this->current class(to pointout global variable)
	    }

}

