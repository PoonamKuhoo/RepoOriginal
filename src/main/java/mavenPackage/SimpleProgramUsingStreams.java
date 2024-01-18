package mavenPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleProgramUsingStreams {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
 List<WebElement> elements=driver.findElements(By.xpath("//tr/td/a"));
	
	

	List<String> finalvalues1=elements.stream().filter(scan->scan.getText().contains("Sikozy Realtors")).map(scan->getPrice(scan)).collect(Collectors.toList());
	System.out.println(finalvalues1);

	for(int i=0;i<elements.size();i++)
	{
		if(elements.get(i).getText().equalsIgnoreCase("Sikozy Realtors"))
{
	elements.get(i).click();
}
	}
	}
public static String getPrice(WebElement scan)
{
	String price=scan.findElement(By.xpath("parent::td/following-sibling::td[3]")).getText();
	return price;
}
}
