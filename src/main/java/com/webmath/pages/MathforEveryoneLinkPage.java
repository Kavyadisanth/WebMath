package com.webmath.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.webmath.base.WebMathBase;

public class MathforEveryoneLinkPage extends WebMathBase{
	
	public void mathforEveryoneLink() 
	{
		String mathlink_locator=prop.getProperty("Mathfor_Everyone_Link_Locator");
		driver.findElement(By.xpath(mathlink_locator)).click();
 	}
	
	public void helpTryingMathProblemLink()
	{
		String mathlink_locator=prop.getProperty("Mathfor_Everyone_Link_Locator");
		String mathproblemlink_locator=prop.getProperty("Help_Mathproblem_Link_Locator");
		
		driver.findElement(By.xpath(mathlink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(mathproblemlink_locator)).click();
	}
	
	public void weightonAnotherPlanetLink()
	{
		String mathlink_locator=prop.getProperty("Mathfor_Everyone_Link_Locator");
		String weighton_another_planetlink_locator=prop.getProperty("Weighton_Another_Planet_Link_Loctator");
		
		driver.findElement(By.xpath(mathlink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(weighton_another_planetlink_locator)).click();
	}
	
	public void planetDropdown()
	{
		String mathlink_locator=prop.getProperty("Mathfor_Everyone_Link_Locator");
		String weighton_another_planetlink_locator=prop.getProperty("Weighton_Another_Planet_Link_Loctator");
		String planet_dropdown_locator=prop.getProperty("Planet_Dropdown_Locator");
		String planet_option=prop.getProperty("Planet_Option");
		
		driver.findElement(By.xpath(mathlink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(weighton_another_planetlink_locator)).click();
		driver.findElement(By.xpath(planet_dropdown_locator)).click();
		driver.findElement(By.xpath(planet_option)).click();
	}
	
	public void weighButton() {
		String mathlink_locator=prop.getProperty("Mathfor_Everyone_Link_Locator");
		String weighton_another_planetlink_locator=prop.getProperty("Weighton_Another_Planet_Link_Loctator");
		String weight_textbox_locator=prop.getProperty("Weigh_Textbox_Locator");
		String weight_textbox_input=prop.getProperty("Weigh_Textbox_Input");
		String planet_dropdown_locator=prop.getProperty("Planet_Dropdown_Locator");
		String planet_option=prop.getProperty("Planet_Option");
		String weight_button_locator=prop.getProperty("Weigh_Button_Locator");
		
		driver.findElement(By.xpath(mathlink_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(weighton_another_planetlink_locator)).click();
		driver.findElement(By.xpath(weight_textbox_locator)).sendKeys(weight_textbox_input);
		driver.findElement(By.xpath(planet_dropdown_locator)).click();
		driver.findElement(By.xpath(planet_option)).click();
		driver.findElement(By.xpath(weight_button_locator)).click();
	}

	
}
