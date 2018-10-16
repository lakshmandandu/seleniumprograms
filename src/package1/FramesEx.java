package package1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("welcome to selenium");
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/autocomplete/");
		System.out.println("my title is" + driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("lakshman");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Draggable")).click();
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src,new File(".\\src\\jquery.png"));
	
		

	}

}
