package com.webmath.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webmath.base.WebMathBase;
import com.webmath.pages.HomeLinkPage;


public class HomeLinkTest {
	
	WebMathBase web;
	
	@BeforeMethod
	public void browserConfig()
	{
		web=new WebMathBase();
		web.initialization();
				
	}
	
	@Test
	public void validateHomeLink() 
	{
		HomeLinkPage hlp=new HomeLinkPage();
		hlp.homeLink();	
	}
	
	
	@Test
	public void validateMathHelpItemDropdown() 
	{
		HomeLinkPage hlp=new HomeLinkPage();
		hlp.chooseMathHelpItemDropdown();
	}
	
	@Test
	public void validateMultiplicationTextbox() 
	{
		HomeLinkPage hlp=new HomeLinkPage();
		hlp.multiplicationTextbox();
	}
	
	@Test
	public void validateMultiplyButton() 
	{
		HomeLinkPage hlp=new HomeLinkPage();
		hlp.multiplyButton();
	}
	
	

}
