package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		WebElement rname=driver.findElement(By.name("cusid"));
		rname.sendKeys("401");
		
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().dismiss();
		
		WebElement dname=driver.findElement(By.name("cusid"));
		dname.sendKeys("402");
		
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().accept();
		
		

	}

}
