package com.orangehrm.database;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public void userCredentials() throws IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook();
		FileOutputStream fileout=new FileOutputStream("D:\\Framework\\NewProject\\HRM\\src\\main\\resources\\com\\orangehrm\\dataprovider\\LoginCredentials.xlsx");
		//File f1=new File("D:\\Framework\\NewProject\\HRM\\src\\main\\resources\\com\\orangehrm\\dataprovider\\LoginCredentials.xlsx");
		
		
		wb.write(fileout);
		//String username=fileout.
		
		fileout.close();
	
	}
	
	
}
