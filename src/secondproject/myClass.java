package secondproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myClass {
	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {
		driver.get("https://www.google.com");

	}

	@Test
	public void myTest() {

		System.out.println(driver.getTitle());
	}

}
