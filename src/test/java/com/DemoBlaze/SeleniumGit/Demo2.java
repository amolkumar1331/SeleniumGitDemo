package com.DemoBlaze.SeleniumGit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo2 {

	

	@BeforeSuite
	void m1(){
		System.out.println("before suite"); 
		
	}
	


	@Test
	void m3(){
		System.out.println("in m3 method"); 
		
	}
	

	@AfterSuite
	void m2(){
		System.out.println("After suite"); 
		
	}


}
