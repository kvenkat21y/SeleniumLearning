package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// co.addArguments("start-maximized");

		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();

		// driver.findElement(By.xpath("//*[@id="login-button"]")).click()
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//implicitlyWait(Duration.ofSeconds(20));
		//driver.close();

	}

}
