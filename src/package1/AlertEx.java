package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) {
System.out.println("welcome to selenium");
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.telangana.gov.in/");
		System.out.println("my title is" + driver.getTitle());
		driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"WebPartWPQ4\"]/div[1]/div/a[9]")).click();

System.out.println(" alert text" +driver.switchTo().alert().getText());

driver.switchTo().alert().accept();
	

//driver.switchTo().alert().dismiss();




	}

}
