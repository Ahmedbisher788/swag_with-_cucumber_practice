package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utility {
    public static void sendKey(WebDriver driver, By locator, String data) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(data);
    }

    public static String getText(WebDriver driver, By locator) {
       new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }

    public static WebDriverWait generalWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebDriverWait generalWaitWithDuration(WebDriver driver, Duration duration) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void scrolling(WebDriver driver, By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", byToWebElement(locator, driver));
    }

    public static WebElement byToWebElement(By locator, WebDriver driver) {  // we used by to avoid still element reference exception
        return driver.findElement(locator);
    }


    public static void clickElement(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();

    }


    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyy-MM-dd-h-ssa").format(new Date());
    }

}
