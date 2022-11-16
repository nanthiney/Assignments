package week4day1;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertLeaf {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		
		
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//how to max screen
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Simple Alert
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("SIMPLE ALERT");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		String simpleR = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(simpleR);
		
		//Confirm Alert
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		String text1 = alert1.getText();
		System.out.println("-----------------------------------");
		System.out.println("CONFIRM ALERT");
		System.out.println(text1);
		alert.dismiss();
		String confirmr = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(confirmr);
		
		//Sweet Alert
		
		
				driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
				
				
				String text2 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])//p")).getText();
				System.out.println("-----------------------------------");
				System.out.println("SWEET ALERT");
				System.out.println(text2);
				driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
				
				
				
				  //Sweet Model Dialogue
				Thread.sleep(1000);
				  
				  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
				  

					String text3 = driver.findElement(By.xpath("(//p[@class='m-0'])[1]")).getText();
					System.out.println("-----------------------------------");
					System.out.println("SWEET MODEL DIALOGUE");
					System.out.println(text3);
				  
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[2]")).click();
				  
				  
				//Alert (Prompt Dialog)			
	  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
	Alert alert2=driver.switchTo().alert();
	Thread.sleep(1000);
	alert2.sendKeys("Nanthiney");
	alert2.accept();
	String simple = driver.findElement(By.id("confirm_result")).getText();
	System.out.println("-----------------------------------");
	System.out.println("PROMPT DIALOGUE");
	System.out.println(simple);
	
	
	//Sweet Alert (Confirmation)		
	  
	Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();
	  

		String text4 = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println("-----------------------------------");
		System.out.println("SWEET ALERT");
		System.out.println(text4);
	  
	  
	  driver.findElement(By.xpath("//button[@name='j_idt88:j_idt108']")).click();
	  
	//Minimize and Maximize		
	  
		Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
		  

		  String text5 = driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
			System.out.println("-----------------------------------");
			System.out.println("MINIMUM AND MAXIMUM");
			System.out.println(text5);
			Thread.sleep(2000);
		  driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
	  driver.close();
	}

}
