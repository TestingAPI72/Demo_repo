package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Case1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "D:/Driver/chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		String Url ="https://www.google.com/";
		driver.get(Url);
		driver.close();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("name")));
		element.click();
		WebElement element = wait.until(ExpectedConditions.elementToBeSelected(locator)
	}

}
