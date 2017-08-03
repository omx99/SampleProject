package seleniumPROJ;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PaymentEstimator {
	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		

	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.mbusa.com/mercedes/portfolio/payment_estimators");
	
	
	

     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	Actions a = new Actions(driver);
	//selecting a class
	WebElement b = driver.findElement(By.xpath(".//*[@id='ui-id-5-button']")) ;
	a.moveToElement(b).build().perform();
	b.click();
	
	
	
	WebElement c = driver.findElement(By.xpath(".//*[@id='ui-id-11']")) ;
	a.moveToElement(c).build().perform();
	c.click();
	
	//selecting a model
	WebElement d = driver.findElement(By.xpath(".//*[@id='ui-id-6-button']")) ;
	a.moveToElement(d).build().perform();
	d.click();
	
	WebElement e = driver.findElement(By.xpath(".//*[@id='ui-id-70']")) ;
	a.moveToElement(e).build().perform();
	e.click();
	
	a.moveToElement(driver.findElement(By.xpath(".//*[@id='estimator-forms-container']/div[3]/div[2]/div[2]/a"))).build().perform();
	driver.findElement(By.xpath(".//*[@id='estimator-forms-container']/div[3]/div[2]/div[2]/a")).click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	   System.out.println(	driver.getCurrentUrl())	;
	   
	 //went to another page
	  Workbook w =Workbook.getWorkbook(new File ("D://auto.xls"));
		
		Sheet S= w.getSheet("RAQ");
		
		String fname =S.getCell(0,1).getContents();
		String lname =S.getCell(1,2).getContents();
		String email =S.getCell(1,3).getContents();
		String phno =S.getCell(1,4).getContents();
		String Textcom=S.getCell(1,5).getContents();
	
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[1]/div[2]/input")).sendKeys(fname);
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[1]/div[3]/input")).sendKeys(lname);
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[3]/div[2]/input")).sendKeys("asdf@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[4]/div[2]/input")).sendKeys("1234567890");
	
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[2]/div/textarea")).sendKeys(Textcom);
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div/div/div/input")).sendKeys(fname);
		
		//driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[2]/div[1]/input")).click();
			
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div/div/div/input")).sendKeys("11101");
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div/div/div/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[2]/div[1]/input")).click();
	
		
	
	driver.close();
	
	}

}
