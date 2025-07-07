package dataProviderPackage;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class QAValoidationFormDataProvider 
{
	@DataProvider(name = "DataFromExcel")
	public Object[][] getData()
	{
		Object[][] arr = null;
		
		try {
			
			FileInputStream fis = new FileInputStream("./src/test/resources/com/Testdata/Form_dataSheet.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			
			Sheet sheet = wb.getSheet("DataSets");
			
			int cellCount = sheet.getRow(0).getLastCellNum();			
			
			int rowCount = sheet.getLastRowNum();
			
			 arr = new Object[rowCount][cellCount];
			 
			 
			 for(int i =1;i<=rowCount;i++)
			 {
				 for(int j = 0; j<cellCount;j++)
				 {
					String data = sheet.getRow(i).getCell(j).toString();
					
					arr[i-1][j]= data;
				 }
			 }
			 
		} 
		catch (Exception e) {
			e.printStackTrace();
		}		
		return arr;
	}
}
