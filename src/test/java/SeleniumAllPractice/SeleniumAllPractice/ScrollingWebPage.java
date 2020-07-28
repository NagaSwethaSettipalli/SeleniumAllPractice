package SeleniumAllPractice.SeleniumAllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

	WebDriver driver;

	public void setUP() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommadi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	}
	
public void scrollDown()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,500)");
	
}
public void scrollUP()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy()0,-500)");
}
public void sleep() 
{
	try {
	Thread.sleep(2000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
}
public static void main(String args[]) {

	ScrollingWebPage sw = new ScrollingWebPage();
	sw.setUP();
	sw.scrollDown();
	sw.sleep();
	sw.scrollDown();
	sw.sleep();
	sw.scrollUP();
	

		// Scrolling by pixel
		// js.executeScript("window.scrollBy(0,1000)", "");// we dont need to scroll
		// horizontally so keeping xcoordinate as zero

		// Scrolling page till we find specific element
		// WebElement flag =
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[2]"));
		// js.executeScript("arguments[0].scrollIntoView();", flag);

		// Scrolling to bottom of the page
	    //js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // 0 means from starting to end

	}

}
