package TestCases;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class element {

	WebDriver driver;
	String URL="https://www.expedia.co.in/";
	
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
	public void test()
	{
		WebElement hide =driver.findElement(By.xpath(".//select[@id='child-age-input-0-0' and @class='uitk-field-select']"));
		System.out.println("hidebutton is " + hide.isDisplayed());
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	
}
