package week3day4;

import java.time.Duration;
import java.util.ArrayList;
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


public class AmazonMobile2 {


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
		
		
		  List<Integer> list=new ArrayList<Integer>();
		  
		  System.out.println(list);
		  
			/*
			 * int size=t.size();
			 * 
			 * for (int i=0;i<size;i++) {
			 * 
			 * String replace=t.get(i).getText().replace(",","");
			 * System.out.println(replace);
			 * 
			 * int parseInt=Integer.parseInt(replace);
			 * //System.out.println("Convered value:"+parseInt); list.add(parseInt);
			 * 
			 * } Collections.sort(list); System.out.println(list);
			 * System.out.println("List Size"+list.size());
			 * 
			 * Set<Integer> s=new TreeSet<Integer>(list); System.out.println(s);
			 * System.out.println(s.size());
			 * 
			 * if(list.size()==s.size()) {
			 * 
			 * System.out.println("No duplicates"); }
			 * 
			 * else { System.out.println("Duplicates"); }
			 * 
			 * 
			 * 
			 * 
			 */
		
		
		
	}


}