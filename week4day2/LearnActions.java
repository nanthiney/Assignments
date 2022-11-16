package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//To launch Chrome Browser
				ChromeDriver driver=new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("https://www.ajio.com/");
				
				//how to max screen
				
				driver.manage().window().maximize();
				WebElement men = driver.findElement(By.linkText("KIDS"));
                 //mouse over an men
				//create an object for actions class
				Actions builder=new Actions(driver);
				//It is mandatory to put perform()
				builder.moveToElement(men).perform();
				
	}

}
