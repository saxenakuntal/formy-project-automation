import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyValueFromOneTextBoxToAnother {
    public static WebDriver driver;

    @BeforeClass
        public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
        public static void tearDown(){
        driver.quit();
    }

    @Test
    public void CopyText() throws InterruptedException {

        driver.get("https://formy-project.herokuapp.com/form");
        WebElement fName = driver.findElement(By.id("first-name"));
        fName.sendKeys("Kuntal");

        String  copyValue = fName.getAttribute("value");
        System.out.println(copyValue);

        WebElement lName = driver.findElement(By.id("last-name"));
        lName.sendKeys(copyValue);

        Thread.sleep(3000);

    }
}
