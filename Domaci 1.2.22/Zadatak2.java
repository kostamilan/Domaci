package domaci_1_2_22;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://videojs.com/city");
		
		driver.findElement(By.xpath("//*[@class='vjs-big-play-button']")).click();

		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='vjs-big-play-button']")));

		System.out.println("Play dugme vise nije vidljivo.");


	}

}
//Napisti program koji:
//Ucitava stranicu https://videojs.com/city
//Pusta video klikom na play dugme
//Cekamo da se video ucita
//Tako sto proveravamo da li vise to play dugme nije vidljivo
