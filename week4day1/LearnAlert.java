package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
		
		
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://testleaf.herokuapp.com/pages/Alert.html");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert alert=driver.switchTo().alert();
		//Thread.sleep(2000);
		alert.sendKeys("Technology");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		String text2 = driver.findElement(By.xpath("//p[@id='result1']")).getText();
		System.out.println(text2);
		if(text2.contains("Technology"))
		{
			System.out.println("Text Entered successfully");
		}
		else {
			System.out.println("Text is different");
		}
		
	driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		
		Alert alert1=driver.switchTo().alert();
		//Thread.sleep(2000);
		String text1 = alert1.getText();
		System.out.println(text1);
		alert.accept();
		
		
		
		
		
		
	}

}
