package com.webmath.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webmath.base.WebMathBase;
import com.webmath.pages.AlgebraLinkPage;

public class AlgebraLinkTest {
	
WebMathBase web;
	
	@BeforeMethod
	public void browserConfig()
	{
		web=new WebMathBase();
		web.initialization();
				
	}
	
	@Test
	public void validateAlgebraLink()
	{
		AlgebraLinkPage alg=new AlgebraLinkPage();
		alg.algebraLink();	
	}
	
	@Test
	public void validateSquareRootsLink()
	{
		AlgebraLinkPage alg=new AlgebraLinkPage();
		alg.squarerootsLink();	
	}
	
	@Test
	public void validateSimplifyButton()
	{
		AlgebraLinkPage alg=new AlgebraLinkPage();
		alg.simplifyButton();
	}

}
