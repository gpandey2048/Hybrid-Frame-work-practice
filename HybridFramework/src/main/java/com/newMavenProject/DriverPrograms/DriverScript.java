package com.newMavenProject.DriverPrograms;

import java.util.Hashtable;

import com.newMavenProject.Utilities.ExcelAPI;

public class DriverScript {
	
	public void executeKeywords(ExcelAPI xls, String testName, Hashtable<String, String>data) {
		System.out.println("I am driver script class");
		int rows = xls.getRowCount("Keyword");
		System.out.println("Rows:"+rows);
		
		for(int rNum=1;rNum<rows;rNum++) {
			String tcId = xls.getCellData("Keyword", "TCID", rNum);
			if(tcId.equals(testName)) {
				
				String kword = xls.getCellData("Keyword", "Keywords", rNum);
		           String objectkey = xls.getCellData("Keyword", "Object", rNum);
					String dataKey = xls.getCellData("Keyword", "Data", rNum);
					System.out.println(tcId+" ---"+kword+"---"+objectkey+"----"+dataKey);

				
			}
			
			

			
			
		}
		
		
		
	}
}


