package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Click')]")));
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		if(text.contains("Click ME!"))
		{
			System.out.println("The text is verified as Click ME!");
		}
		
		

	}

}
