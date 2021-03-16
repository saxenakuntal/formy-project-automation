package CommonlyAskedQuestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class SwitchWindows {
    @Test
    public void switchWindows(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");

        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        newWindowButton.click();

        String parentWindow = driver.getWindowHandle();
        System.out.println("Sessionid is" + parentWindow);
        System.out.println(driver.getCurrentUrl());

        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if(!window.equals(parentWindow)){
                driver.switchTo().window(window);
                System.out.println(window);
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }
        }

        driver.switchTo().window(parentWindow);
        System.out.println(parentWindow);
        System.out.println(driver.getCurrentUrl());

        driver.quit();

    }
}
