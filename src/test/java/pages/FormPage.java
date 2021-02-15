package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    public static void submitForm(WebDriver driver) {

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.click();
        firstName.sendKeys("Kuntal");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.click();
        lastName.sendKeys("Saxena");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.click();
        jobTitle.sendKeys("Software QA Analyst");

        WebElement gradSchool = driver.findElement(By.id("radio-button-3"));
        gradSchool.click();

        WebElement female = driver.findElement(By.id("checkbox-2"));
        female.click();

        WebElement yearOfExp = driver.findElement(By.id("select-menu"));
        yearOfExp.click();
        WebElement myExp = driver.findElement(By.cssSelector("option[value='3']"));
        myExp.click();

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("02/15/2021");
        datepicker.sendKeys(Keys.RETURN);

        WebElement submit = driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a"));
        submit.click();
    }
}
