package Amazon_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit
{
	@Test
	public void login_gmail()
{
		driver.get("https://www.gmail.com");
}
}
