package week1.day3;

public class Laptop {
	public void Typing(String Typing) {
		System.out.println("Typing= "+Typing);
	}
	public void WatchingVideo(String WatchingVideo) {
		System.out.println("WatchingVideo= "+WatchingVideo);
	}
	public void SendMail(String SendMail) {
		System.out.println("SendMail=" +SendMail);
	}
	public static void main(String[]args) {
		Laptop MyLaptop=new Laptop();
		MyLaptop.Typing("manishree");
		MyLaptop.WatchingVideo("JavaCourse");
		MyLaptop.SendMail("Hiii");
		Laptop MyLaptop2=new Laptop();
		MyLaptop2.Typing("Ajju");
		MyLaptop2.WatchingVideo("Selenium");
		MyLaptop2.SendMail("Good Morning");
		}
}
