package segreagategmailcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class DriverLoad {

	
	WebDriver driver;
	
	public WebDriver setDriver(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","/home/qainfotech/chromedriver");
	     driver = new ChromeDriver();  
	     driver.manage().window().maximize();
	     String url = "https://gmail.com";
	     driver.get(url);
	     return driver;
	}
	
}
