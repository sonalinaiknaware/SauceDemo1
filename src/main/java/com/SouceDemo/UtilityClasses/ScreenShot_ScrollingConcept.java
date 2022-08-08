package com.SouceDemo.UtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_ScrollingConcept {

	
		public static void screenShot(WebDriver driver) throws  IOException {
			 Date d=new Date();
				DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
				String date=d1.format(d);
				//Thread.sleep(1000);
			    TakesScreenshot ts=(TakesScreenshot)driver;
			    File source=ts.getScreenshotAs(OutputType.FILE);
				File dest=new File("C:\\Users\\Yogesh\\Desktop\\Class notes\\java\\Selenium\\ScreenShot\\"+date+".jpg");
		        FileHandler.copy(source, dest);
		 }
		
		public static void scrolling(WebDriver driver) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy (0,100)");
		}
	public static void exelSheet() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Yogesh\\Desktop\\Class notes\\java\\Selenium\\AutomatonExelSheet.xlsx");
	   XSSFWorkbook w=new XSSFWorkbook(file);
	
	   XSSFSheet sheet=w.getSheet("selenium");
	   XSSFRow row=sheet.getRow(0);
	   XSSFCell cell=row.getCell(0);
	   String s=cell.getStringCellValue();
	   System.out.println(s);
	}

}





