package week3day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Duplication;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		//Uncheck the textbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[text()='Date'])[1]")));
		//Sort on date
		driver.findElement(By.xpath("(//a[text()='Date'])[1]")).click();
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("Tpj",Keys.DOWN);
	driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.ENTER);
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationTo")).sendKeys("Chennai E",Keys.DOWN);
	driver.findElement(By.id("txtStationTo")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> trainName = driver.findElements(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader\"]//tr/td[2]"));
	List<String> name=new ArrayList<String>();
for (int i = 0; i < trainName.size(); i++) {
	
	String text = trainName.get(i).getText();

	name.add(text);
}

	Collections.sort(name);
	System.out.println(name);
	
	
}
	

	
}
	

	
	
	


