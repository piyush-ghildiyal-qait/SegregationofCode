package segreagategmailcode;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Compose {

	
	public void composeMessage(WebDriver driver) throws InterruptedException, IOException {
		
		MyLocators ml=new MyLocators();
		
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    Thread.sleep(5000);
	    
	    driver.findElement(ml.clickOnCross).click();
	    
	    Thread.sleep(2000);
	
	    driver.findElement(ml.clickOnComposeButtonLocator).click();
	
   
	    
 driver.findElement(ml.enterReceipentEmailLocator).sendKeys(new LoadFromYaml().returnObjectOfYaml().getToEmail().toString());
 driver.findElement(ml.enterSubjectInSubjectBoxLocator).sendKeys(new LoadFromYaml().returnObjectOfYaml().getSubject().toString());
	
	
	Thread.sleep(5000);
	WebElement message=driver.findElement(ml.enterMessageInMessageBox);
	message.click();
	message.sendKeys(new LoadFromYaml().returnObjectOfYaml().getMessage().toString());		
	
	
	driver.findElement(ml.enterSendMessageButtonLocator).click();
	Thread.sleep(3000);
	
	driver.findElement(ml.clickOnExpandButtonLocator).click();
	driver.findElement(ml.clickOnSignOutButton).click();
	Thread.sleep(2000);
	
	
	}
	
	
	
}
