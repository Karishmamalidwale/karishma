package automationpractical;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		//WebElement button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		//button.click();
		
		//1.to get the text from alert box we will use gettext method
		
		//String text = driver.switchTo().alert().getText();
		//System.out.println(text);
		
		
		//2.to accept the alert we can use accept method
		//driver.switchTo().alert().accept();
		//WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		//button.click();
		
		//WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Cancel Tab\"]/button"));
		//button1.click();
		
		//3.to dismiss the alert
		//driver.switchTo().alert().dismiss();
		
		WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		button.click();
		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button1.click();
		
		//4.to enter the text values in alert we can use sendkeys method
		driver.switchTo().alert().sendKeys("Karishma");
		driver.switchTo().alert().accept();
		
		
		
		
	}

}
