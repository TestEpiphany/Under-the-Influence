
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DrinkDriving {
   
	    WebDriver driver;

	    @Before
	    public void WebURL() {
	
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

	    @Test
	    public void HomePageLandingPage() {
	    	
	    	Actions action = new Actions(driver);
	    	WebElement drug = driver.findElement(By.xpath("/html/body/div[1]/section[2]/div[2]/div[2]/h2"));
	    	action.moveToElement(drug).build().perform();
	    	
	    	Actions action2 = new Actions(driver);
	    	WebElement drink = driver.findElement(By.xpath("//*[@id=\"landing\"]/div[1]/div[2]"));
	    	action2.moveToElement(drink).build().perform();
	    	
	    	driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/button/span[1]")).click();
	    	//String pageSource = driver.getPageSource();
	        String textPresent = 	driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/h3")).getText();
	        System.out.println(textPresent);
	        driver.findElement(By.xpath("//*[@id=\"container\"]/header/div[3]/button/span[2]")).click();
	     
	       //driver.findElement(By.xpath("//*[@id=\"landing\"]/div[1]/div[2]/div/button/span[1]")).click();
	      
	    	//System.out.println(pageSource);
	    }
	
	   // @Test
	    @Ignore
	    public void Drink_Drive() throws InterruptedException{
	    	driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drink");
	    	driver.findElement(By.xpath("//*[@id=\"worst\"]/ul/li[1]/span")).click(); //Police Service of Northern Ireland
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Police Service of Northern Ireland']")).click(); //Police Service of Northern Ireland
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Dyfed-Powys Police']")).click(); //Dyfed-Powys Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Devon and Cornwall Constabulary']")).click(); //Devon and Cornwall Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='West Yorkshire Police']")).click(); //West Yorkshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Dorset Police']")).click(); //Dorset Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Gwent Police']")).click(); //Gwent Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	driver.findElement(By.xpath("//*[text()='Cleveland Police']")).click(); //Cleveland Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='South Yorkshire Police']")).click(); //South Yorkshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='South Wales Police']")).click(); //South Wales Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Hampshire Constabulary']")).click(); //Hampshire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Wiltshire Police']")).click(); //Wiltshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Greater Manchester Police']")).click(); //Greater Manchester Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Leicestershire Constabulary']")).click(); //Leicestershire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Humberside Police']")).click(); //Humberside Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Essex Police']")).click(); //Essex Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Hertfordshire Constabulary']")).click(); //Hertfordshire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Northamptonshire Police']")).click(); //Northamptonshire Police
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    	
	    	driver.findElement(By.xpath("//*[text()='Derbyshire Constabulary']")).click(); //Derbyshire Constabulary
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
	    	
	    }
	    	 @Test
	 	      public void PreviuosNext() throws InterruptedException {
	    		
	    		 driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drink");
	    		
	    		 driver.findElement(By.xpath("//*[@id=\"worst\"]/ul/li[18]/span")).click();
	 	    	Thread.sleep(2000);
	    			    		 
//	    		 for (int i = 0; i < 17; i++){
//	    			 //click the button
//	    			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/button[1]/span[1]")).click();
//	    			 //wait 2 seconds
//	    			  Thread.sleep(2000);
//	    		 }  
//	    		 
//	    	 }
	    	 
	    	int counter = 0;
	 		while(counter<17) {	 			
	 		driver.findElement(By.xpath("//*[@id=\"navigation\"]/button[1]/span[1]")).click();
	 		counter++;
	 		Thread.sleep(1000);
	 		}
	    	 }
	       
	    		 @Test
	         	 public void NextPrevious() throws InterruptedException {
	    	 
	        	driver.navigate().to("http://leasing-options-under-the-influence.development.stratus.epiphanydev.co.uk/?name&substance=drink");
	        		 	    	
	        	driver.findElement(By.xpath("//*[@id=\"worst\"]/ul/li[1]/span")).click();
		 	    Thread.sleep(2000);
		 	    
		 	    
	        	for (int i = 0; i < 17; i++){
	    			 //click the button
	    			 driver.findElement(By.xpath("//*[@id=\"navigation\"]/button[2]/span[1]")).click();
	    			 //wait 2 seconds
	    			  Thread.sleep(2000);
	    		 }

	}
	    
}




