package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		driver.manage().window().maximize();
		
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Sriram");
		
		WebElement email=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		email.sendKeys("supersurya@gmail.com");
		
		WebElement name=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		name.sendKeys("Surya");
		
		WebElement yemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yemail.sendKeys("soopusurya@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]")).click();
		
		WebElement msg=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		msg.sendKeys("Today is my Birthday!");
		
		WebElement amt=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amt.clear();
		amt.sendKeys("1000");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
		
		
		
		

	}

}
