package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFramesChercher {

	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
		
		
		WebElement eleFrame = driver.findElement(By.xpath("(//iframe[@class=' ezlazyloaded'])[1]"));
		driver.switchTo().frame(eleFrame);
		driver.switchTo().frame("frame3");
		
		 driver.findElement(By.xpath("//input[@id='a']")).click();
		 driver.switchTo().defaultContent(); 
	
		 
		 driver.switchTo().frame("frame2");
		 Thread.sleep(1000);
		 
		 WebElement  select1= driver.findElement(By.id("animals"));
			Select obj1=new Select(select1);
			obj1.selectByValue("avatar");
			 Thread.sleep(1000);
			driver.close();
	}

}
