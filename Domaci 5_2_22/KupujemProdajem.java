package domaci_4_2_22;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KupujemProdajem {

	
	WebDriver driver;
	
	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	
		
	}
	@Test
	public void ratingCheck() throws InterruptedException {
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.navigate().to("https://www.kupujemprodajem.com/");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class, 'kpBoxCloseButton')]")).click();
		driver.findElement(By.id("searchKeywordsInput")).sendKeys("iphone");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/form/div[3]/div/div/div[2]/div[2]/div[2]/div[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='priceSecondSelection']/div/div[1]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(@value, 'eur')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@value, 'Primeni')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='orderSecondSelection']/div/div[1]/div[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@data-text, 'Jeftinije')]")).click();
	} 
	
			
//	@AfterMethod
//	public void after() {
//		driver.quit();
//	}



}
//Umesto prvog za Udemy imamo kupujem prodajem.
//Ucitajte stranicu (ako treba gasite onaj dijalog sto iskace)
//Ukucajte za pretragu iphone
//postavice za valutu eure
//Sortirajte prema ceni da bude najjefinije prvo
//Onda izvrsite proveru sortiranja kao sto je bilo za udemy

//Zadatak sam barem ja odradio ovako:
//Odradite laksi deo, ugasiti prvu poruku, uneti nesto u search bar, pronaci, poredjati po ceni od najmanje.
//Tezi deo mi je bio pronaci dobar element koji mi vraca cene.
//Kao sto su neki primetili, cene su mesane, malo evri, malo dinari.
//Ako ste dobili dobar lokar, i naravno sve to stavili u niz, dobilisti se niz stringiva koji je 100 din, 1,00 e, 120 din....
//Prvo treba taj niz, metodom koju mozete naci na internetu, metodom split, da podelite. Tada cete dobiti dve promenljive, 
//zvacemo ih x1 i x2. x1 ce biti cene, a x2 valute.
//Kako u x1 imamo i celobojne cene, ali i nesto tipa 1,00 ko eura, prvo moramo petljom da na x1 izvrsimo metodu replace, 
//koju usto imamo na gogle i koja ce svuda gde je zarez , promenitii u tacku . . .
//Nakon toga treba da izvrsim proveru da li je x2.equals(e) i ako jeste da x1 pomnozi sa 118.
//Naravno potrebna nam je i nova klasa, kao sto je planinarski dom, gde cemo postaviti parametre za x1 i x2 kako bi smo 
//uspeli da napravimo takav niz, i naravno da se ubacimo u clasu sa kojom radimo.
//U sustini prica je jako laka, samo treba iskoristiti apsolutno svo znanje koje smo naucili u javi do sada i plus jos 
//malo guglati.