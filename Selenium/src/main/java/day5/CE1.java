package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		Actions a=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, destination).build().perform();

	}

}
