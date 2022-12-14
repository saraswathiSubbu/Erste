package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Tests extends BaseClass{
    @Test
    public void enterEmailId(){
        driver.get("https://accounts.google.com");
        driver.findElement(By.id("identifierId")).sendKeys("ragavi.r18@gmail.com");
        driver.findElement(By.id("identifierNext")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("enter test2");
    }
    @Test
    public void openGoogleChrome() throws Exception {
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement src = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gLFyf")));
        src.sendKeys("appium");
        src.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}
