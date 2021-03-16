package CommonlyAskedQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
    @Test
    public void HoverOver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://mrbool.com/");
        Actions action = new Actions(driver);
        WebElement contents = driver.findElement(By.className("menulink"));
        action.moveToElement(contents).build().perform();
        Thread.sleep(3000);

        WebElement articles = driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']"));
        articles.click();

        driver.quit();


    }
}
