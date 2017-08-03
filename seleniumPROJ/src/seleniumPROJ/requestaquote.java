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


public class requestaquote {

	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.mbusa.com/mercedes/contact_us/request_a_quote");
		
	
	     driver.manage().window().maximize();
		
		Workbook w =Workbook.getWorkbook(new File ("D://auto.xls"));
		
		Sheet S= w.getSheet("Sheet1");
		
		String fname =S.getCell(0,1).getContents();
		String lname =S.getCell(1,2).getContents();
		String email =S.getCell(1,3).getContents();
		String phno =S.getCell(1,4).getContents();
		String Textcom=S.getCell(1,5).getContents();
		
		
		
		
	
		
	
	
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	   // WebElement addr = driver.findElement(By.className("ui-selectmenu-button ui-widget ui-state-default ui-corner-all")).click();	
	
	//   System.out.println(" my ele "+driver.findElement(By.xpath(".//*[@id='ui-id-3-button']")).getText());
	//   WebElement  adr=driver.findElement(By.xpath(".//*[@id='ui-id-3-button']"));
	//	Select abc = new Select(addr);
	//	abc.selectByIndex(5);
	 // driver.findElement(By.xpath(".//*[@id='ui-id-84']")).click();
		
		//WebElement addr2= driver.findElement(By.name("select-model"));
		//Select abcd = new Select(addr2);
	//abcd.selectByIndex(3);
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[1]/div[2]/input")).sendKeys(fname);
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[1]/div[3]/input")).sendKeys(lname);
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[3]/div[2]/input")).sendKeys("asdf@gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[1]/div[4]/div[2]/input")).sendKeys("1234567890");
	
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[2]/fieldset[2]/div/textarea")).sendKeys(Textcom);
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div/div/div/input")).sendKeys(fname);
		
		//driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[2]/div[1]/input")).click();
		
		
		Actions a = new Actions(driver);
		
		WebElement e = driver.findElement(By.xpath(".//*[@id='ui-id-3-button']"));//selected the part
		a.moveToElement(driver.findElement(By.xpath(".//*[@id='ui-id-3-button']"))).build().perform();//move to seletc part
		e.click();//clicked select part
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement f = driver.findElement(By.xpath(".//*[@id='ui-id-8']"));//select the class
		a.moveToElement(driver.findElement(By.xpath(".//*[@id='ui-id-8']"))).build().perform();//move to class
		f.click();//class selected
		
	
		
		
	WebElement g = driver.findElement(By.xpath(".//*[@id='ui-id-4-button']"));//select the model part
		a.moveToElement(driver.findElement(By.xpath(".//*[@id='ui-id-4-button']"))).build().perform();//move to that part
		g.click();//clicked
		
		
		WebElement h = driver.findElement(By.xpath(".//*[@id='ui-id-44']"));
		a.moveToElement(h).build().perform();
		h.click();
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div/div/div/input")).sendKeys("11101");
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div/div/div/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[1]/div[1]/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='contact-us-request-a-quote']/form/div[2]/div[1]/input")).click();
	
		

	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		driver.close();
		

		
	}

}
