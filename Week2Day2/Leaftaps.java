package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {

	
	public static void main(String[] args) throws InterruptedException {
		
       WebDriverManager.chromedriver().setup();
		
	
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//returntype of get:void or nothing return
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		//how to max screen
		
		driver.manage().window().maximize();
		//Attribute based xpath
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("democsr2");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Partial Attribute based xpath
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		//Partial Text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//Text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Partial Text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		//Collective/index path
		
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Com");
		//Partial Attribute based xpath
		String name="Nanthiney";
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys(name);
		
		//Collective/index path
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Sathish");
	
		// Attribute based xpath
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Partial Text based xpath
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		//Collective/index path
	
		
		driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("Company");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		Thread.sleep(3000);
		
	//Lead Creation
		String firstname=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
System.out.println(firstname);
		
		if(name.equals(firstname)) {
			System.out.println("lead is created");
		}else {
			System.out.println("lead is not created");
		}
		
		//Lead Updation
		
		String com1=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		
		System.out.println(com1);
				
				if(com1.contains("Com")) {
					System.out.println("lead is updated");
				}else {
					System.out.println("lead is not updated");
				}

		
		
		
	}

}
