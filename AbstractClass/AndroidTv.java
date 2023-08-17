package AbstractClass;

public  class AndroidTv extends SamsungTv {
	public void enableWifi() {
		System.out.println("Enable wifi");
	}
	public void SwitchOnTv() {
		System.out.println("Switch On Tv");
	}
	void ChangeChannel() {
		System.out.println("Change Channel");
	}
	public static void main(String[]args) {
		AndroidTv Tv=new AndroidTv();
		Tv.enableWifi();
		Tv.SwitchOnTv();
		Tv.ChangeChannel();
		Tv.FaceAuthendication();
	}
	
}
