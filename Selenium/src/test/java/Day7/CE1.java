package Day7;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CE1 {
	WebDriver driver;
  @Test
  public void check() {
	  driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String exp="Guest Registration Form – User Registration";
	  String act=driver.getTitle();
	  driver.manage().window().maximize();
	  Assert.assertEquals(exp, act);

	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
