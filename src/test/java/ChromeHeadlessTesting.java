import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadlessTesting {
    @Test
    public void chromeHeadless(){

        WebDriverManager.chromedriver().setup();

        // Headless browser settings
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size = 1400,800");
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());

        driver.navigate().to("https://formy-project.herokuapp.com/");
        System.out.println(driver.getTitle());

        driver.quit();

    }
}
