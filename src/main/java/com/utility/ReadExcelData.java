package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {


	public static String readParticularCell(int rows,int column) throws InvalidFormatException, IOException  {
		File file = new File("C:\\Users\\Jana\\OneDrive\\Documents\\Book1.xlsx");
		Workbook book = new XSSFWorkbook(file); 

		Sheet sheet =book.getSheetAt(0);

		Row row =sheet.getRow(rows);

		Cell cell =row.getCell(column);

		DataFormatter dataFormat = new DataFormatter();
		String data =dataFormat.formatCellValue(cell);

		System.out.println(data);
		
		return data;
	}




	public static void readParticularRowMultiCells() throws InvalidFormatException, IOException{

		File file = new File("C:\\Users\\Jana\\OneDrive\\Documents\\Book1.xlsx");
		Workbook book = new XSSFWorkbook(file);

		Sheet sheet =book.getSheetAt(0);


		int lastRowNum = sheet.getLastRowNum();

		short lastCellNum = sheet.getRow(0).getLastCellNum();

		System.out.println("Number of cell:" +lastRowNum);
		Row row =sheet.getRow(1);




		for (int i = 0; i <lastCellNum; i++) {
			Cell cell = row.getCell(i);
			DataFormatter dataFormat = new DataFormatter();
			String data = dataFormat.formatCellValue(cell);
			System.out.println(data);
		}




	}

	
	
	public static void readAllData() throws InvalidFormatException, IOException {
		File file = new File("C:\\Users\\Jana\\OneDrive\\Documents\\Book1.xlsx");
		Workbook book = new XSSFWorkbook(file);

		Sheet sheet =book.getSheetAt(0);

		int lastRowNum = sheet.getLastRowNum();

		short lastCellNum = sheet.getRow(0).getLastCellNum();

		for (int i = 1; i <lastRowNum ; i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				Cell cell = row.getCell(j);
				DataFormatter dataFormat = new DataFormatter();
				String data = dataFormat.formatCellValue(cell);
				System.out.println(data);
			} 
		}
	}


	public static void main(String[] args) throws InvalidFormatException, IOException  {
		//readParticularCell(2,2);
		readParticularRowMultiCells();
		//readAllData();

	}

}

