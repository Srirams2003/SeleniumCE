package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-cross-origin=*");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.abhibus.com/bus-ticket-booking");

		driver.manage().window().maximize();
		Thread.sleep(6000);

		WebElement from = driver.findElement(By.xpath("//*[@id=\"source\"]"));

		from.sendKeys("Coimbatore");

		WebElement to = driver.findElement(By.xpath("//*[@id=\"destination\"]"));

		to.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[4]/a")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]")).click();		
		
	}

}
