package day1_18052024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@DataProvider(name="dataSet")
	public Object[][] searchPhoneData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="Oppo";
		data[0][1]="Reno 11";
		
		data[1][0]="OnePlus";
		data[1][1]="11 R";
		
		data[2][0]="iPhone";
		data[2][1]="15 Pro";
		
		
		return data;
	}
	
	@Test(dataProvider = "dataSet")
	public void searchPhone(String brand, String model) throws InterruptedException
	{
	
		try {
			WebElement close=driver.findElement(By.xpath("//div[@class='JFPqaw']/child::span[1]"));
			if(close.isDisplayed())
			{
				close.click();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys(brand+" "+model);
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	}

}
