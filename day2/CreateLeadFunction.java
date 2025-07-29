
package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadFunction {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
	options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
	    driver.findElement(By.partialLinkText("CRM")).click();	// TODO Auto-generated method stub
	//ChromeOptions options = new ChromeOptions();
	
	    
	    driver.findElement(By.linkText("Leads")).click();
	    
	    driver.findElement(By.linkText("Create Lead")).click();
	    

	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	    
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	    
	    
	    WebElement element = driver.findElement(By.id("createLeadForm_industryEnumId"));
	    
	    Select dropDown =new Select(element);
	    
	    dropDown.selectByIndex(3);
	    
	    WebElement elementTwo = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    
	    Select list = new Select(elementTwo);
	    list.selectByVisibleText("S-Corporation");
	    
	    WebElement element2 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select source = new Select(element2);
	    source.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement element3 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    
	    Select visit = new Select(element3);
	    visit.selectByIndex(6);
	    
	    WebElement element4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    
	    Select click = new Select(element4);
	    click.selectByValue("TX");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    //driver.findElement(By.linkText("Accounts")).click();
	    
	    
	   // driver.findElement(By.partialLinkText("Create")).click();
	    
	    //driver.findElement(By.partialLinkText("Account")).sendKeys("newElement");
	    
	    
	    }
	//id="createLeadForm_ownershipEnumId" 
	//createLeadForm_marketingCampaignId
	//id="createLeadForm_generalStateProvinceGeoId" TX accountName
	//Accounts Create Accoun

}
