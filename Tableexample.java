package automationpractical;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sam\\Desktop\\automation practical march\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		//to fetch all the columns from table we will use below code
		List<WebElement>columns = (List<WebElement>) driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
		System.out.println("total no of columns are"+size);
		for(int i=0;i<size;i++)
		{
			String columnName = columns.get(i).getText();
			System.out.println(columnName);
			if(columnName.equalsIgnoreCase("Company"))
			{
				System.out.println("we have column name as per requirement");
			}
			
		}
		
		//to fetch all the rows from the table we will use the below code
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size1 = rows.size();
		System.out.println("total no of rows are"+size1);
		for(int j=0;j<size1;j++)
		{
			String rowName = rows.get(j).getText();
			System.out.println(rowName);
		}
		//to fetch the cell data we will use below code
		WebElement cellData = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[2]"));
		System.out.println(cellData.getText());
		
		
		
		
		
	}

}
