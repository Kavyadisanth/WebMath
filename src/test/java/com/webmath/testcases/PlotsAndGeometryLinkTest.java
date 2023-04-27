package com.webmath.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webmath.base.WebMathBase;
import com.webmath.pages.PlotsAndGeometryLinkPage;

public class PlotsAndGeometryLinkTest {
	
WebMathBase web;
	
	@BeforeMethod
	public void browserConfig()
	{
		web=new WebMathBase();
		web.initialization();
				
	}
	
	@Test
	public void validatePlotsAndGeometryLink()
	{
		PlotsAndGeometryLinkPage plot=new PlotsAndGeometryLinkPage();
		plot.plotsAndgeometryLink();	
	}
	

	@Test
	public void validateBoxesLink()
	{
		PlotsAndGeometryLinkPage plot=new PlotsAndGeometryLinkPage();
		plot.boxesLink();	
	}
	

	@Test
	public void validateDoItButton()
	{
		PlotsAndGeometryLinkPage plot=new PlotsAndGeometryLinkPage();
		plot.doItButton();	
	}
	
	
	
	

}
