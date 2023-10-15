import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    
public class baseTest{
    public WebDriver driver;
    
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void terminate() {
        driver.quit();
    }
}
