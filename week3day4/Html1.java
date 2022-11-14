package week3day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html1 {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://html.com/tags/table/");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
	
		//find the number of columns
				List<WebElement> columns = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
				System.out.println("No: of columns in the table :"+columns.size());
			
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("No: of rows in the table :"+rows.size());
		
		
System.out.println("*********************");
		
}}