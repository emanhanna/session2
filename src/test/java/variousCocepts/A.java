package variousCocepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	//LearnLocators
WebDriver driver;
		
		@Before
		public void init() {
			
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://objectspy.space/");
			driver.manage().window().maximize();
			//Implicitly wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		@Test
		public void testLocators() {
			
			driver.findElement(By.name("firstname")).sendKeys("Selenium");
			driver.findElement(By.id("sex-1")).click();
			
			//upload file
			//Robot class if the tag in other than <input>
			//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\shiha\\OneDrive\\Desktop\\Techfios Class\\Selenium\\Selenium\\Session 1.pptx");
			
			//link text
			driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
			driver.navigate().back();
//			driver.findElement(By.partialLinkText("Product")).click();
			
			//CSS Selector
			driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
			driver.findElement(By.cssSelector("input#exp-3")).click();
//			driver.findElement(By.cssSelector("a[href$='http://techfios.com/api-prod/api/']")).click();
			
			
			//xPath
//			driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("what ever");
			driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("what ever");
			//links text
			//driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
			driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click()	;
		}

	}


