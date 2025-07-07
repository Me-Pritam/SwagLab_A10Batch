package com.utilityPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility 
{
	public String giveProperty(String key)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./src/test/resources/com/CommonData/SwagLabPropertyFile.properties");

			Properties property = new Properties();
			
			property.load(fis);
			
			String value = property.getProperty(key);
						
			return value;
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
}
