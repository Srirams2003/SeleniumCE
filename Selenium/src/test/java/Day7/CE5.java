package Day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class CE5 {
	WebDriver driver;
  @Test(groups="SmokeTest")
  public void check() {
	  String text = driver.getTitle();
	  String expected="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
	  Assert.assertEquals(text,expected);
  }
  
  @SuppressWarnings("deprecation")
@Test(groups="RegressionTest")
  public void testcase2() throws InterruptedException
  {
		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul/li[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
		Thread.sleep(6000);

	  driver.close();
	  
  }

}
