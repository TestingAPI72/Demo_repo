package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "D:/Driver/chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		String URL="https://letskodeit.teachable.com/";
		driver.get(URL);
		driver.manage().window().maximize();
		WebElement element= driver.findElement(By.xpath(".//center//a[contains(@class,'btn')and contains(text(),'View All Courses')]"));	
		element.click();
		Thread.sleep(3000);

		//WebElement element1 =driver.findElement(By.xpath(".//div[@class='nav-search-scope nav-sprite']//option[@value='search-alias=fashion']"));
		//element1.click();
	}

}
