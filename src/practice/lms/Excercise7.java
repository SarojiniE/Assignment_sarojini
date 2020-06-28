package practice.lms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise7 {

	public static void main(String[] args) {
		//To understand web table
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://html.com/tables/#table_code_sample_simple_table");
		String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(innerText);
		driver.quit();
	}

}
