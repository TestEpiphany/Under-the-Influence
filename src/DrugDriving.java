

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class DrugDriving {

	 WebDriver driver;

	    @Before
	    public void DrunkDrivePage() {
	
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String title = driver.getTitle();
		System.out.println(title);
	
		driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}
	    
	    @After
	    public void TearDown() {
	    	driver.close();
	    }
	    
	    @Ignore //Test
	    public void About() throws InterruptedException{
	    	driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drink");
	    	driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[3]/button/span[1]")).click();
	    	//*[@id="container"]/header/div[3]/button/span[1]
	    	Thread.sleep(5000);
//	    	
//	    	Actions action = new Actions(driver);
//	    	WebElement elem = driver.findElement(By.name("//*[@id=\"about\"]/div/div/div[2]/div/button[1]/span[1]"));
//	    	action.moveToElement(elem);
//	    	action.perform();
	    	
	    	//new Select(driver.findElement(By.xpath("//*[@id=\"about\"]/div/div/div[2]/div/button[1]/span[1]"))).selectByVisibleText("Drink Driving stats");
	    	 driver.findElement(By.name("//*[@id=\"about\"]/div/div/div[2]/div/button[1]/span[1]")).click();
	    	
	    }
	    
	    @Test
	    public void Drunk_Drive() throws InterruptedException {
	    	driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drink");
	    	driver.findElement(By.xpath("//*[@id=\"toggle\"]/div/div")).click();
	    	Thread.sleep(5000);
	    	
	    	driver.findElement(By.xpath("//*[text()='Gwent Police']")).click(); //Gwent Police
	    	//*[@id="worst"]/ul/li[1]/span
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Cleveland Police']")).click(); //Cleveland Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='South Yorkshire Police']")).click(); //South Yorkshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Dyfed-Powys Police']")).click(); //Dyfed-Powys Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Essex Police']")).click(); //Essex Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Greater Manchester Police']")).click(); //Greater Manchester Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Dorset Police']")).click(); //Dorset Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='West Yorkshire Police']")).click(); //West Yorkshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Hampshire Constabulary']")).click(); //Hampshire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Wiltshire Police']")).click(); //Wiltshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Hertfordshire Constabulary']")).click(); //Hertfordshire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='South Wales Police']")).click(); //South Wales Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Devon and Cornwall Constabulary']")).click(); //Devon and Cornwall Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Northamptonshire Police']")).click(); //Northamptonshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Humberside Police']")).click(); //Humberside Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Derbyshire Constabulary']")).click(); //Derbyshire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Leicestershire Constabulary']")).click(); //Leicestershire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Police Service of Northern Ireland']")).click(); //Police Service of Northern Ireland
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    
	    }
	    
	    //@Ignore 
	    @Test	  
	      public void PreviuosNext() throws InterruptedException {
	    	
	    	driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drugs");
    		
	    	driver.findElement(By.xpath("//*[@id=\"worst\"]/ul/li[1]/span")).click(); //Gwent Police
	    	Thread.sleep(2000); 
	    	
	    	for (int i = 0; i < 17; i++){
   			 //click the button
   			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/button[2]/span[1]")).click(); //Previous Button
   			 //wait 2 seconds
   			  Thread.sleep(2000);
	    	
	    }
	    	
	    }
	       
		 @Test
    	 public void NextPrevious() throws InterruptedException {
	 
   	driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drugs");
   		 	    	
   	 driver.findElement(By.xpath("//*[@id=\"worst\"]/ul/li[18]/span")).click();
	    Thread.sleep(2000);
	    
	    
   	for (int i = 0; i < 17; i++){
			 //click the button
			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/button[1]/span[1]")).click();
			 //wait 2 seconds
			  Thread.sleep(2000);
		 }
	    
    }	      
}
