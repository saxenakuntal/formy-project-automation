import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToView {
    @Test
    public void Test3() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullName = driver.findElement(By.id("name"));
        Actions action = new Actions(driver);
        action.moveToElement(fullName);
        fullName.sendKeys("Kuntal Saxena");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2021");

        Thread.sleep(3000);

        driver.quit();
    }
}
