package week3day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/appear.html");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn']")));
		String text = driver.findElement(By.id("btn")).getText();
		if(text.contains("Voila! I'm here Guys"))
		{
		System.out.println("The text is verified as" +" " +text);
		}

	}
}