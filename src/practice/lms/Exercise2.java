package practice.lms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise2 {

	public static void main(String[] args) {
		//Program for mouse movements using webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");	
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("COMPUTERS"))).perform();
		driver.findElement(By.linkText("Accessories")).click();
		driver.close();

	}

}
