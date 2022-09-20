import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver"); // Provide the path to your chrome driver. Make sure your chrome driver version is updated.
ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized"); // open Browser in maximized mode
options.addArguments("disable-infobars"); // disabling infobars
options.addArguments("--disable-extensions"); // disabling extensions
options.addArguments("--disable-gpu"); // applicable to windows os only
options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
options.addArguments("--no-sandbox");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://testphp.vulnweb.com");
driver.findElement(By.xpath("//input[@name='searchFor']")).sendKeys("tester"); // Will send values to First Name tab
driver.findElement(By.xpath("//input[@name='goButton']")).click(); // Will click the go button
}
}
