package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2Snapdeal {

	/*
	 * Assignment 1: ============ 1. Launch https://www.snapdeal.com/ 2. Go to Mens
	 * Fashion 3. Go to Sports Shoes 4. Get the count of the sports shoes 5. Click
	 * Training shoes 6. Sort by Low to High 7. Check if the items displayed are
	 * sorted correctly 8.Select the price range (900-1200) 9.Filter with color
	 * yellow 10 verify the all applied filters 11. Mouse Hover on first resulting
	 * Training shoes 12. click QuickView button 13. Print the cost and the discount
	 * percentage 14. Take the snapshot of the shoes.
	 */

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		// To launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.snapdeal.com/");

		// how to max screen

		driver.manage().window().maximize();

		// Go to Mens Fashion
		// Go to Sports Shoes

		driver.findElement(By.xpath("(//span[@class='catText'])[1]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]")).click();

		// Get the count of the sports shoes

		WebElement count = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]"));
		System.out.println("Total count of sports shoes " + count.getText());

		// Click Training shoes
		driver.findElement(By.xpath("//div[contains(text(),'Training Shoes')]")).click();
		
		// Sort by Low to High
		driver.findElement(By.xpath("//span[@class='sort-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='search-li']")).click();

		List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < price.size(); i++) {

			String replace = price.get(i).getText().replace("Rs. ", "").replace(",","");
			 int parseInt = Integer.parseInt(replace);
			    list.add(parseInt);
		}
		
		Collections.sort(list);
		System.out.println(list);
		Boolean sort=false;
		
		for (int i = 0; i < price.size(); i++) {
			
			if(list.get(0)<=list.get(i)) {
				
				sort=true;
			}
			
			else {
				sort=false;
				break;
			}
		}
		
		if(sort) {
			System.out.println("Items are sorted");
		}
		else {
			System.out.println("Items are not sorted");
		}

		//Select the price range (900-1200)
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("900");
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		//Filter with color yellow 
		/*
		 *  Thread.sleep(3000); WebElement ele =
		 * driver.findElement(By.
		 * xpath("//span[text()='Did you find what you are looking for? ']"));
		 * builder.scrollToElement(ele).perform();
		 */
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']")).click();
		
		
		//verify the all applied filters 
		Boolean Display = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).isDisplayed();
		System.out.println("All the filters are available:"+Display);
		
		//Mouse Hover on first resulting Training shoes
		Thread.sleep(3000);
		WebElement quick= driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(quick).perform();
		
		//click QuickView button
		 driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		 
		 
		// Print the cost and the discount percentage
			Thread.sleep(3000);
		 WebElement price1 = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']"));
		 String p=price1.getText();
		 System.out.println(p);
		 
		 
		 //Take the snapshot of the shoes.
		 
		 File source = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/snap.png");
			FileUtils.copyFile(source, dest);
			Thread.sleep(2000);
			driver.close(); 
		}
	}


