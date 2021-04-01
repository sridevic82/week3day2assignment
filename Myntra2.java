package week3day2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Duplication;

public class Myntra2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Women']"))).build().perform();
		//Click jacket and coat
		driver.findElement(By.xpath("//a[text()='Jackets & Coats']")).click();
		//Checking counts matches sum of category count
		String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String totalValue = text.replaceAll("\\D", "");
		int total = Integer.parseInt(totalValue);
		System.out.println("The total count of item is"+ " " + total);
		String jacket = driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		String jacketValue = jacket.replaceAll("\\D" , "");
		int jacketNumber = Integer.parseInt(jacketValue);
		String coat = driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		String coatValue = coat.replaceAll("\\D" , "");
		int coatNumber = Integer.parseInt(coatValue);
		if (total == jacketNumber+coatNumber) {
			System.out.println("Total matches sum of categories");
		}
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()='Coats']")));
		//Click on coats
		driver.findElement(By.xpath("//label[text()='Coats']")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='brand-more']")));
		//click on brand more
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		
		//search MANGO
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("mango");
		driver.findElement(By.xpath("//span[@class='FilterDirectory-count']/following-sibling::div")).click();
		//close pop up
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")).click();
		//to check all brands are MANGO
		List<WebElement> mangocoats = driver.findElements(By.xpath("//div[@id='desktopSearchResults']//h3[(text()='MANGO')]"));
		int coatsCount = mangocoats.size();
		String titlecount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		String replaceAll = titlecount.replaceAll("\\D", "");
		int parseInt = Integer.parseInt(replaceAll);
		if(coatsCount==parseInt)
		{
			System.out.println("All Brands in this page are MANGO");
		}
		//mouse over to sort on better discount
		act.moveToElement(driver.findElement(By.className("sort-sortBy"))).build().perform();
		//click on better discount
		driver.findElement(By.xpath("//label[text()='Better Discount']")).click();
		Thread.sleep(3000);
		//display the first price of item
		String firstDisplayedPrice = driver.findElement(By.xpath("(//span[@class=\"product-discountedPrice\"])[1]")).getText();
		System.out.println("First Displayed Price is"+" "+firstDisplayedPrice);
		//mouse over to wishlist
		act.moveToElement(driver.findElement(By.xpath("(//span[@class=\"product-discountedPrice\"])[1]"))).build().perform();
		//click wish list
		driver.findElement(By.xpath("(//span[text()='wishlist'])[1]")).click();
		driver.quit();
		
		
		
		
		
		
		
		
		


	}

}
