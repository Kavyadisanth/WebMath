package com.webmath.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.webmath.base.WebMathBase;

public class AlgebraLinkPage extends WebMathBase{
	
	public void algebraLink()
	{
		String algebralink_locator=prop.getProperty("Algebra_Link_Locator");
		driver.findElement(By.xpath(algebralink_locator)).click();
	}
	
	public void squarerootsLink()
	{
		String algebralink_locator=prop.getProperty("Algebra_Link_Locator");
		String squarerootslink_locator=prop.getProperty("SquareRoots_Link_Locator");
		
		driver.findElement(By.xpath(algebralink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(squarerootslink_locator)).click();
	}
	
	public void simplifyButton()
	{
		String algebralink_locator=prop.getProperty("Algebra_Link_Locator");
		String squarerootslink_locator=prop.getProperty("SquareRoots_Link_Locator");
		String squareroots_textbox=prop.getProperty("SquareRoot_Textbox");
		String squareroot_input=prop.getProperty("SquareRoot_Textbox_Input");
		String simplify_button=prop.getProperty("Simplify_Button");
		String squareroot_result=prop.getProperty("squareroot_Result");
		
		driver.findElement(By.xpath(algebralink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(squarerootslink_locator)).click();
		driver.findElement(By.xpath(squareroots_textbox)).sendKeys(squareroot_input);
		driver.findElement(By.xpath(simplify_button)).click();
		
driver.switchTo().frame(1);
		
		WebElement result=driver.findElement(By.xpath(squareroot_result)); 
		int actual_result=Integer.parseInt(result.getText());
		int expected_result=(int) Math.sqrt(25);
		Assert.assertEquals(actual_result, expected_result,"Actual Result " +actual_result + "Expected Result "+expected_result);
		
		
	}
	
	
	
	

}
