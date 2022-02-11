package domaci_7_2_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class FormTest {


		private WebDriver driver;
		private FormPage fp; 

		@BeforeMethod
		public void before() {
			System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			fp = new FormPage(driver);
	
		}		
		@Test
		public void FillTheForm() throws InterruptedException {
			driver.get("file:///C:/Users/Jelena/Downloads/form.html");
			
			Thread.sleep(500);
			
			fp.getFullName().sendKeys("Milan Kostadinovic");
			
			fp.getGenderRadioButton("male").click();
			
			fp.getDateOfBirth().sendKeys("10.05.1990");
			
			fp.getEmail().sendKeys("kostadinovicnis@gmail.com");
			
			fp.getRole().selectByValue("QA");	
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("comment")));
			
			Thread.sleep(1000);
			
			fp.getCheckbox("Read tech blogs").click();
			
			fp.getComment().sendKeys("No comment");
			
			fp.getSubmitButton().click();
			
			Assert.assertTrue(fp.savedSuccesfully(), "Forma nije uspesno snimljena");
	
		}
}
//	FormTest
//	Ucitava stranicu
//	Popunite formu proizvoljnim podacima
//	Submitujte formu 
//	Proverite da li su podaci uspesno sacuvani. (imate metodu iz page-a koja vam vraca da li je uspesno sacuvano, 
//	iskrisite je)
//	U AfterClass metodi zatvaramo stranicu
