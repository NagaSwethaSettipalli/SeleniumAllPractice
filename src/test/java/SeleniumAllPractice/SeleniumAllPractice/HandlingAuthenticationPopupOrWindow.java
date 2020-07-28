package SeleniumAllPractice.SeleniumAllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class HandlingAuthenticationPopupOrWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommadi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// http://the-internet.herokuapp.com/basic_auth - actual url

		// http://username:password@http://the-internet.herokuapp.com/basic_auth - with
		// authentication

		// driver.get("http://the-internet.herokuapp.com/basic_auth");

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		// check if the authentication is successful and success message is displayed

		String actualText = driver.findElement(By.tagName("p")).getText();
		String expectedText = "Congratulations! You must have the proper credentials.";

		Assert.assertEquals(expectedText, actualText);
	}
}
