import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {
    @Test
    public void test8() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radioButton1 = driver.findElement(By.id("radio-button-1"));
        radioButton1.click();

        Thread.sleep(2000);

        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value = 'option2']"));
        radioButton2.click();

        Thread.sleep(2000);

        WebElement radioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/label"));
        radioButton3.click();

        Thread.sleep(3000);
        driver.quit();

    }
}
