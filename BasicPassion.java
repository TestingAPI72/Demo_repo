package TestCases;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class BasicPassion {

	WebDriver driver;
	String URL="http://www.practiceselenium.com/";
	
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
		WebElement seecollection =driver.findElement(By.xpath(".//a[@class='wsb-button button_theme']/span[text()='See Collection']//parent::a[contains(@id,'90')]"));
		seecollection.click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		String Title= driver.getTitle();
		System.out.println(Title);
		WebElement checkout = driver.findElement(By.xpath(".//div[contains(@id,'wsb')]//a[contains(@id,'16')]"));
		checkout.click();
		WebElement email=driver.findElement(By.xpath(".//div[@class='controls']/input[@class='span6' and contains(@id,'email')]"));
		email.click();email.sendKeys("prasanth2012surya@gmail.com");
		Thread.sleep(3000);
		WebElement name=driver.findElement(By.xpath(".//div[@class='controls']/input[@class='span6' and contains(@id,'name')]"));
		name.click();name.sendKeys("Surya");
		Thread.sleep(3000);
		WebElement address=driver.findElement(By.xpath(".//div[@class='controls']/textarea[@class='span6' and contains(@id,'address')]"));
		address.click();address.sendKeys("Address fields");
		Thread.sleep(3000);
		Thread.sleep(300);
		WebElement dropdown = driver.findElement(By.id("card_type"));
		Select s1 = new Select(dropdown);
		s1.selectByVisibleText("Visa");
		s1.selectByVisibleText("Mastercard");
		WebElement cardno=driver.findElement(By.xpath(".//div[@class='controls']/input[@class='span4' and contains(@id,'card_number')]"));
		cardno.click(); cardno.sendKeys("4598745620");
		WebElement cardholder = driver.findElement(By.xpath(".//div[@class='controls']/input[@class='span5' and contains(@id,'cardholder_name')]"));
		cardholder.click(); cardholder.sendKeys("SuryaPrasanth");
		WebElement place = driver.findElement(By.xpath(".//div[@class='form-actions']//following-sibling::button"));
		place.click();
		Thread.sleep(5000);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		if(Title==Title1)
		{
			System.out.println("Testcase passed");
		}
		
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	
	}
	

