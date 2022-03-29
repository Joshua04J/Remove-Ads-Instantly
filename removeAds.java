package Scripts;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class removeAds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\sele\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/selenium-tutorial");
		Thread.sleep(3000);
		List<WebElement> adss = driver.findElements(By.tagName("iframe"));


		Scanner sc= new Scanner(System.in); //System.in is a standard input stream
		System.out.print("Enter number '1' if all ads loaded : "); 
		int a= sc.nextInt();
		int i = 0;
		
		if (a==1) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (WebElement ad : adss) {
			js.executeScript("document.getElementsByTagName('iframe')[0].remove()");
			i = i+1;
		}
		}
		// System.out.println("Execution : "+i);

		System.out.println("Code has been executed");
		System.out.println("Total frames found : "+ adss.size());
		System.out.println("Total Frames closed : "+ i );

	}

}
