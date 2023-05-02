package com.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CE5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String actualURL="https://j2store.net/free/";
		String expected="https://j2store.net/free/";
		
		if(expected.equals(actualURL))
		{
			System.out.println("URL Matched");
		}
		
		else
		{
			System.out.println("URL not matched");
		}
		
		driver.findElement(By.linkText("Clothing (5)")).click();
	}

}
