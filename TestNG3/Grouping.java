package TestNG3;

import org.testng.annotations.Test;

public class Grouping {

	@Test(priority=1,groups= {"sanity","regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginByFacebook()
	{
		System.out.println("this is login by facebook");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginByTwitter()
	{
		System.out.println("this is login by twitter");
	}
	
	@Test(priority=4,groups= {"sanity","regression"})
	void signupByEmail()
	{
		System.out.println("this is signup email");
	}
	
	@Test(priority=5,groups= {"regression"})
	void SignupByFacebook()
	{
		System.out.println("this is SignupBy facebook");
	}
	
	@Test(priority=6,groups= {"regression"})
	void SignupByTwitter()
	{
		System.out.println("this is signup twitter");
	}
	
	@Test(priority=7,groups= {"sanity"})
	void paymentindollar()
	{
		System.out.println("this is payment in dollar");
	}
	
	@Test(priority=8,groups= {"sanity","regression"})
	void paymentinrupees()
	{
		System.out.println("this is payment in rupees");
	}
	
	@Test(priority=9,groups= {"regression"})
	void paymentReturnbybank()
	{
		System.out.println("payment return by bank");
	}
}
