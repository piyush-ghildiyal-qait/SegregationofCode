package myProject;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HrisVerifyWeeklyTime {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/home/qainfotech/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://hris.qainfotech.com/login.php";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='txtUserName']"));
		email_phone.sendKeys("piyushghildiyal");
		driver.findElement(By.id("txtUserName")).click();
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(password));
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		password.sendKeys("Piyushghildiyal@123");
		driver.findElement(By.id("txtPassword")).click();
		password.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//parseInt(document.getElementsByClassName("total-key ng-binding")[0].innerText.split(":")[1]);
		
//JavascriptExecutor jse = (JavascriptExecutor)driver;
//System.out.println("driver is loaded");
//String totalMinutes = (String) jse.executeScript("return document.getElementsByClassName('total-key ng-binding')[0].innerText.split(':')[1];");
//System.out.println(totalMinutes);
		
//String token=(String) jse.executeScript("return document.getElementsByClassName('total-key ng-binding')[0].innerText;");
//String[] tokenNo = token.split(":");	

//System.out.println(tokenNo[0]);
//System.out.println(tokenNo[1]);

/*		
		
List<WebElement> totaltime=driver.findElements(By.xpath("//span[@class='total-key ng-binding']"));



Iterator<WebElement> itr = totaltime.iterator();
while(itr.hasNext()) {
    System.out.println(itr.next());
}
		
*/

		/*

List<WebElement> links =driver.findElements(By.xpath("//span[@class='total-key ng-binding']"));

String []linkText =new String[links.size()];
int i=0;

//Storing List elements text into String array
for(WebElement a: links)
{
   linkText[i]=a.getText();
   System.out.println(linkText[i]);
   i++;
}
		*/
	
		
		
		
		// you have calculated total time 
		
			
		
		
	

	String totalTime=driver.findElement(By.xpath("//td[@id='tdId_47_']//span")).getText();
	
		
	totalTime=totalTime.substring(0,5);
	System.out.println(totalTime);
		
	String[] breaktotaltime = totalTime.split(":");	

	System.out.println(Integer.parseInt(breaktotaltime[0]));
	int totalTimeHH=Integer.parseInt(breaktotaltime[0]);
	System.out.println(Integer.parseInt(breaktotaltime[1]));
	int totalTimeMM=Integer.parseInt(breaktotaltime[1]);
	
	String date25 = driver.findElement(By.xpath("(//div[@id='dv_2019-02-25']//span[@class='ng-binding'])[1]")).getText();	
	
	date25=date25.substring(0,5);
	System.out.println(date25);

	String[] breaktimedate25 = date25.split(":");	

	System.out.println(Integer.parseInt(breaktimedate25[0]));
	int date25hh=Integer.parseInt(breaktimedate25[0]);
	System.out.println(Integer.parseInt(breaktimedate25[1]));
	int date25mm=Integer.parseInt(breaktimedate25[1]);
	
	String date26 = driver.findElement(By.xpath("(//div[@id='dv_2019-02-26']//span[@class='ng-binding'])[1]")).getText();	
	date26=date26.substring(0,5);
	System.out.println(date26);	

	String[] breaktimedate26 = date26.split(":");	

	System.out.println(Integer.parseInt(breaktimedate26[0]));
	int date26hh=Integer.parseInt(breaktimedate26[0]);
	System.out.println(Integer.parseInt(breaktimedate26[1]));
	int date26mm=Integer.parseInt(breaktimedate26[1]);
	
	
	String date27 = driver.findElement(By.xpath("(//div[@id='dv_2019-02-27']//span[@class='ng-binding'])[1]")).getText();	
	System.out.println(date27);	
	date27=date27.substring(0,5);
	
	String[] breaktimedate27 = date27.split(":");	

	System.out.println(Integer.parseInt(breaktimedate27[0]));
	int date27hh=Integer.parseInt(breaktimedate27[0]);
	System.out.println(Integer.parseInt(breaktimedate27[1]));
	int date27mm=Integer.parseInt(breaktimedate27[1]);
	
	
	String date28 = driver.findElement(By.xpath("(//div[@id='dv_2019-02-28']//span[@class='ng-binding'])[1]")).getText();	
	System.out.println(date28);	
	date28=date28.substring(0,5);
	
	String[] breaktimedate28 = date28.split(":");	

	System.out.println(Integer.parseInt(breaktimedate28[0]));
	int date28hh=Integer.parseInt(breaktimedate28[0]);
	System.out.println(Integer.parseInt(breaktimedate28[1]));
	int date28mm=Integer.parseInt(breaktimedate28[1]);
	
	
	String date1 = driver.findElement(By.xpath("(//div[@id='dv_2019-03-01']//span[@class='ng-binding'])[1]")).getText();
	
	date1=date1.substring(0,5);
	
	System.out.println(date1);	
	
	String[] breaktimedate1 = date1.split(":");	

	System.out.println(Integer.parseInt(breaktimedate1[0]));
	int date1hh=Integer.parseInt(breaktimedate1[0]);
	System.out.println(Integer.parseInt(breaktimedate28[1]));
	int date1mm=Integer.parseInt(breaktimedate1[1]);
		
	
	int actualTime = date25hh*60+date25mm+date26hh*60+date26mm+date27hh*60+date27mm+date28hh*60+date28mm+date1hh*60+date1mm;
	int expectedTime=totalTimeHH*60+totalTimeMM;
	System.out.println(actualTime);
	System.out.println(expectedTime);
	Assert.assertEquals(actualTime, expectedTime);
		
	//driver.close();
	}
	
}
