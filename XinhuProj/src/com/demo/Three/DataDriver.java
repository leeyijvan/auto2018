package com.demo.Three;

import org.testng.annotations.DataProvider;
import com.webtest.dataprovider.FileDataProvider;

public class DataDriver {
	@DataProvider(name = "TD1")
	public static Object[][] getTxt(){
		FileDataProvider td = new FileDataProvider("TestData1");
		return td.getTestDataByTxt();
	}
	
}
