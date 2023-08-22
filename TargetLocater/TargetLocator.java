package TargetLocater;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLocator 
{
	public static void main(String[]args) throws InterruptedException
	{
		//launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//load the url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		//maximize the browser
		driver.manage().window().maximize();
	
	     //add implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    // control move to  frame
	    driver.switchTo().frame("iframeResult");
	    
		//click on try it
	    driver.findElement(By.xpath("//button[text()='Try it']")).click();
	    
	    //add thread.sleep
	    Thread.sleep(3000);
	    
	    //click cancel
	    Alert ConfirmationAlert= driver.switchTo().alert();
	    ConfirmationAlert.dismiss();
	    
	    //get text
	    String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	    
	    //print the text
	    System.out.println("GetText="+text);
	    
	    //close the browser
	    driver.close();
	    
	    }
}