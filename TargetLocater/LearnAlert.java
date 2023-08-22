package TargetLocater;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	public static void main(String[]args) throws InterruptedException
	{
		//launched broser
		ChromeDriver driver=new ChromeDriver();
		
		//get the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		
		//add wait method
		Thread.sleep(3000);
		
		//control move to an alert
		Alert SimpleAlert=driver.switchTo().alert();
		
		//accept the alert
		SimpleAlert.accept();
		
		
		//to get the text
	     String text=driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		 
		 //print the text
	    System.out.println("getText=" +text);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//control move to an alert
		Alert ConfirmationAlert=driver.switchTo().alert();
		
		//accept the alert(or)dismiss the alert
		ConfirmationAlert.dismiss();
		
		//to get the text
		String text1=driver.findElement(By.xpath("//span[@id='result']")).getText();
		
		//print the text
		System.out.println("getText= " +text1);
		
		Thread.sleep(3000);
		
		//click on sweetAlert
		WebElement Sweet= driver.findElement(By.xpath("(//span[text()='Show'])[3]"));
		Sweet.click();
		
		//click on  dismiss
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//click sweet model dialog
		WebElement model=driver.findElement(By.xpath("(//span[text()='Show'])[4]"));
		model.click();
		
		Thread.sleep(3000);
		
		//close the popup
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//click on prompt dialog
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		
		//to control prompt dialog
		Alert PromptAlert=driver.switchTo().alert();
		
		//to pass the values
		PromptAlert.sendKeys("Sowmya");
		
		//accept the alert
		PromptAlert.accept();
		
	    //click on sweetAlert confirmation
		WebElement Con=driver.findElement(By.xpath("//span[text()='Delete']"));
		Con.click();
		
		Thread.sleep(3000);
	     
		//click on no btn
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		//click on minimize and maximize
		WebElement MaxMin=driver.findElement(By.xpath("(//span[text()='Show'])[6]"));
		MaxMin.click();
		
		Thread.sleep(3000);
		
		//click on minimize icon
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();		
		
		//close the browser
		driver.close();
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
