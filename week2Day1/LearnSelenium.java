package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		/*
		 * String path=System.getProperty("webdriver.chrome.driver");
		 * System.out.println(path);
		 */
		
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//returntype of get:void or nothing return
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}

}
