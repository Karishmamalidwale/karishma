package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktextandpartiallinktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement forgot = driver.findElement(By.linkText("Forgot your password?"));
		WebElement forgot1 = driver.findElement(By.partialLinkText("pass"));
		
		forgot1.click();
		
	}

}
