package ddtPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoringMultipleDataInExcel
{
	public static void main(String[] args) {
		
		try
		{
			
			FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/CuraHealthCareReportSheet.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet newSheet = wb.createSheet("Result_Sheet");
			
			Sheet existingSheet = wb.getSheet("ReportSheet");
			
			int rowCount= existingSheet.getLastRowNum();
			
			int cellCount = existingSheet.getRow(0).getLastCellNum();
			
			for(int r=0;r<=rowCount;r++)
			{
				Row newRow = newSheet.createRow(r);
				
				Row existingRow = existingSheet.getRow(r);
				
				for(int c=0; c<cellCount; c++)
				{
					Cell newCell = newRow.createCell(c);
					
					Cell existingCell = existingRow.getCell(c);
					
					newCell.setCellValue(existingCell.getStringCellValue());
				}
			}
			
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
