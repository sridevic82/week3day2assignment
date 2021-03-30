package week3day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		@SuppressWarnings("deprecation")
		WebDriverWait wait =new WebDriverWait(driver, 10);
		WebElement findElement = driver.findElement(By.id("btn"));
				wait.until(ExpectedConditions.invisibilityOf(findElement));
				if(findElement.isDisplayed() == false)
				{
				System.out.println("Learnt something new");
				}
				String text = driver.findElement(By.tagName("strong")).getText();
				if (text.contains("disappeared"))
				{
					System.out.println("The text Disappeared is visible");
				}
	}

}
