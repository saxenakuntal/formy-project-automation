import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListAllLinks {
    @Test
    public void FetchTextOfAllLinks(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.ebay.in/b/Watches/14324");

        WebElement dropbox = driver.findElement(By.id("gh-cat"));

        Select dropdown = new Select(dropbox);
        dropdown.selectByVisibleText("Baby & Mom");

        WebElement search = driver.findElement(By.id("gh-btn"));
        search.click();

//            WebElement parent = driver.findElement(By.xpath("//ul[@id='s0-0-18-10-0-19-2-0-3-list']"));
//
//        List<WebElement> children = parent.findElements(By.xpath("//child::li//child::a"));
//        System.out.println(children.size());
//
//        for(WebElement child: children){
//            System.out.println(child.getAttribute("href"));
//        }

        List<WebElement> links = driver.findElements(By.xpath("//ul[@id='s0-0-18-10-0-19-2-0-3-list']/li/a"));
        System.out.println(links.size());

        for(WebElement link: links){
            System.out.println(link.getAttribute("href"));
        }

        driver.quit();

        }


    }

