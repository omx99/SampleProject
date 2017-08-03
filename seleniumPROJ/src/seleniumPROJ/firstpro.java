package seleniumPROJ;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class firstpro {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
   WebDriver driver=new FirefoxDriver();
 /*  driver.get("https://www.gmail.com");//get url
   System.out.println(driver.getCurrentUrl());
   System.out.println(driver.getTitle());
   
  driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("omkarmungilwar99");
  
  driver.findElement(By.xpath(".//*[@id='next']")).click();
  
  driver.findElement(By.xpath(".//*[@placeholder='Password']")).sendKeys("8408831442");
  
  driver.findElement(By.xpath(".//*[@id='signIn']")).click();
   
   */
//	WebDriver driver = new FirefoxDriver();
   driver.get("http://www.mbusa.com/mercedes/contact_us/request_a_quote");
	

    driver.manage().window().maximize();
	
	Workbook w =Workbook.getWorkbook(new File ("D://auto.xls"));
	
	Sheet S= w.getSheet("Sheet1");
	
	String fname =S.getCell(1,1).getContents();
	
	driver.findElement(By.xpath(S.getCell(2,0).getContents())).sendKeys(fname);
	
   
 //  driver.close();


	}

}
