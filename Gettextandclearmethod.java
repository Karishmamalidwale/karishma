package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextandclearmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("karishma");
		//To clear the populated text in textbox we need to use clear method
		username.clear();
		WebElement text = driver.findElement(By.tagName("h1"));
		
		//to fetch the value of particular elements we can use gettext method
		String value = text.getText();
		System.out.println(value);
	}

}
