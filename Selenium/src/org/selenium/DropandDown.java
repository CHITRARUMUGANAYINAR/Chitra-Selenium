package org.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropandDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		d.get("http://demo.automationtesting.in/Register.html");
		
		d.manage().window().maximize();
		
		WebElement skillBtn = d.findElement(By.id("Skills"));
		
		Select select = new Select(skillBtn);
		select.selectByIndex(20);
		
	    List<WebElement> option = select.getOptions();
	    
	    int len = option.size();
	    System.out.println(len);
	    
//	    WebElement tit = option.get(20);
//	    String txt1 = tit.getText();
//	    System.out.println(txt1);
	    
	    for (int i = 0; i < option.size(); i++) {
	    	WebElement allTxt = option.get(i);
	    	String allTxtprint = allTxt.getText();
	     
	    	System.out.println(allTxtprint);
	    
	    
//	    for (WebElement x : option) {
//			
//	    	String attribute = x.getAttribute("values");
//	    	
//	    	System.out.println(attribute);
		}
	    
		}
	    
	}

