package Encapsulation;

public class MyPayment {
       public static void main(String[]args)
       {
    	   Payment pay=new Payment();
    	   
    	   pay.setCreditCardNumber("555 555 555 555"); 
    	   System.out.println(pay.getcreditCardnumber());
       }
}
