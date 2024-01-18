package mavenPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilteringWebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

		
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("Rice");
		
		List<WebElement> elements=driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> withRice=elements.stream().filter(scan->scan.getText().contains("Rice")).collect(Collectors.toList());
		
		
		Assert.assertEquals(elements.size(),withRice.size());
		
		System.out.println("filter functionality working");
		
		System.out.println("Poonam Added changes");
		
		
		System.out.println("Poonam Added changes2nd day");
		

		System.out.println("2nd comment Poonam Added changes2nd day");
		

		System.out.println("Added from devbranch");
	}

}
