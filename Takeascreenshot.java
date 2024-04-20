package automationpractical;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takeascreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://moneyboats.com/");
		driver.manage().window().maximize();	
		
		//firstly we are creating reference of takesscreenshot interface
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//calling getscreenshot as method to create image
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		
		//move the file into new destination folder
		
		File destFile = new File("E:\\images\\1.png");
		
		//we will copy the screenshot into destination folder
		Files.copy(srcFile, destFile);
		
		

	}

}
