package com.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE5_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.findElement(By.linkText("Clothing (5)")).click();
		
		List<WebElement> pr=driver.findElements(By.xpath("//h2[@itemprop=\"name\"]"));
		
		for(int i=0;i<pr.size();i++)
		{
			System.out.println(pr.get(i).getText());
		}
	}


}
