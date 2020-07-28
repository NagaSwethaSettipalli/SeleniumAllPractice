package SeleniumAllPractice.SeleniumAllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidatingToolTip {
	WebDriver driver;
	public void setUP() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommadi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
	}
	public void ValidatetoolTip() throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("age")));
		Thread.sleep(2000);
		String tooltip = driver.findElement(By.id("age")).getAttribute("aria-describedby");
		if(tooltip.contains("ui-id-"))
		{
			System.out.println("Tooltip is diplayed");
		}
		else
		{
			System.out.println("Tooltip is not displayed");
		}
	    }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ValidatingToolTip tt = new ValidatingToolTip();
		tt.setUP();
		tt.ValidatetoolTip();
	}

}
