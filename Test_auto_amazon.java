package sahil;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_auto_amazon {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes"+Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-declarative']//div//div//div//span//div)[1]")).click();
		Thread.sleep(2000);
		Set <String>s1=	driver.getWindowHandles();
		System.out.println("Session id->" +s1);
		
		Iterator <String> i1=s1.iterator();
		String parent_id= i1.next();
		String child_id=i1.next();
		System.out.println(parent_id);
		System.out.println(child_id);
		
		driver.switchTo().window(child_id);
		driver.findElement(By.xpath("(//div[@id='addToCart_feature_div']//span//span)[1]")).click();

	}

}
