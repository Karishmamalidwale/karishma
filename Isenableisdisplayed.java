package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenableisdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement username = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		//boolean result = username.isDisplayed();
		//boolean result1 = username.isEnabled();
		//System.out.println(result);
		//System.out.println(result1);
		  
		//is displayed method is used to validate element is present or not
		//is enabled method is used to find element is enable or disable
		
		if(username.isDisplayed() && username.isEnabled())
		{
		username.sendKeys("karishma");
		}
		else
		{
			System.out.println("username is not displayed");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
		password.sendKeys("karishma");
		}
		else
		{
			System.out.println("password is not displayed");
		}
		
		//is selected method is used to validate checkbox or radio button is already selected or not
		
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		boolean result = checkbox.isSelected();
		System.out.println(result);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}		}
	


