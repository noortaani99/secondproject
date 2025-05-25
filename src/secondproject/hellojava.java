package secondproject;

import java.util.List;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class hellojava {
	WebDriver driver = new ChromeDriver();
	Random rand=new Random();

	@BeforeTest
	public void mySetup() {
		driver.get("https://codenboxautomationlab.com/practice/");
		driver.manage().window().maximize();

	}

	@Test (priority =1)
	public void autoCompleteTest() throws InterruptedException {
		WebElement autoCompleteInputField = driver
				.findElement(By.id("autocomplete"));
		String[] countries ={"jo","sy","ja","ye"};
		int randomIndex =rand.nextInt(countries.length);
		System.out.println(randomIndex);
		
		autoCompleteInputField.sendKeys(countries[randomIndex]);
		Thread.sleep(1000);
		autoCompleteInputField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}
	@Test(priority=2)
	public void SelectTag() {
		WebElement TheSelector=driver.findElement(By.id("dropdown-class-example"));
		Select mySelect =new Select(TheSelector);
		//mySelect.selectByVisibleText("Appium");
		//mySelect.selectByIndex(1);
		mySelect.selectByValue("option3");
		//System.out.println(TheSelector.findElements(By.tagName("option")).size());
	}
	
	@Test (priority=3)
	public void CheckBoxTest () {
		 WebElement DivOfCheckBox = driver.findElement(By.id("checkbox-example"));
		List<WebElement>AllCheckBoxes = DivOfCheckBox.findElements(By.tagName("input"));
		int randomIndex1 =rand.nextInt(AllCheckBoxes.size());
		int randomIndex2 =rand.nextInt(AllCheckBoxes.size());
		AllCheckBoxes.get(randomIndex1).click();
		AllCheckBoxes.get(randomIndex2).click();
		}
		//for(int i=0;i<AllCheckBoxes.size();i++) {
		//	AllCheckBoxes.get(randomIndex).click();
			
		//}
		
	}
	


