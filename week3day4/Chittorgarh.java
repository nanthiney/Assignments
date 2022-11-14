package week3day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();
		
//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.chittorgarh.com/");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'NSE Bulk')]")).click();
		Thread.sleep(2000);
		
		//find the number of columns
				List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//th"));
				System.out.println("No: of columns in the table :"+columns.size());
			
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		System.out.println("No: of rows in the table :"+rows.size());
		System.out.println("Security names with Duplicates");
		 
		 List<String> list=new ArrayList<String>();
		 
		 for (WebElement each : rows) {
			
				String securityname=each.getText();
		        list.add(securityname);
		  
			  }
		 System.out.println(list); 
			  
		 Set<String> s=new LinkedHashSet<String>(list);
		 System.out.println("No: of rows in the table after removing Duplicates:"+s.size());
		 System.out.println("Security names after removing Duplicates:"+ s);
		 
		driver.close();
		
	}
	

}
