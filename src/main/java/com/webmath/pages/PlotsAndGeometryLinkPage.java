package com.webmath.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.webmath.base.WebMathBase;

public class PlotsAndGeometryLinkPage extends WebMathBase{
	
	public void plotsAndgeometryLink() {
		String plots_and_geometry_link_locator=prop.getProperty("PlotsAndGeometry_Link_Locator");
		driver.findElement(By.xpath(plots_and_geometry_link_locator)).click();
	}
	
	public void boxesLink() {
		String plots_and_geometry_link_locator=prop.getProperty("PlotsAndGeometry_Link_Locator");
		String boxes_link_locator=prop.getProperty("Boxes_Link_Locator");
		
		driver.findElement(By.xpath(plots_and_geometry_link_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(boxes_link_locator)).click();
	}
	
	public void doItButton() {
		String plots_and_geometry_link_locator=prop.getProperty("PlotsAndGeometry_Link_Locator");
		String boxes_link_locator=prop.getProperty("Boxes_Link_Locator");
		String box_width_textbox=prop.getProperty("Box_Width_Textbox");
		String box_width_textbox_input=prop.getProperty("Box_Width_Textbox_Input");
		String box_height_textbox=prop.getProperty("Box_Height_Textbox");
		String box_height_textbox_input=prop.getProperty("Box_Height_Textbox_Input");
		String box_length_textbox=prop.getProperty("Box_Length_Textbox");
		String box_length_textbox_input=prop.getProperty("Box_Length_Textbox_Input");
		String do_it_button=prop.getProperty("Do_It_Button_Locator");
		String volume_result=prop.getProperty("Volume_Result");
		
		
		driver.findElement(By.xpath(plots_and_geometry_link_locator)).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.findElement(By.xpath(boxes_link_locator)).click();
		driver.findElement(By.xpath(box_width_textbox)).sendKeys(box_width_textbox_input);
		driver.findElement(By.xpath(box_height_textbox)).sendKeys(box_height_textbox_input);
		driver.findElement(By.xpath(box_length_textbox)).sendKeys(box_length_textbox_input);
		driver.findElement(By.xpath(do_it_button)).click();
		
		driver.switchTo().frame(1);
		
		WebElement result=driver.findElement(By.xpath(volume_result)); 
		String actual_result=result.getText();
		//int actual_result=Integer.parseInt(result.getText());
		int volume=20*15*10;
		String expected_result="The volume of this box is " +volume+ "." ;
		Assert.assertEquals(actual_result, expected_result,"Actual Result " +actual_result + "Expected Result "+expected_result);
		
		
	}

}
