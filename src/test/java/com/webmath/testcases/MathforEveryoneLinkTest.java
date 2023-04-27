package com.webmath.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webmath.base.WebMathBase;
import com.webmath.pages.MathforEveryoneLinkPage;

public class MathforEveryoneLinkTest {
	
WebMathBase web;
	
	@BeforeMethod
	public void browserConfig()
	{
		web=new WebMathBase();
		web.initialization();
				
	}
	
	@Test
	public void validateMathforEveryoneLink()
	{
		MathforEveryoneLinkPage math=new MathforEveryoneLinkPage();
		math.mathforEveryoneLink();	
	}
	
	@Test
	public void validateHelpTryingMathProblemLink()
	{
		MathforEveryoneLinkPage math=new MathforEveryoneLinkPage();
		math.helpTryingMathProblemLink();	
	}
	
	
	@Test
	public void validateWeightonAnotherPlanetlink()
	{
		MathforEveryoneLinkPage math=new MathforEveryoneLinkPage();
		math.weightonAnotherPlanetLink();
	}
	
	@Test
	public void validatePlanetDropdown() {
		MathforEveryoneLinkPage math=new MathforEveryoneLinkPage();
		math.planetDropdown();
		
	}
	
	
	@Test
	public void validateWeighButton() {
		MathforEveryoneLinkPage math=new MathforEveryoneLinkPage();
		math.weighButton();
		
	}
	

	
}
