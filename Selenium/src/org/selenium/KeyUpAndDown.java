package org.selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpAndDown {             
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);

		WebElement search = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys("samsung").keyUp(Keys.SHIFT).perform();
		
		

	
	}

}
