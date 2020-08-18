package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:/Driver/chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		String Url ="https://www.facebook.com/";
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement email=driver.findElement(By.cssSelector("#email"));
		WebElement password =driver.findElement(By.cssSelector("input#pass"));
		WebElement login= driver.findElement(By.cssSelector("input[value='Log In']"));
		email.click();
		password.click();	
		email.sendKeys("suryaprasanth7368@yahoo.com");
		Thread.sleep(3000);
		password.sendKeys("Surya@123");
		Thread.sleep(3000);
		login.click();
		Thread.sleep(40000);
		WebElement Logout= driver.findElement(By.cssSelector("div[class='j83agx80 l9j0dhe7']"));
		Logout.click();
		WebElement Logout1= driver.findElement(By.cssSelector("div[xpath='1']"));
		Logout1.click();
			
	}

}
