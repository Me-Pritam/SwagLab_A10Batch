package ddtPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateNewRowInExcel 
{
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/CuraHealthCareReportSheet.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sheet = wb.getSheet("ReportSheet");
			
			Row newRow = sheet.createRow(11);
			
			newRow.createCell(0).setCellValue("Dummy+data");
			
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
