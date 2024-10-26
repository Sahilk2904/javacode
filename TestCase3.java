package Amazon_Selenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase3 extends LaunchQuit
{

	@Test
	public void login_to_fb()
	{
		driver.get("http://www.facebook.com");
	}
}
