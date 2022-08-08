package com.SouceDemo.TestClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.Test;

import com.SouceDemo.UtilityClasses.ScreenShot_ScrollingConcept;

public class TestClassForExelSheet {
@Test
	public void exelSheet() throws IOException {
		
			ScreenShot_ScrollingConcept.exelSheet();
		
	}

}
