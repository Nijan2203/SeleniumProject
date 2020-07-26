package seleniumtestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver","I:\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.id("idOfButton")).click();
		//driver.findElement(By.name("firstName")).sendKeys("Dobule Check");
		//driver.findElement(By.className("Automation")).click();
		//driver.findElement(By.cssSelector("button#idofButton")).click();
		//driver.findElement(By.cssSelector("input.Performance")).click();
		//driver.findElement(By.cssSelector("input[id=male]")).click();
		//driver.findElement(By.cssSelector("input.Automation[type=checkbox]")).click();
		//driver.findElement(By.cssSelector("button[id^='idOf']")).click();  
		//driver.findElement(By.tagName("select")).click();		
		//driver.findElement(By.linkText("This is a link")).click();
		//driver.findElement(By.partialLinkText("a link")).click();
		driver.findElement(By.xpath("//div/div[11]/div/p/button")).click();
		
	    //driver.close();
	    System.exit(0);
	}

}
 