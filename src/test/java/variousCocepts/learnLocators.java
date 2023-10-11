package variousCocepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnLocators {
	WebDriver driver;

	@Before
	public void inti() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void Test() {

		driver.findElement(By.name("firstname")).sendKeys("amy");
		driver.findElement(By.id("sex-1")).click();
		// link text
		driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.navigate().back();
		// driver.findElement(By.partialLinkText("TF-API Product Backend")).click();

		// SCC selector
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
		driver.findElement(By.cssSelector("input#exp-2")).sendKeys("than you");
		// driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();

         //xpath
		// driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("111111");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("1234");
	}
}
