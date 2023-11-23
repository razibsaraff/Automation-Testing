package package001;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import dev.failsafe.internal.util.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Project001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		//Type :1
//		String ExpectedTitle= "Swag Labss";
//		String ActualTitle= driver.getTitle();
//		System.out.println(ActualTitle);
//		if (ActualTitle.equals(ExpectedTitle))
//		{ System.out.println("Title Match");
//		}
//		else {
//			System.out.println("Title Doesnt Match");}
//		//Type:2
		String ExpectedTitle = "Swag Labsss";
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle,ExpectedTitle);
		}
	}




