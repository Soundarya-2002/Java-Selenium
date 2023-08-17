package week1.day2;

public class Mobile {
		    String mobileBrandName="Vivo";
			char mobileLogo='V';
			short noOfMobilePiece=2;
			int modelNumber=3764;
			long mobileNumber=9754446356l;
			float mobilePrice=35000f;
			boolean damaged=false;

	public static void main(String[] args) {
		
	Mobile myMobile=new Mobile();
	System.out.println("mobileBrandName=" +myMobile.mobileBrandName);
	System.out.println("mobileLogo=" +myMobile.mobileLogo);
	System.out.println("noOfMobilePiece=" +myMobile.noOfMobilePiece);
	System.out.println("modelNumber=" +myMobile.modelNumber);
	System.out.println("mobileNumber=" +myMobile.mobileNumber);
	System.out.println("mobilePrice=" +myMobile.mobilePrice);
	System.out.println("damaged=" +myMobile.damaged);
	
	}

	}
