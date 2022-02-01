package domaci_28_1_22;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int broj = s.nextInt();
		
		driver.navigate().to("https://s.bootsnipp.com/iframe/WaXlr");
		
		List<WebElement> links = 
				driver.findElements(
						By.xpath("//*[contains(@id, 'rating-star-')][contains(@class, 'btnrating')]"));
		
			driver.findElement(By.id("rating-star-" + broj)).click();
			
			Thread.sleep(2000);
			
			driver.close();
				
	}

}
//Maksimizirati prozor
//Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//Od korisnika ucitati broj na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//I izvrsite akciju klik na odgovarajuci element
//Na kraju programa ugasite pretrazivac.
