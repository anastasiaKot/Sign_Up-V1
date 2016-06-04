package core;

import java.util.NoSuchElementException;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class App {
	static WebDriver driver = new FirefoxDriver(); 
	
	
	static boolean isPresent(String id) 
	{
		driver.get("http://learn2test.net/qa/apps/sign_up/v1/");
		 try {
		driver.findElement(By.id(id));
		} 
		 catch (NoSuchElementException e) 
		 {
		 return false;
	
		 }
		 return true;
	}
	
	
	public static void main(String[] args) 
	
	{
		isPresent("id_f_title");
		
		
		//Boolean isPresent = driver.findElements(By.id(String)).size() > 0;
		

	//1//////////////////////////////////////////////
    		
		//WebElement title = driver.findElement(By.cssSelector("head title"));
		String title = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		String req1 = "Welcome to Sign Up v1";

			if (title.equals(req1))
			{
				System.out.println("Test Case ID -  01: Page html title  Status PASSED");
				System.out.println("EXPECTED: " + req1 +  "\nACTUAL:  " + title);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			 } else {
				System.out.println("Test Case ID - 01: Page html title Status FAILED");
				System.out.println("EXPECTED: " + req1 +  "\nACTUAL:  " + title);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				}
			
	//2//////////////////////////////////////////////
			
			
			String quoteOnThePage = driver.findElement(By.id("id_f_title")).getText();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String req2 = "Sign Up";

				if (quoteOnThePage.equals(req2))
				{
					System.out.println("Test Case ID - 02: Page application title/id_f_title Status PASSED");
					System.out.println("EXPECTED: " + req2 +  "\nACTUAL:  " + quoteOnThePage);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				 } else {
					System.out.println("Test Case ID - 02: Page application title/id_f_title Status FAILED");
					System.out.println("EXPECTED: " + req2 +  "\nACTUAL:  " + quoteOnThePage);
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
				
  //3//////////////////////////////////////////////
				
				
				String dynamicQuote1 = driver.findElement(By.id("id_f_title")).getText();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				String dynamicQuote2 = driver.findElement(By.id("id_f_title")).getText();

					if (dynamicQuote1.equals(dynamicQuote2))
					{
						System.out.println("Test Case ID -  03: Dynamic quote Status PASSED");
						System.out.println("EXPECTED: Quote is dynamic\nACTUAL:  Quote is dynamic");
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					 } else {
						System.out.println("Test Case ID - 03: Dynamic quote title Status FAILED");
						System.out.println("EXPECTED: Quote is dynamic\nACTUAL:  Quote is NOT dynamic");
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
						}
  //4//////////////////////////////////////////////					
		
					try
				    {
						//boolean firstNameExists = driver.findElement(By.id("id_f_label_fn") ).isDisplayed();
							if (driver.findElement(By.id("id_f_label_fn") ).isDisplayed())
						
					{
							System.out.println("Test Case ID -  04: Text \"First Name\" id_f_label_fn Status PASSED");
							System.out.println("EXPECTED: Text  \"First Name\" is  displayed on the page\nACTUAL: Text  \"First Name\" is displayed on the page ");
							System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
							else 
							{
							System.out.println("Test Case ID - 04: id_f_label_fn Status FAILED");
							System.out.println("EXPECTED: Text  \"First Name\" is displayed on the page\nACTUAL:  Text  \"First Name\" is not displayed on the page");
							System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							}
							
				     }
					catch (NoSuchElementException e)
					{
						System.out.println("Test Case BLOCK");
						System.out.println();
						System.out.println(e.getMessage());
						
					}
/////////////////////////////////////////////5///////////
					
					try
				    {
							if (driver.findElement(By.id("id_fname") ).isDisplayed())
						
					{
							System.out.println("Test Case ID -  05: id_fname Status PASSED");
							System.out.println("EXPECTED: Text field \"First Name\" is  displayed on the page\nACTUAL: Text field \"First Name\" is displayed on the page ");
							System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
							else 
							{
							System.out.println("Test Case ID - 05: id_fname Status FAILED");
							System.out.println("EXPECTED: Text field \"First Name\" is displayed on the page\nACTUAL:  Text field \"First Name\" is not displayed on the page");
							System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
							}
							
				     }
					catch (NoSuchElementException e)
					{
						System.out.println("Test Case BLOCK");
  					    System.out.println();
						System.out.println(e.getMessage());
				
					}
					
			
/////////////////////////////////////////////6///////////
					
				try
				{
					if (driver.findElement(By.id("id_f_label_fn") ).isEnabled())
				
				{
					System.out.println("Test Case ID -  06: TextField FirstName is enabled Status PASSED");
					System.out.println("EXPECTED: Text field \"First Name\" is  enabled on the page\nACTUAL: Text field \"First Name\" is enabled on the page ");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				}
					else 
					{
					System.out.println("Test Case ID - 06: TextField FirstName is enabled Status FAILED");
					System.out.println("EXPECTED: Text field \"First Name\" is enabled on the page\nACTUAL:  Text field \"First Name\" is not enabled on the page");
					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
					
				}
				catch (NoSuchElementException e)
				{
				System.out.println("Test Case BLOCK");
				//System.out.println();
				//System.out.println(e.getMessage());
				//
				}
				
				
////////7/////////
				
				String firstName = "Anna";
				String lastName = "Shpak";
				String email = "hahahaha@bla.com";
				String phone = "6697778944";
				String state = "California";
				String genderF = "Female";
				//String genderM = "Male";
				
				String terms = "Agreed";
												
				driver.findElement(By.id("id_fname")).sendKeys(firstName);
				driver.findElement(By.id("id_lname")).sendKeys(lastName);
				driver.findElement(By.id("id_email")).sendKeys(email);
				driver.findElement(By.id("id_phone")).sendKeys(phone);
										
				driver.findElement(By.id("id_checkbox")).click();
				WebElement gender = driver.findElement(By.id("id_g_radio_01"));
				gender.click();
			    new Select(driver.findElement(By.id("id_state"))).selectByVisibleText(state);
				driver.findElement(By.id("id_submit_button")).submit();
				
				
				String firstNameConf = driver.findElement(By.id("id_fname_conf")).getText();
				String lastNameConf = driver.findElement(By.id("id_lname_conf")).getText();
				String genderConf = driver.findElement(By.id("id_gender_conf")).getText();
				
				String emailConf = driver.findElement(By.id("id_email_conf")).getText();
				String phoneConf = driver.findElement(By.id("id_phone_conf")).getText();
				String stateConf = driver.findElement(By.id("id_state_conf")).getText();
				String termsConf = driver.findElement(By.id("id_terms_conf")).getText();
				
				try
				{
				     if
				     (
				    		(firstName.equals(firstNameConf)) &&
				    		(lastName.equals(lastNameConf)) && 
							(email.equals(emailConf)) && 
							(phone.equals(phoneConf)) &&
							(state.equals(stateConf)) &&
							(genderF.equals(genderConf)) &&
							(terms.equals(termsConf))
					)				

				{
				
  				System.out.println("Test Case ID -  07: Confirmation Page values matches Submit Page values"
  						+ " Status PASSED");
			    System.out.println("EXPECTED: "+firstName + " " + lastName+ " " + genderF + " " + email +" " +  phone +" " +  state + " " + terms + "\nACTUAL: " +" " +  firstNameConf + " " + lastNameConf +" " + 
  						genderConf+" " +  emailConf+" " +  phoneConf+ " " + stateConf+" " + 
			    		termsConf);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				driver.findElement(By.id("id_back_button")).click();
				}
				else 
				{
				System.out.println("Test Case ID - 07:Confirmation Page values do not match Submit Page values Status FAILED");
				System.out.println("EXPECTED: "+firstName + " " + lastName+ " " + genderF + " " + email +" " +  phone +" " +  state + " " + terms + "\nACTUAL: " +" " +  firstNameConf + " " + lastNameConf +" " + 
  						genderConf+" " +  emailConf+" " +  phoneConf+ " " + stateConf+" " + 
			    		termsConf);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				driver.findElement(By.id("id_back_button")).click();
				}
			}
				catch (NoSuchElementException e)
			{
				System.out.println("Test Case BLOCK");
				System.out.println();
				System.out.println(e.getMessage());
				
				
/////////////////////////////////////////////8///////////

				
//				try
//		{
//			
//		    String invalidChars = "####";
//		   driver.findElement(By.id("id_fname")).clear();
//	    	driver.findElement(By.id("id_fname")).sendKeys(invalidChars);
//	    	driver.findElement(By.id("id_submit_button")).submit();
//	        WebElement validationMessage = driver.findElement(By.className("Errline"));
//	       String errorMessage = validationMessage.getText();
//			if (errorMessage.equals("Invalid First Name: [a-zA-Z,.'-]{3,30})"))
//
//				{
//				System.out.println("Test Case ID -  08: \"####\" is invalid character Status PASSED");
//				
//			System.out.println("EXPECTED: \"Invalid First Name: [a-zA-Z,.'-]{3,30})\" \nACTUAL:\"Invalid First Name: [a-zA-Z,.'-]{3,30})\" ");
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//			}
//			else 
//			{
//			System.out.println("Test Case ID - 05: id_fname Status FAILED");
//			System.out.println("EXPECTED: Text field \"First Name\" is displayed on the page\nACTUAL:  Text field \"First Name\" is not displayed on the page");
//			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//			}			
//			}
//			catch (NoSuchElementException o)
//			{
//			System.out.println("Test Case BLOCK");
//		System.out.println();
//			System.out.println(e.getMessage());
//
//}


/////////////////////////////////////////////6///////////			
				
			
				
			driver.quit();
		}
	
	}
	}