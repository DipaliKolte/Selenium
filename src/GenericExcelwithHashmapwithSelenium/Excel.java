package GenericExcelwithHashmapwithSelenium;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Utility {
static Workbook wb;
static Sheet s;
static Row r;
static Cell c;

	public static void openExcel()
	{
		try 
		{
			wb=WorkbookFactory.create(new FileInputStream(excelfilepath));
		}
		catch(Exception e)
		{
			
		}
		}
		public static void identifySheet(String Sheetname)
		{
			s=wb.getSheet(Sheetname);
		}
		public static int totalRowCount()
		{
			return s.getLastRowNum();
		}
		public static void identifyRow(int RowNum) {
			r=s.getRow(RowNum);
		}
		public static int totalCellCount()
		{
			return r.getLastCellNum();
		}
		public static void identifyCell(int cellnum)
		{
			c=r.getCell(cellnum);
					
					}
		public static String identifyData()
		{
			return c.toString();
			
		}
	}
