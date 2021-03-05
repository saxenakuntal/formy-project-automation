import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

    @Test
    public void Frames() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/iframe");


        driver.switchTo().frame("mce_0_ifr");

        WebElement textBox= driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("Type something here...");

        Thread.sleep(3000);

        driver.quit();
    }
}
