package domaci_3_2_22;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1proba {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		Scanner s = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/");
		
		WebElement body = driver.findElement(By.xpath("/html/body"));
		
		System.out.println("Unesite zeljenu boju pretrazivaca: ");
		String boja = s.next();
		
		js.executeScript("arguments[0].style='background:' + arguments[1]", body, boja);
	}

}
//Napisati program koji:
//Ucitava stranicu https://www.google.com/
//Hvata body element za stranicu i njemu setuje atribut style na vrednost “background: nekaBoja”
//Skripta: arguments[0].style=”background: black”;
//(Za vezbanje) Setuje prosledjenu boju:
//Skripta: arguments[0].style=”background:” + arguments[1];
//Boje za testiranje - red, green, blue, …