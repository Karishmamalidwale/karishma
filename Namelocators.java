package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Namelocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		 WebElement username = driver.findElement(By.name("email"));
		 WebElement password = driver.findElement(By.name("pass"));
		 username.sendKeys("karishma");
		 password.sendKeys("karishma123");
	}

}
