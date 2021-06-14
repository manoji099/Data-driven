package AnnotationTestNG;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;

public class BEforeSuiteMethod {
	
	@BeforeSuite
	public void before(){
		
		System.out.println("hai i am beforeSuite");
	}
	
	@AfterSuite
	public void after(){
		System.out.println("i am aafterSuite");
	}

}
