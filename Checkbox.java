package automationpractical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//to click on the single checkbox we need to find out the element and need to click on it
		
		//WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
		//checkbox1.click();
		
		//if(checkbox1.isSelected())
		//{
		
		//System.out.println("checkbox is selected by default");
		
		//}
		//else
		//{
			
		//	checkbox1.click();
	//}
		//to select the multiple checkbox in single code we will use below method
		
		 List<WebElement>checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		 int size = checkboxes.size();
		 System.out.println(size);
		 
		 //if you have multiple elements and you want to perform operation on specific index you can use get method
		// checkboxes.get(0).click();
		// for(int i=0;i<size;i++)
		// {
		//	 checkboxes.get(i).click();
		// }
		 for(int i=0;i<size;i++)
		 {
			 //getattribute method is used to fetch the value of elements attribute as per given key
			 String value = checkboxes.get(i).getAttribute("value");
			 
			 if(value.equalsIgnoreCase("hockey"))
			 {
				 checkboxes.get(i).click();
			 }
		 }

	}

}
