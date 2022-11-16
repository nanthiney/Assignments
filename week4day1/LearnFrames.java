package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		
		//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		Alert alert=driver.switchTo().alert();
		
		alert.sendKeys("Nanthiney");
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text2);
		if(text2.contains("Nanthiney"))
		{
			System.out.println("My name is printed successfully");
		}
		else {
			System.out.println("Name is different");
		}
		
	}
	

}
