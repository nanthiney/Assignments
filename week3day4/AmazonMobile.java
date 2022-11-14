package week3day4;

import java.time.Duration;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AmazonMobile {


	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		//how to max screen
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> t=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Total no of Mobile Phones is "+ t.size());
		
		
		  for (WebElement each : t) {
		  
		   String c=each.getText(); 
		  System.out.println(c);
		  }
		  
			  Set<String> s=new LinkedHashSet<String>();
			  System.out.println("Total no of Mobile Phones is "+ s.size());
			  
				/*
				 * for (String each : c) { s.add(each); } System.out.println(s);
				 */
			
			 
		
		
		
		
		
		
		
	}


}