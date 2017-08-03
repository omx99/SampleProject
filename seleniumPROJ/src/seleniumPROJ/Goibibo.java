package seleniumPROJ;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Goibibo {

	public static void main(String[] args) {
		
		
		WebDriver d = new FirefoxDriver();
		d.get("https://www.goibibo.com/");
		d.manage().window().maximize();
		
		d.findElement(By.xpath(".//*[@id='gi_source_st']")).sendKeys("HYD");
		d.findElement(By.xpath(".//*[@id='gi_destination_st']")).sendKeys("MAA");
		
		d.findElement(By.xpath(".//*[@id='start-date']")).click();
		
		  WebElement dateWidget = d.findElement(By.xpath(".//*[@id='start-date']"));  
		  List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));  
		  List<WebElement> columns=dateWidget.findElements(By.tagName("td"));  
		  
		    
		  for (WebElement cell: columns){  
		   //Select 13th Date   
		   if (cell.getText().equals("30")){  
		   cell.findElement(By.linkText("30")).click();  
		   break;  
		     } 
		  
	/*	d.findElement(By.xpath(".//*[@id='inpage']/div/ul[1]/li[3]/a")).click();
		Scanner sc=new Scanner(System.in);  
		
		String command = sc.next();
		
		
		if (command=="y")
		{
		continuexecution(d);	
		  } else{
		//  d.close();
		  }
		 }

	private static void continuexecution(WebDriver d) {
		
	d.findElement(By.xpath(".//*[@id='Interior']/a")).click();
	d.findElement(By.xpath(".//*[@id='Entertainment & Convenience']/a")).click();
	
	d.findElement(By.xpath(".//*[@id='Performance & Safety']/a")).click();
	
	d.findElement(By.xpath(".//*[@id='Service & Care']/a")).click();
	d.findElement(By.xpath(".//*[@id='Summary']/a")).click();
	
	*/
		
//	Actions a =new Actions(d);	
//	
//	a.moveToElement(d.findElement(By.xpath(".//*[@id='aMnu1']"))).build().perform();
//	d.findElement(By.xpath(".//*[@id='nav']/li[2]/div/ul/li[9]/a")).click();
	
//	WebElement ClassDropdown =d.findElement(By.xpath(".//*[@id='ui-id-3-button']"));
	
//		
//	Select a = new Select(ClassDropdown);
//	
//	List<WebElement> l = a.getOptions();
//	System.out.println(l.size());
//	
		
		
		
		
	d.close();
	} 
		
		
		
		
		
	}

}
