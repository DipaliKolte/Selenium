package Genericexcelwithselenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel implements Utitlity {
	static Workbook wb;
	public static String getData(String sheetname,int rownum,int cellnum)
	{
		try
		{
			wb=WorkbookFactory.create(new FileInputStream("../selenium/resoureses/excel1.xlsx"));
		}
		catch(Exception e)
		{}
		return wb.getSheet("Sheet1").getRow(2).getCell(3).toString();
	}

	
}
