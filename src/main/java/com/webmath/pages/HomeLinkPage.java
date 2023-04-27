package com.webmath.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.webmath.base.WebMathBase;

public class HomeLinkPage extends WebMathBase {
	
	public void homeLink() {
		String homelink_locator=prop.getProperty("Home_Link_Locator");
		driver.findElement(By.xpath(homelink_locator)).click();
 	}
	
	public void chooseMathHelpItemDropdown() {
		
		String homelink_locator=prop.getProperty("Home_Link_Locator");
		String help_item_dropdown_locator=prop.getProperty("Choose_Math_Help_Item_Dropdown_Locator");
		String numbers_multiplying_option=prop.getProperty("Numbers_Mutiplying_Option");
		
		driver.findElement(By.xpath(homelink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(help_item_dropdown_locator)).click();
		driver.findElement(By.xpath(numbers_multiplying_option)).click();
		
 	}
	
	public void multiplicationTextbox()
	{
		String homelink_locator=prop.getProperty("Home_Link_Locator");
		String help_item_dropdown_locator=prop.getProperty("Choose_Math_Help_Item_Dropdown_Locator");
		String numbers_multiplying_option=prop.getProperty("Numbers_Mutiplying_Option");
		String textbox1_locator=prop.getProperty("Multiplication_Textbox1_Locator");
		String textbox2_locator=prop.getProperty("Multiplication_Textbox2_Locator");
		String textbox1_input=prop.getProperty("Multiplication_Textbox1_Input");
		String textbox2_input=prop.getProperty("Multiplication_Textbox2_Input");
		
		driver.findElement(By.xpath(homelink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(help_item_dropdown_locator)).click();
		driver.findElement(By.xpath(numbers_multiplying_option)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(textbox1_locator)).sendKeys(textbox1_input);
		driver.findElement(By.xpath(textbox2_locator)).sendKeys(textbox2_input);
		
	}
	
	public void multiplyButton() {
		
		String homelink_locator=prop.getProperty("Home_Link_Locator");
		String help_item_dropdown_locator=prop.getProperty("Choose_Math_Help_Item_Dropdown_Locator");
		String numbers_multiplying_option=prop.getProperty("Numbers_Mutiplying_Option");
		String textbox1_locator=prop.getProperty("Multiplication_Textbox1_Locator");
		String textbox2_locator=prop.getProperty("Multiplication_Textbox2_Locator");
		String textbox1_input=prop.getProperty("Multiplication_Textbox1_Input");
		String textbox2_input=prop.getProperty("Multiplication_Textbox2_Input");
		String multiply_button=prop.getProperty("Multiplication_Button");
		String multiplication_result=prop.getProperty("Result");
		
		driver.findElement(By.xpath(homelink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(help_item_dropdown_locator)).click();
		driver.findElement(By.xpath(numbers_multiplying_option)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath(textbox1_locator)).sendKeys(textbox1_input);
		driver.findElement(By.xpath(textbox2_locator)).sendKeys(textbox2_input);
		driver.findElement(By.xpath(multiply_button)).click();
		
		driver.switchTo().frame(1);
		
		WebElement result=driver.findElement(By.xpath(multiplication_result)); 
		int actual_result=Integer.parseInt(result.getText());
		int expected_result=25*15;
		Assert.assertEquals(actual_result, expected_result,"Actual Result " +actual_result + "Expected Result "+expected_result);
		
		
	}
	
}
