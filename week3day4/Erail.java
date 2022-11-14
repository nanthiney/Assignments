package week3day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		
		
WebDriverManager.chromedriver().setup();
		
//To launch Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://erail.in/");
		
		//how to max screen
		
		driver.manage().window().maximize();
		
	
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("ms",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("cape",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='divTopMenu']//label[@for='chkSelectDateOnly']")).click();
		
		//find the number of columns
				List<WebElement> columns = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//th"));
				System.out.println("No: of columns in the table :"+columns.size());
			
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		System.out.println("No: of rows in the table :"+rows.size());
		
		
System.out.println("*********************");
		

  for (int i = 2; i <=rows.size(); i++) { 
	  List<WebElement> trainnames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]//td[2]")); 
	  
	  for(WebElement each:trainnames)
	  {
		  String trainname=each.getText();
  System.out.println("TRain Names in the Table" + trainname); 
  
	  }
 
		
		
	}

}
}