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

public class ListofElements {

	WebDriver driver;
	String URL="https://www.ironspider.ca/forms/checkradio.htm";
	
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
	boolean iradiobutton=false;
		List<WebElement> radiobutton = driver.findElements(By.xpath(".//input[contains(@type,'checkbox') and contains(@name,'color')]"));
		int size = radiobutton.size();
	
		for(int i=0;i<size;i++)
		{
			iradiobutton=radiobutton.get(i).isSelected();
			if(!iradiobutton) {
				radiobutton.get(i).click();
				Thread.sleep(3000);
			}
			
		}
		
	}
		
	@After
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit();
	}

	


}
