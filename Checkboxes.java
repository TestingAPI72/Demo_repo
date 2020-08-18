package TestCases;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	WebDriver driver;
	String URL="https://letskodeit.teachable.com/p/practice";
	
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
		WebElement e1 = driver.findElement(By.xpath(".//input[@id='bmwradio']"));
		e1.click();
		WebElement e2 = driver.findElement(By.xpath(".//input[@id='benzradio']"));
		e2.click();
		WebElement e3 = driver.findElement(By.xpath(".//input[@id='bmwcheck']"));
		e3.click();
		WebElement e4 = driver.findElement(By.xpath(".//input[@id='hondacheck']"));
		e4.click();
		
		System.out.println("e1 is element is"+ e1.isSelected());
		System.out.println("e2 is element is"+ e2.isSelected());
		System.out.println("e3 is element is"+ e3.isSelected());
		System.out.println("e4 is element is"+ e4.isSelected());	
		
	}

	@After
	public void tearDown() throws Exception
	{
		driver.quit();
	}

	

}
