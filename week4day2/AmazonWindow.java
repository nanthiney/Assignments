package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWindow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
				
		//To launch Chrome Browser
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.get("https://www.amazon.in/");
				
				//how to max screen
				
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
				driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
				String Parent = driver.getWindowHandle();
				System.out.println("PArent Window" + Parent);
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> list=new ArrayList<String>(windowHandles);
				System.out.println(list.size());
				driver.switchTo().window(list.get(1));
				
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				
				driver.close();
				driver.switchTo().window(list.get(0));
				
				String title1 = driver.getTitle();
				System.out.println(title1);
				driver.close();

	}

}
