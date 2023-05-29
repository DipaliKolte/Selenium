package GenericExcelwithHashmapwithSelenium;

import java.util.HashMap;

public class Hashmap {
static HashMap<String,String> rv;
public static void addDataIntoMap(String sheetname)
{
	rv=new HashMap<>();
	Excel.openExcel();
	Excel.identifySheet(sheetname);;
	int rowcount=Excel.totalRowCount();
	for(int r=0; r<rowcount;r++)
	{
		Excel.identifyRow(r);
		int cellcount=Excel.totalCellCount();
		for(int c=1;c<cellcount;c++)
		{
			Excel.identifyCell(c-1);
			String key=Excel.identifyData();
			Excel.identifyCell(c);
			String value=Excel.identifyData();
			rv.put(key,value);
			
			
		}
		}
		
}
public static String getDatafromHashMap(String keyname)
{
	return rv.get(keyname);
	
}}