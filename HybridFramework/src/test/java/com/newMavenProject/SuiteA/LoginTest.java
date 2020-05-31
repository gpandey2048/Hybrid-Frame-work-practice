package com.newMavenProject.SuiteA;

import org.testng.annotations.Test;

import com.newMavenProject.BaseClass.BaseTest;
import com.newMavenProject.DriverPrograms.DriverScript;
import com.newMavenProject.Utilities.DataUtils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.Hashtable;

import org.apache.commons.collections4.iterators.ObjectArrayIterator;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

public class LoginTest extends BaseTest {
 
 


@Test(dataProvider="getData")
  public void loginTest(Hashtable<String, String> data) {
	  System.out.println("I have initialized before test method in base test");
if(data.get("Runmode").equals("N")) {
	throw new SkipException("The test is set not to run");
	
	
}
	  ds=new DriverScript();
	  ds.executeKeywords(xls, testName, data);
  }


@DataProvider
public Object[][] getData(){
	
	//String testName="LoginTest";
	String sheetName="Data";
	
	
	return DataUtils.getTestData(xls, testName, sheetName);
	
	
	
}

  

}
