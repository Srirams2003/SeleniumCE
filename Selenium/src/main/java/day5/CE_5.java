package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE_5 {

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-cross-origin=*");

		WebDriverManager.chromedriver().setup();

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.google.com/");
		WebElement search1 = driver1.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search1.sendKeys("Apple");
		search1.sendKeys(Keys.ENTER);
		String currentWindowId1 = driver1.getWindowHandle();
		String currentTitle1 = driver1.getTitle();
		System.out.println("Window Id 1 : " +  currentWindowId1);
		System.out.println("Window Title 1 : " +  currentTitle1);
		
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.google.com/");
		WebElement search2 = driver2.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search2.sendKeys("Selenium");
		search2.sendKeys(Keys.ENTER);
		String currentWindowId2 = driver2.getWindowHandle();
		String currentTitle2 = driver2.getTitle();
		System.out.println("Window Id 2 : " +  currentWindowId2);
		System.out.println("Window Title 2 : " +  currentTitle2);
		
		ChromeOptions brv = new ChromeOptions();
		brv.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver3 = new ChromeDriver(brv);
		driver3.get("https://www.google.com/");
		WebElement search3 = driver3.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search3.sendKeys("Cucumber");
		search3.sendKeys(Keys.ENTER);
		String currentWindowId3 = driver3.getWindowHandle();
		String currentTitle3 = driver3.getTitle();
		System.out.println("Window Id 3 : " +  currentWindowId3);
		System.out.println("Window Title 3 : " +  currentTitle3);
		
	}
}