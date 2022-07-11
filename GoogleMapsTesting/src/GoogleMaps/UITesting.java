package GoogleMaps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITesting {
WebDriver driver;
public void launchBrowser(){
	System.setProperty("webdriver.chrome.driver", "/Users/binex/Workspace/chromedriver");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/maps");
	WebElement elem = driver.findElement(By.name("q"));
	elem.sendKeys(new String[]{"islamabad"});
	elem.submit();
	WebElement searchIcon = driver.findElement(By.id("searchbox-searchbutton"));
	searchIcon.click();

	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement l =  driver.findElement(By.xpath("//*[@id=\"QA0Szd\"]/div/div/div[1]/div[2]/div/div[1]/div/div/div[2]/div[1]/div[1]/div[1]/h1/span[1]"));
	String result = l.getText();
	      System.out.println("Text is Matched : " + result);


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UITesting obj = new UITesting();
		obj.launchBrowser();

	}

}
