package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingSwitchToAndPerformMinimize {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String parentWindow = driver.getWindowHandle();
	driver.get("https://www.selenium.dev/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://demowebshop.tricentis.com/");
	driver.switchTo().window(parentWindow);
	driver.manage().window().minimize();
}
}
