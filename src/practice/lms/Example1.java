package practice.lms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		String s= driver.getTitle();
		System.out.println(s);
		WebElement Register_lnk = driver.findElement(By.linkText("Register"));
		Register_lnk.click();
		WebElement radio1 = driver.findElement(By.id("gender-male"));
		radio1.click();
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("sarojini11@gmail.com");
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("Sarojini11");
		WebElement lastname = driver.findElement(By.id("LastName"));
		lastname.sendKeys("Emekar11");
		WebElement pwd = driver.findElement(By.id("Password"));
		pwd.sendKeys("Password@123");
		WebElement confirm_pwd = driver.findElement(By.id("ConfirmPassword"));
		confirm_pwd.sendKeys("Password@123");
		WebElement register_btn = driver.findElement(By.id("register-button"));
		register_btn.click();
		WebElement logout_lnk = driver.findElement(By.linkText("Log out"));
		logout_lnk.click();
		System.out.println("Register successful");
		driver.close();

	}

}
