package org.selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverActions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
	
		
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
	
		Actions action = new Actions(driver);
		action.moveToElement(course).perform();
		
		
		WebElement oracle = driver.findElement(By.xpath("//span[text()='Oracle Training']"));

		Actions action1 = new Actions(driver);
		action1.moveToElement(oracle).perform();
		
		
		WebElement sqlCertificate = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		sqlCertificate.click();
		
		
	}
	

}
