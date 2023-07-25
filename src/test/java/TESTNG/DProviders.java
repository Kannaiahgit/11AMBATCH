package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProviders {
	
	WebDriver driver;
	
	@Test(priority=1)
	void OpenApp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
	}
	
	@Test(priority=2,dependsOnMethods= {"OpenApp"}, dataProvider="DP")
	void Login(String ID, String  PWD)
	{
		driver.findElement(By.name("uid")).sendKeys(ID);
		driver.findElement(By.name("password")).sendKeys(PWD);
		driver.findElement(By.name("btnLogin")).click();
		
		
		String ActText=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		String ExpText="Welcome To Manager's Page of Guru99 Bank";
		
		Assert.assertEquals(ActText, ExpText,"Text not macthing");
		
		
		
	}
	
	@Test(priority=4, dependsOnMethods= {"OpenApp"}, enabled=false)
	void Teardown()
	{
		driver.close();
	}

	
	@DataProvider(name="DP")
	String [][] LoginData()
	{
		String data[][]={
		{"Kannaiah@Gmail.com", "xyz"},
		{"Ravi@yahoo.com", "123"},
		{"mngr514943","qUnatUn"}
	}; return data;
}
	
	
	
	
	
	
	
	

}
