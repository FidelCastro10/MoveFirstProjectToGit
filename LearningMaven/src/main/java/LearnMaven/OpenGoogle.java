package LearnMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Castro\\Learning\\Driver\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("fidel");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.close();
		System.out.println("Fidel");
		System.out.println("NithyaF");
		System.out.println("Karl Marx");
		System.out.println("Is configuration working 2nd check");

	}

}
