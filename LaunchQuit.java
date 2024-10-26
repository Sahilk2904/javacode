package Amazon_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuit 
{
	WebDriver driver;
@BeforeMethod
@Parameters("browser")
public void launchbrowser(String browsertype)
{
	if(browsertype.equals("chrome"))
	{
		driver = new ChromeDriver();
	}
	
	if(browsertype.equals("firefox"))
	{
		driver = new FirefoxDriver();
	}
	
	if(browsertype.equals("edge"))
	{
		driver = new EdgeDriver();
	}
}

@AfterMethod
public void aftermethod() throws InterruptedException
{
	Thread.sleep(30000);
	driver.quit();
}
}
