package ddtPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInCellInExcel 
{
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/CuraHealthCareReportSheet.xlsx");

			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sheet = wb.getSheet("ReportSheet");
			
			Row row = sheet.getRow(2);
			
			Cell newCell = row.createCell(2);
			
			newCell.setCellValue("Demo_data");
			
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
