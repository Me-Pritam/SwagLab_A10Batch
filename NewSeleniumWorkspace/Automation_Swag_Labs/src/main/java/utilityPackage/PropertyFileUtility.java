package utilityPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyFileUtility 
{
	


	public String giveData(String key) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataFolder/SwagLabProperty.properties");
			Properties property = new Properties();
			property.load(fis);
			return property.getProperty(key);
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
		
	}

	public void sendData(String key,String value) 
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataFolder/SwagLabProperty.properties");
			Properties property = new Properties();
			property.load(fis);
			FileOutputStream fos = new FileOutputStream("./src/test/resources/CommonDataFolder/SwagLabProperty.properties");
			property.setProperty(key, value);
			property.store(fos, "the new key~ "+key+" and new value~ "+value+" is updated");
			fos.close();

			fos.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		

	}
}
