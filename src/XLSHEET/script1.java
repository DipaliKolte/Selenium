package XLSHEET;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class script1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream f=new FileInputStream("../selenium/src/XL/SCRIPT1.xlsx");
	//open excel
	Workbook wb=WorkbookFactory.create(f);
	//identify sheet
	Sheet s=wb.getSheet("Sheet1");
	//identfy row
	Row r=s.getRow(0);
	//identify cell
	Cell c=r.getCell(2);
	//print cell data
	String data=c.getStringCellValue();
	System.out.println(data);
	Cell c1=r.getCell(0);
	//print cell data
	String data_01=c1.getStringCellValue();
	System.out.println(data_01);
	
	
	
	
}
}
