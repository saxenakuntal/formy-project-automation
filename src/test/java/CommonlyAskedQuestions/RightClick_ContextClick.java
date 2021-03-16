package CommonlyAskedQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_ContextClick {
    @Test
    public void rightClick() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        WebElement rightClickButton = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));

        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();

        Thread.sleep(2000);

        driver.quit();
    }
}
