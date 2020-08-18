package TestCases;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookJunitlogin {
	
	WebDriver driver;
	String URL="https://www.facebook.com/";
	
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:/Driver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(3000);		
	}

	@Test
	public void test() throws InterruptedException 
	{
		WebElement element = driver.findElement(By.xpath(".//table[@role='presentation']//following-sibling::tr[1]//input[@type='email']"));
		element.click();
		System.out.println("element is "+ element.isEnabled());
		element.sendKeys("suryaprasanth7368@yahoo.in");
		WebElement element1 = driver.findElement(By.xpath(".//table[@role='presentation']//following-sibling::td//input[@type='password']"));
		element1.click();
		element1.sendKeys("Surya@123");
		WebElement element2 =driver.findElement(By.xpath(".//table[@role='presentation']//following-sibling::td//input[@type='submit']"));
		element2.click();
		Thread.sleep(3000);
	}
	
	@After
	public void tearDown() throws Exception
	{
		Thread.sleep(300000);
		driver.quit();

	}

	

}
