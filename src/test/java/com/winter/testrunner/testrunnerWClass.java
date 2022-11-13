//mou
package com.winter.testrunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.winter.utility.baseW_class;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resoursesw/Featuresw"} , 
plugin = {"json:target/cucumber.json"},
glue = "StepDefinitionW") //tags= {"@S"})
		
		
 
public class testrunnerWClass extends AbstractTestNGCucumberTests {

@BeforeTest
public  void startURLW() {
     baseW_class testW	= new baseW_class();
     testW.initBrowserW();
}
	
@AfterTest
public void closeURLW() {
	baseW_class testW	= new baseW_class();
	testW.driverw.quit();
}
	
	
}
