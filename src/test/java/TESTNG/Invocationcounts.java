package TESTNG;

import org.testng.annotations.Test;

public class Invocationcounts {
	
	
	@Test(invocationCount=20)
	void Login()
	{
		System.out.println("Hello");
	}
	

}
