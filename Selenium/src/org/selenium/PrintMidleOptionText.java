package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintMidleOptionText {

	public static void main(String[] args) throws Exception  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement crtAcc = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		crtAcc.click();
		
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select select = new Select(year);
		
		List<WebElement> totalYears = select.getOptions();
		
		for (WebElement x : totalYears) {
			
			String text = x.getText();
			System.out.println(text);
		}
		
			
			
			
		}
		
		
		
		
		
	}


				
		

	

