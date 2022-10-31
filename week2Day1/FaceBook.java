package week2Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	private static WebElement webElement;

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
		/*
		 * String path=System.getProperty("webdriver.chrome.driver");
		 * System.out.println(path);
		 */
		
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//returntype of get:void or nothing return
		driver.get("https://www.facebook.com/");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Nanthiney");
		driver.findElement(By.name("lastname")).sendKeys("Sathish");
		driver.findElement(By.name("reg_email__")).sendKeys("nanthineysathish@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Vedha");
		driver.findElement(By.name("sex")).click();
//select
		
		//return type for findelement is webelement
		WebElement  select1= driver.findElement(By.id("day"));
		Select obj1=new Select(select1);
		obj1.selectByValue("10");
		
		WebElement  select2= driver.findElement(By.id("month"));
		Select obj2=new Select(select2);
		obj2.selectByVisibleText("Sep");
		
		
		WebElement  select3= driver.findElement(By.id("year"));
		Select obj3=new Select(select3);
		obj3.selectByIndex(1);
		
		//driver.close();
	}


}