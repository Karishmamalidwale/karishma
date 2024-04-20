package automationpractical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPractical {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this method will help u to set the browser path
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		//create object for browser
		WebDriver driver = new ChromeDriver();
		//This method will help u to open the any url
		driver.get("https://www.amazon.in/");
		//To get the title of current opened url
		String title = driver.getTitle();
		
		System.out.println(title);
		//to get the currently opened url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//to get the source code of the opened url
		String source = driver.getPageSource();
		System.out.println(source);
		//To close current url
		driver.close();
		
		driver.quit();
		

	}

}
