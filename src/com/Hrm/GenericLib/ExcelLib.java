package com.Hrm.GenericLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib 
{
	String Filepath="./Testdat/TestData.xlsx";
	public String getExcelData(String SheetName,int RowNum,int CellNum)
			throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(Filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row rw=sh.getRow(RowNum);
		Cell cel=rw.getCell(CellNum);
		String Data=cel.getStringCellValue();
		wb.close();
		return Data;	
	}
	public String setExcelData(String SheetName,int RowNum,int CellNum)
			throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(Filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(SheetName);
		Row rw=sh.getRow(RowNum);
		Cell cel=rw.getCell(CellNum);
		cel.setCellValue("Exection completed");
		FileOutputStream fos=new FileOutputStream(Filepath);
		wb.write(fos);
		wb.close();
		return null;
	}
}