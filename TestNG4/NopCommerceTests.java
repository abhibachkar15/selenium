package TestNG4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceTests {
	
	WebDriver driver ;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https:/demo.nopcommerce.com");
        driver.manage().window().maximize();
	}

}
