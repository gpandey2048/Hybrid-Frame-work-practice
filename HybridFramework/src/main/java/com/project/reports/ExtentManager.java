package com.project.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance(String reportPath) {
		
		if(extent==null) {
			
			System.out.println(reportPath+"//extent.html");
			createInstance(reportPath+"//extent.html");
		}
		
		
		return extent;
		
		
	}

	public static ExtentReports createInstance(String fileName) {
		
		ExtentHtmlReporter htmlreporter= new ExtentHtmlReporter(fileName);
		htmlreporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
		htmlreporter.config().setChartVisibilityOnOpen(true);
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setDocumentTitle("HTML reports");
		htmlreporter.config().setReportName("Report- Automation testing.");
		
		 extent=new ExtentReports() ;
		 extent.attachReporter(htmlreporter);
		return extent;
		 
		
		
		
		
	}
		
	
	}
	
	


