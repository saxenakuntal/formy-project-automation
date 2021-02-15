import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConfirmationPage;
import pages.FormPage;


public class CompleteWebForm {
    @Test
    public void Test12(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Navigating to a URL
        driver.get("https://formy-project.herokuapp.com/form");

        FormPage formPage = new FormPage();
        FormPage.submitForm(driver);

        ConfirmationPage confirmationPage = new ConfirmationPage();
        ConfirmationPage.waitForAlertBanner(driver);

        String alertActualText = confirmationPage.alertBannerText(driver);
        String alertExpectedText = "The form was successfully submitted!";

        Assert.assertEquals(alertExpectedText,alertActualText);

        driver.quit();

    }

}
