package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		WebElement fname=driver.findElement(By.id("input-firstname"));
		fname.sendKeys("Sriram");
		WebElement lname=driver.findElement(By.id("input-lastname"));
		lname.sendKeys("Srinivasan");
		WebElement email=driver.findElement(By.id("input-email"));
		email.sendKeys("sriram10sachin@gmail.com");
		WebElement pswrd=driver.findElement(By.id("input-password"));
		pswrd.sendKeys("supersurya");
		Thread.sleep(3000);
		driver.findElement(By.id("input-newsletter-yes")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("agree")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		//XPath=//
		
	}

}
