package com.acti.Utils;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	XSSFWorkbook excel;
	public ExcelHelper()
	{
		try
	     {
	  File src = new File("./TestData/TestData.xlsx"); // change excel file name according you are runningtest
	  FileInputStream fis = new FileInputStream(src);
	  excel = new XSSFWorkbook(src);
	}
		catch(Exception e)
		{
			System.out.println("Excel Sheet Failed to Load "+e.getMessage()); 
		}
	}
	//Get the count of active rows
	public int getRowCount(int sheetNum)
	{
		return excel.getSheetAt(sheetNum).getLastRowNum()+1;
	}
	public int getRowCount1 (String sheetName)
	{
	     return excel.getSheet(sheetName).getLastRowNum()+1;
	}
	
	//get the values from the cell
	public String getCellData(int SheetNum, int row, int col)
	{
		return excel.getSheetAt(SheetNum).getRow(row).getCell(col).toString();
	}
	
}
