package ddtPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreatingNewSheet
{
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/CuraHealthCareReportSheet.xlsx");		
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet newSheet = wb.createSheet("Dummy_Sheet");
			
			Row newRow = newSheet.createRow(0);
			
			Cell newCell = newRow.createCell(0);
			
			newCell.setCellValue("Demo_Data");
			
			FileOutputStream fos = new FileOutputStream("./src/test/resources/TestDataFolder/CuraHealthCareReportSheet.xlsx");
			
			wb.write(fos);
			
			wb.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}
}
