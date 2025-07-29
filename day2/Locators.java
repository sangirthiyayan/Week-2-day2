package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
			
			ChromeDriver driver = new ChromeDriver(options);		
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
		    driver.findElement(By.partialLinkText("CRM")).click();
	    
	        driver.findElement(By.linkText("Accounts")).click();
	        
	        driver.findElement(By.linkText("Create Account")).click();
	        driver.findElement(By.id("accountName")).sendKeys("sam");
	        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	        WebElement element = driver.findElement(By.name("industryEnumId"));
	        Select drop = new Select(element);
	        drop.selectByIndex(3);
	        WebElement element2 = driver.findElement(By.id("dataSourceId"));
	        Select down = new Select(element2);
	        down.selectByVisibleText("Employee");
	        WebElement element3 = driver.findElement(By.id("marketingCampaignId"));
	        Select click = new Select(element3);
	        click.selectByIndex(6);
	        WebElement element4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select choose = new Select(element4);
	        choose.selectByValue("TX");
	        driver.findElement(By.className("smallSubmit")).click();
	        driver.close();
	         
	}
	
	//name="industryEnumId" index4
	//id="dataSourceId"
	
	

}
