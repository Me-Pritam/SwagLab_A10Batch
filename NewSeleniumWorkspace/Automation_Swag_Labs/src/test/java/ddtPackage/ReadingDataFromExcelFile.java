package ddtPackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcelFile 
{
	public static void main(String[] args)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/CuraHealthCareReportSheet.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sheet = wb.getSheet("ReportSheet");
			
			int cellCount = sheet.getRow(0).getLastCellNum();
			
			int rowCount = sheet.getLastRowNum();
			
			for(int r=1;r<=rowCount;r++)
			{
				Row row = sheet.getRow(r);
				
				for(int c=0; c<cellCount; c++)
				{
					System.out.print(row.getCell(c).toString()+" ");
				}
				System.out.println();
			}

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}

}
