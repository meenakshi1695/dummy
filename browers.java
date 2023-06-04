package seleniumday2locatorsidname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsidname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\eclipse-workspace\\setpath\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();// maximize the window
		driver.get("https://www.saucedemo.com/");
		WebElement username= driver.findElement(By.id("user-name"));
			WebElement password= driver.findElement(By.name("password"));
			WebElement login= driver.findElement(By.name("login-button"));
		username.sendKeys("standard_user");
			password.sendKeys("secret_sauce");
			login.click();
	}

}
