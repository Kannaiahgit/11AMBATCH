package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Params {
	
WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"browser"})
	void OpenApp(String PB)
	{
		if(PB.equals("Chrome"))
		{
			driver =new ChromeDriver();
		}
		else if(PB.equals("Edge"))
		{
			driver =new EdgeDriver();
		}
		else
		{
			driver =new FirefoxDriver();
		}
		
		
		
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
	
	@Test(priority=3, dependsOnMethods= {"OpenApp"})
	void Teardown()
	{
		driver.close();
	}


}
