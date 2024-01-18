package mavenPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class mavenClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		List<WebElement> element=driver.findElements(By.xpath("//tbody/tr/td[1]"));
	
		System.out.println(element.size());
		for(int i=0;i<element.size();i++)
		{
			//System.out.println(element.get(i).getText());
		}
		
		
			List<String> originalList=element.stream().map(scan->scan.getText()).collect(Collectors.toList());
List<String> newSortedList=originalList.stream().sorted().collect(Collectors.toList());
try {
if(originalList.equals(newSortedList))
	
System.out.println("matched");
		 else System.out.println("Not matched");	
}
finally {
	System.out.println();
}
	//Assert.assertEquals(originalList,newSortedList);
	//System.out.println("matched");


element.stream().filte

}}
