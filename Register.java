package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import selenium.Data;

public class Register {	
	
	// target page
	static String url = "http://newtours.demoaut.com/";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Uros\\eclipse-workspace\\selenium\\src\\selenium\\geckoDriver\\geckodriver.exe");
		
		// instantiate driver
		WebDriver driver = new FirefoxDriver();
		
		// go to page
		driver.get(url);
		
		// find "Register"
		driver.findElement(By.xpath(Data.getRegister())).click();
		
		// first name input field
		driver.findElement(By.xpath(Data.getFname())).sendKeys("Uros");
		Thread.sleep(500);
		
		// last name input field
		driver.findElement(By.xpath(Data.getLname())).sendKeys("Vucen");
		Thread.sleep(500);
		
		// phone input field
		driver.findElement(By.xpath(Data.getPhone())).sendKeys("123345");
		Thread.sleep(500);
		
		// email input field
		driver.findElement(By.xpath(Data.getMail())).sendKeys("test@yahoo.com");
		Thread.sleep(500);
		
		// address input field
		driver.findElement(By.xpath(Data.getAddress())).sendKeys("Kraljice 12");
		Thread.sleep(500);
		
		// city input field
		driver.findElement(By.xpath(Data.getCity())).sendKeys("Bg");
		Thread.sleep(500);
		
		// province input field
		driver.findElement(By.xpath(Data.getState())).sendKeys("Bg");
		Thread.sleep(500);
		
		// postal code input field
		driver.findElement(By.xpath(Data.getPostal())).sendKeys("11000");
		Thread.sleep(500);

		// drop down and select option
		Select country = new Select(driver.findElement(By.xpath(Data.getSelect())));
		country.selectByVisibleText("SERBIA");
		Thread.sleep(500);
		
		// user name input field
		driver.findElement(By.xpath(Data.getUsername())).sendKeys(Data.getMyUser());
		Thread.sleep(500);
		
		// user password input field
		driver.findElement(By.xpath(Data.getPassword())).sendKeys(Data.getMyPass());
		Thread.sleep(500);
		
		// confirm password
		driver.findElement(By.xpath(Data.getPassword2())).sendKeys(Data.getMyPass());
		Thread.sleep(500);
		
		// submit
		driver.findElement(By.xpath(Data.getSubmit())).click();	
		Thread.sleep(500);
		
		// sign in
		driver.findElement(By.xpath(Data.getSignin())).click();
		Thread.sleep(500);
		
		// sign in user name
		driver.findElement(By.xpath(Data.getSigninUsern())).sendKeys(Data.getMyUser());
		Thread.sleep(500);
		
		// sign in password
		driver.findElement(By.xpath(Data.getSigninPass())).sendKeys(Data.getMyPass());
		Thread.sleep(500);
		
		// signin submit
		driver.findElement(By.xpath(Data.getSigninSub())).click();
		Thread.sleep(500);
		
		// signoff 
		driver.findElement(By.xpath(Data.getSignoff())).click();
		Thread.sleep(500);

	}
}
