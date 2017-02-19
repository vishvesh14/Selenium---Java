package automationframwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTestCase {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver","G:\\Software\\GeckoDriver\\geckodriver.exe");
		
//To initialize Chrome Broswer
		/*String exePath = "G:\\Software\\Chrome driver selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();*/
		
//To initialize Firefox Broswer
		WebDriver driver = new FirefoxDriver();
		
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		//driver.get("http://www.store.demoqa.com");
		System.out.println("sucessfully Opened: "+url);
		
		
	
	}

}
