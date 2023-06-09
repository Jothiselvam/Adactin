package com.Miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Datadriven {
	public static void prticular() throws IOException {
	
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Excel\\Test.xlsx");
		FileInputStream input=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(input);
        Sheet sheetAt=(Sheet) book.getSheetAt(0);
        Row row = sheetAt.getRow(5);
        Cell cell = row.getCell(2);
        CellType ctype=cell.getCellType();

		if(ctype.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if(ctype.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int numericvalue=(int) numericCellValue;
		//	System.out.println("Tester Salary :"+numericvalue);
		//	System.out.println("Developer Salary :"+numericvalue);
		//	System.out.println("Teamlead Salary :"+numericvalue);
		System.out.println("Manager Salary :"+numericvalue);
		}
		
		
		
	}
	public static void wholedata() throws IOException {
		
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Excel\\Test.xlsx");
		FileInputStream input=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(input);
        Sheet sheetAt=(Sheet) book.getSheetAt(0);
        int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows(); 
        for(int i=0;i<physicalNumberOfRows;i++) {
        	Row row = sheetAt.getRow(i);
        
        int physicalNumberOfCells = row.getPhysicalNumberOfCells(); 
        for(int j=0;j<physicalNumberOfCells;j++) {
        	Cell cell = row.getCell(j);
        
        
        CellType ctype=cell.getCellType();

		if(ctype.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		else if(ctype.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int numericvalue=(int) numericCellValue;
		
		System.out.println(numericvalue);
		}
        }
        }
	}
	public static void writedata() throws IOException {
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Miniproject\\Excel\\Test.xlsx");
		FileInputStream input=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(input);
        book.createSheet("Result").createRow(0).createCell(0).setCellValue("Student Name");
        book.getSheet("Result").getRow(0).createCell(1).setCellValue("Result");
        book.getSheet("Result").createRow(1).createCell(0).setCellValue("A");
        book.getSheet("Result").getRow(1).createCell(1).setCellValue("Pass");
        book.getSheet("Result").createRow(2).createCell(0).setCellValue("B");
        book.getSheet("Result").getRow(2).createCell(1).setCellValue("Pass");
        book.getSheet("Result").createRow(3).createCell(0).setCellValue("C");
        book.getSheet("Result").getRow(3).createCell(1).setCellValue("Pass");
        
        FileOutputStream output=new FileOutputStream(f);
        book.write(output);
    	System.out.println("Completed");
	}
	public static void main(String[] args) throws IOException {
		writedata();
}
}