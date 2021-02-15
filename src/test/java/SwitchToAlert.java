import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    @Test
    public void Test5() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement openAlertButton = driver.findElement(By.id("alert-button"));
        openAlertButton.click();

        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        driver.quit();

    }
}
