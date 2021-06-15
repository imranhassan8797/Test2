package com.bjs.ecom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationLoginDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\DataDrivenDemo\\src\\com\\bjs\\utilities\\DataDrivenDemo.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String urlData = p.getProperty("url");
		String usernameData = p.getProperty("username");
		String passwordData = p.getProperty("password");
		
		System.out.println(urlData);
		System.out.println(usernameData);
		System.out.println(passwordData);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlData);
		
		WebElement signin = driver.findElement(By.linkText("Sign in"));
		signin.click();
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(usernameData);
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys(passwordData);
	}

}
