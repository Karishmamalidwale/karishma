package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardeventexmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		 //1.keydown - it will press the key and does not release
		Actions action = new Actions(driver);
		action.keyDown(un, Keys.SHIFT).sendKeys("karishma").perform();
		action.keyDown(pass, Keys.SHIFT).sendKeys("karishma").perform();
		action.keyDown(Keys.ENTER).perform();
	}

}
