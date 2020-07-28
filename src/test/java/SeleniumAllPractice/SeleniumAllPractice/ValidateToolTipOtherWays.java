package SeleniumAllPractice.SeleniumAllPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateToolTipOtherWays {

	@Test
	public void ToolTipTest()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bommadi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
		
		//first we need to mouse hover to that webelement which has a tooltip
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Hover over me']"))).perform();
		
		//now we nee to capture the tooltip message - for this incase if you can't find this in DOM you need to pause the script in debugger section - press F8 or Function key +F8
		
		String tooltiptext = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();
		System.out.println("tooltiptext");
		Assert.assertTrue(tooltiptext.contains("Hooray!"));
		
	}
	
	
}
