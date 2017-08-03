package seleniumPROJ;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class drizzle  {
	
	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.mbusa.com/mercedes/contact_us/request_a_quote");
		//WebDriverWait wait = new WebDriverWait(driver,555);
	   	Workbook w =Workbook.getWorkbook(new File ("D://auto.xls"));
		Sheet S= w.getSheet("Sheet1");
		driver.manage().window().maximize();
		
		
		excelimport(driver,S);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		driver.close();
		//selecting a class 
		/**
		 * 
		 */
	
	
 
		/*WebElement b = driver.findElement(By.xpath(".//*[@id='ui-id-5-button']")) ;
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		a.moveToElement(b).build().perform();
		b.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement c = driver.findElement(By.xpath(".//*[@id='ui-id-"+classnameindex+"']")) ;
		
		a.moveToElement(c).build().perform();
		c.click();
		
		//selecting a model
		WebElement d = driver.findElement(By.xpath(".//*[@id='ui-id-6-button']")) ;
		a.moveToElement(d).build().perform();
		d.click();
		
		WebElement e = driver.findElement(By.xpath(".//*[@id='ui-id-"+modelnameindex+"']")) ;
		a.moveToElement(e).build().perform();
		e.click();

	


		a.moveToElement(driver.findElement(By.xpath("//div[@id='estimator-forms-container']/div[3]/div[2]/div[2]/a"))).build().perform();
		driver.findElement(By.xpath("//div[@id='estimator-forms-container']/div[3]/div[2]/div[2]/a")).click();	
		//System.out.println(	"element is 	"  + driver.findElement(By.xpath(".//*[@id='estimator-forms-container']/div[2]/div[2]/a[1]")) );
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		System.out.println(	driver.getCurrentUrl())	;
	   */
	 //went to another page
		
		
	
	}
	/*
	 * 
	 */
	
	
	public static void getUrl()
	{
		
		
	}
	
	
	
	
	/*
	 * 
	 */
	public static void excelimport(WebDriver driver,Sheet S) throws BiffException, IOException
	{
		Actions a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath(".//*[@id='ui-id-3-button']"));//selected the part
		a.moveToElement(e).build().perform();//move to seletc part
		e.click();//clicked select part
		
	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		int classnameindex = Classnamerand(8,20);
		int modelnameindex = Modelnamerand(classnameindex);

	     
		WebElement f = driver.findElement(By.xpath(".//*[@id='ui-id-"+classnameindex+"']"));//select the class
		a.moveToElement(driver.findElement(By.xpath(".//*[@id='ui-id-"+classnameindex+"']"))).build().perform();//move to class
		f.click();//class selected
		
	
		
		
	WebElement g = driver.findElement(By.xpath(".//*[@id='ui-id-4-button']"));//select the model part
		a.moveToElement(driver.findElement(By.xpath(".//*[@id='ui-id-4-button']"))).build().perform();//move to that part
		g.click();//clicked
		
		
		WebElement h = driver.findElement(By.xpath(".//*[@id='ui-id-"+modelnameindex+"']"));
		a.moveToElement(h).build().perform();
		h.click();

		
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
	
		
	
		

	}
	
	
	
	
	
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////

	public  static int Classnamerand(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static int Modelnamerand(int classnameindex)
	{
		Random rand = new Random();
		if(classnameindex==8)
		{	
			int min=62;
			int max=73;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==9) {
			int min=44;
			int max=46;
			return (rand.nextInt((max - min) + 1) + min);
			}
		else if (classnameindex==10) {
			int min=48;
			int max=52;
			return (rand.nextInt((max - min) + 1) + min);
			
		}
		else if (classnameindex==11) {
		int min=66;
		int max=79;
		return (rand.nextInt((max - min) + 1) + min);
	
		}
		else if (classnameindex==12) {
			int min=44;
			int max=46;
			return (rand.nextInt((max - min) + 1) + min);
	
		}
		else if (classnameindex==13) {
			int min=44;
			int max=46;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==14) {
			int min=42;
			int max=43;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==15) {
			int min=56;
			int max=64;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==16) {
			int min=46;
			int max=49;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==17) {
			int min=40;
			int max=40;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==18) {
			int min=58;
			int max=67;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==19) {
			int min=46;
			int max=49;
			return (rand.nextInt((max - min) + 1) + min);
		}
		else if (classnameindex==20) {
			int min=44;
			int max=46;
			return (rand.nextInt((max - min) + 1) + min);
		}
			
		
		return 0;
	}
	
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


