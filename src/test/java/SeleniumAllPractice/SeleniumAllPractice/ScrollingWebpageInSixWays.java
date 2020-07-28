package SeleniumAllPractice.SeleniumAllPractice;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollingWebpageInSixWays {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommadi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.amazon.com.au"); //this url for first 3 types of scroll
		// driver.get("https://www.album.alexflueras.ro/index.php");// 4th type of scroll horizontal scroll
		//driver.get("http://the-internet.herokuapp.com/horizontal_slider"); - 5th type of scroll only for horizontal slider using webelement
		//driver.get("http://the-internet.herokuapp.com/infinite_scroll");// 6th type of scroll - dynamic loop
		driver.get("http://demo.automationtesting.in/WebTable.html"); //7th type  scrolling with in the webelement
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// 1* Scroll to specific loacation(x,y cordinates)
		// js.executeScript("window.scrollTo(0,1500)");

		// 2* Scroll upto specific element
		// WebElement todaysdeals =
		// driver.findElement(By.xpath("//*[@id=\"deals-shoveler-ns_SCXZYB39524M0TTS4F4P_2738_\"]/div[1]/h2/span"));
		// js.executeScript("arguments[0].scrollIntoView(true)", todaysdeals);

		// 3* Scroll to bottom of the page
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// 4* Horizontal Scrolling(x,y coordinates)
		//js.executeScript("window.scrollTo(10000,0)");

		// 5* Scroll bar - WebElement
		// here we don't need to use jsexecutor we can just get the scroll element path and use sendkeys(keys.end)
		//WebElement slider = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
		//slider.sendKeys(Keys.END);
		
		//6* Scroll dynamically for loading pages (loop)
		/*
		 * long initialHeight =
		 * (long)(js.executeScript("return document.body.scrollHeight")); while(true) {
		 * js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 * Thread.sleep(2000); long currentHeight =
		 * (long)(js.executeScript("return document.body.scrollHeight"));
		 * if(initialHeight==currentHeight) { break; } initialHeight = currentHeight ; }
		 */
		//7th type of scrolling - Scrolling with in the webelement
		
		WebElement itemsPerPageDropdown = driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[2]/div[1]/div[2]/select"));
		Select select = new Select(itemsPerPageDropdown);
		select.selectByVisibleText("30");
		Thread.sleep(7000);
		EventFiringWebDriver eve = new EventFiringWebDriver(driver);
		eve.executeScript("document.querySelector(div[role= 'rowgroup'][class*='ui-grid-viewport']).scrollTop = 500");
	}

}
