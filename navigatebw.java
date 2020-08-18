package TestCases;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatebw {

	WebDriver driver;
	String URL="https://www.oneplus.in//";
	
	@Before
	public void setUp() throws Exception {
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
		String AURL= driver.getTitle();
		System.out.println(AURL);
		
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String forward ="https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(forward);
		currentURL=driver.getCurrentUrl();
		System.out.println("To url "+ currentURL);
		Thread.sleep(30000);
		driver.navigate().back();
		currentURL=driver.getCurrentUrl();
		System.out.println("back url" +currentURL);
		Thread.sleep(30000);
		driver.navigate().forward();
		currentURL=driver.getCurrentUrl();
		System.out.println("forward url" +currentURL);
		driver.navigate().refresh();
	}
	
	
	
	@After
	public void tearDown() throws Exception
	{
		driver.quit();
	}

	

}
