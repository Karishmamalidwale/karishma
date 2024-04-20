package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1.Using simple xpath method by using tag and attributes
		//WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		//WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		//WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
		
		//2.using and condition
		//WebElement un = driver.findElement(By.xpath("//input[@id='email' and @class='inputtext']"));
		//WebElement pass = driver.findElement(By.xpath("//input[@id='pass' and @tabindex='2']"));
		//WebElement login = driver.findElement(By.xpath("//input[@value='Log In' and @type='submit']"));
		
		//3.using or condition
		
		//WebElement un = driver.findElement(By.xpath("//input[@id='email' or  @class='inputtext']"));
		//WebElement pass = driver.findElement(By.xpath("//input[@id='pass' or  @tabindex='2']"));
		//WebElement login = driver.findElement(By.xpath("//input[@value='Log In' or  @type='submit']"));
		
		//4.using contains method
		
		
		//WebElement un = driver.findElement(By.xpath("//input[contains(@name,'ma')]"));
		//WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'wo')]"));
		//WebElement login = driver.findElement(By.xpath("//input[contains(@type,'sub')]"));
		
		//5.using starts-with method
		
		//WebElement un = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
		//WebElement pass = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
		//WebElement login = driver.findElement(By.xpath("//input[starts-with(@value,'Log')]"));
		//un.sendKeys("karishma");
		//pass.sendKeys("karishma");
		//login.click();
		
		//6.using text method
		
		//WebElement link =driver.findElement(By.xpath("//*[text()='Agile Project']"));
		//link.click();
		
		
	
	
		
		
		
		

	}

}
