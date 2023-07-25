package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationPriority {
	
	WebDriver driver;
	
	@Test(priority=1)
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
	}
	
	@Test(priority=2,dependsOnMethods= {"OpenApp"})
	void Login()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr512420");
		driver.findElement(By.name("password")).sendKeys("qumuquv");
		driver.findElement(By.name("btnLogin")).click();
		
		
		String ActText=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		String ExpText="Welcome To Manager's Page of Guru99 Bank";
		
		Assert.assertEquals(ActText, ExpText,"Text not macthing");
		
	}
	@Test(priority=3, dependsOnMethods= {"Login"})
	void Search()
	{
		System.out.println("This is search");
	}
	
	@Test(priority=4, dependsOnMethods= {"OpenApp"})
	void Teardown()
	{
		driver.close();
	}
	
	
	

}
