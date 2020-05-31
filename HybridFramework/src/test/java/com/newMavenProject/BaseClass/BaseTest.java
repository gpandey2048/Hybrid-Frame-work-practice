package com.newMavenProject.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeTest;

import com.newMavenProject.DriverPrograms.DriverScript;
import com.newMavenProject.Utilities.ExcelAPI;

public class BaseTest {
	public static String projectPath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties baseProperties;
	public static Properties childProperties;
	public static ExcelAPI xls;
	public String testName=null;
	//public DriverScript ds;
	public DriverScript ds;
	
@BeforeTest
public void init() throws Exception {
	System.out.println("i am initializing the test case");
 fis= new FileInputStream(projectPath+"//src//test//resources//environment.properties");
	Properties baseProperties= new Properties();
	baseProperties.load(fis);
	String envType = baseProperties.getProperty("env");
	System.out.println(envType);
	
	fis=new FileInputStream(projectPath+"//src//test//resources//"+envType+".properties");
	childProperties= new Properties();
	childProperties.load(fis);
	
	String url = childProperties.getProperty("zohourl");
	System.out.println(url);
	
	//init the testName
	testName = this.getClass().getSimpleName();
	System.out.println(testName);
	
	
	//How to know which suite excel data to load
	
	String[] pack = this.getClass().getPackage().getName().split("\\.");
	String suiteName = pack[pack.length-1];
	System.out.println(suiteName);
	
	//init the xls file
	xls=new ExcelAPI(childProperties.getProperty(suiteName+"_xls"));
	
	
	
}



}
