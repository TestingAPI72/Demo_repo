package TestCases;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
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
	public void test() throws InterruptedException 
	{
		WebElement element =driver.findElement(By.id("carselect"));
		Select s1 = new Select(element);
		Thread.sleep(3000);
		s1.selectByIndex(2);
		Thread.sleep(3000);
		s1.selectByValue("benz");
		Thread.sleep(3000);
		s1.selectByVisibleText("Honda");
		Thread.sleep(3000);
		
		List<WebElement>dropdown = s1.getOptions();
		int size = dropdown.size();
		for(int i=0;i<size;i++)
		{
		String options=	dropdown.get(i).getText();
			System.out.println(options);
		}
		
	}
		

	@After
	public void tearDown() throws Exception 
	{
		Thread.sleep(3000);
		driver.quit();
	}


}
