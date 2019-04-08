package com.orangehrm.module.utils;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test extends XLUtils {

	XLUtils xl=new XLUtils();
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apps.qaplanet.in/qahrm/login.php");
		WebDriverWait objwait=new WebDriverWait(driver, 60);
		WebElement uid=objwait.until(ExpectedConditions.presenceOfElementLocated((By.name("txtUserName"))));
		WebElement pwd=objwait.until(ExpectedConditions.presenceOfElementLocated((By.name("txtPassword"))));
		WebElement lin=objwait.until(ExpectedConditions.presenceOfElementLocated((By.name("Submit"))));
		
		String suid="qaplanet1";
		String spwd="lab1";
		
		uid.sendKeys(suid);
		pwd.sendKeys(spwd);
		
		lin.click();
		
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		int rc=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();//row count
		
		int i;
		for(i=1;i<=rc;i++)
		{
			//Get second column data
			String strEmpCode=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
			//Get third column data
			String strEmpName=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
		
			System.out.println(i+" "+strEmpCode+" "+strEmpName);
		setCellData("C:\\Users\\dell\\Desktop\\Expenses.xlsx", "Sheet2", i, 0, strEmpCode);	
		setCellData("C:\\Users\\dell\\Desktop\\Expenses.xlsx", "Sheet2", i, 1, strEmpName);
			
		}
	}

}
