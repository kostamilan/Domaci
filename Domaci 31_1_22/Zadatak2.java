package domaci_31_1_22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.concurrent.ThreadPerTaskExecutor;

public class Zadatak2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://geodata.solutions/");

		Select dropdownCountry = new Select(driver.findElement(By.name("country")));
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		Select dropdownCity = new Select(driver.findElement(By.name("city")));
		
		dropdownCountry.selectByVisibleText("Serbia");
		dropdownState.selectByVisibleText("Vojvodina");
		dropdownCity.selectByVisibleText("Bac");
		
		Thread.sleep(5000);

		driver.close();

	}

}
//Napisati program koji ucitava stranicu https://geodata.solutions/
//Bira proizvoljan Country, State i City
//Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//Izabrerit Country, State i City tako da imate podatke da selektujete!
