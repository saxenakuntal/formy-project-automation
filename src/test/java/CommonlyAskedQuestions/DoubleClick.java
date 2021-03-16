package CommonlyAskedQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
    @Test
    public void doubleClick() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement doubleClickButton = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

        driver.quit();

    }
}

