import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    @Test
    public void Test2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement address = driver.findElement(By.id("autocomplete"));
        address.click();
        address.sendKeys("1555 Park Blvd, Palo Alto, CA");

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement autocompleteResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));



        //Thread.sleep(1000);
        //Implicit wait
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        //WebElement autocompleteResult = driver.findElement(By.className("pac-item"));

        autocompleteResult.click();

        Thread.sleep(3000);

        driver.quit();

    }
}
