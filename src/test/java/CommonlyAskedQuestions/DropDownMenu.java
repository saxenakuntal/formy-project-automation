package CommonlyAskedQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMenu {
    @Test
    public void dropDown(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formstone.it/components/dropdown/demo/");

        Select dropDown = new Select(driver.findElement(By.id("demo_basic")));
        dropDown.selectByVisibleText("One");

        driver.quit();

    }
}
