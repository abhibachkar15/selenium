package TestNG1;

import org.testng.annotations.Test;

public class FirstTest {
  @Test(priority=1)
  public void openApp() {
	  System.out.println("testing 1");
	  
  }
  
  @Test(priority=2)
  public void login() {
	  System.out.println("testing 2");
  }
   
  @Test(priority=3)
  public void logout() {
	  System.out.println("testing 3");
	  
  }
	  
}
