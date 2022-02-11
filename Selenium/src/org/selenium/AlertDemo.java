package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement btn1 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		btn1.click();
		
		Thread.sleep(3000);
		
		WebElement btn2 = driver.findElement(By.xpath("//*[@id=\'Textbox\']/button"));
		btn2.click();
		
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Chitra");
		
		Thread.sleep(3000);
		alert.accept();
		
		
		
	}

}
