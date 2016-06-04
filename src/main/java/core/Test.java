package core;

//import java.util.NoSuchElementException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
public class Test {
    static WebDriver driver = new FirefoxDriver(); 
    
	static boolean connectToDriver(){
		driver.get("http://learn2test.net/qa/apps/sign_up/v1/");
		//Need to Wrap the above line in try/catch to return false for failure to connect
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return true;
	}
    
    static boolean elementExists(String id)
    {
        try {
        	WebElement foundElement = driver.findElement(By.id(id));
			
			if (foundElement != null){
				return true;
			}
        } catch (NoSuchElementException e) {
         	return false;
        }
         
		return false;
    }
	
	static void logElementPresentence(String id){
	
         if (elementExists(id))
         {
             System.out.println(id + " found!");
         }
         else
         {
             System.out.println(id + " not found!");
         };
	}

    public static void main(String[] args) 
    
    {
		if (connectToDriver() == false){
			System.out.println("Unable to connect to driver. Exiting...");
			return;
		}
		
		logElementPresentence("id_f_tttilltle");
		logElementPresentence("id_f_label_fn");
		
    	driver.quit();
    }
}