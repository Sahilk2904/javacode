package Amazon_Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase1 extends LaunchQuit
{
	@Test
	public void launch_amazon() throws InterruptedException
	{
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='s-image-padding']//span//a//div//img)[1]")).click();
	Set <String>s1=	driver.getWindowHandles();
	System.out.println("Session id->" +s1);
	
	Iterator <String> i1=s1.iterator();
	String parent_id= i1.next();
	String child_id=i1.next();
	Thread.sleep(2000);
	driver.switchTo().window(child_id);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@id='addToCart_feature_div']//span//span)[1]")).click();
	//driver.findElement(By.id("submit.add-to-cart")).click();
	}
}
