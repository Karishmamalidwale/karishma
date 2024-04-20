package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csslocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		// 1.by using tag and class name
		//WebElement un = driver.findElement(By.cssSelector("input.inputtext"));
		
		//2.by using tag and id
		//WebElement pass = driver.findElement(By.cssSelector("input#pass"));
		//un.sendKeys("karishma");
		//pass.sendKeys("karishma");
		
		//3.by using tag and attributes
		//WebElement un = driver.findElement(By.cssSelector("input[type='text][name='email']"));
		
		//4.by using tag,class and attributs
		//WebElement pass = driver.findElement(By.cssSelector("inpput.inputtext[type='password'][tabindex='2']"));
		//un.sendKeys("karishma");
		//pass.sendKeys("karishma");
		
		//5.by using tag id and attributes
		//WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
		//login.click();
		WebElement un = driver.findElement(By.cssSelector("input[name^='ema']"));
		un.sendKeys("karishma");
		WebElement pass = driver.findElement(By.cssSelector("input[type$='word']"));
		pass.sendKeys("karishma");
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type*='bm']"));
		login.click();
		
		
		
		
		
		
		
		
	}

}
