package pages;

import DriverFactory.DriverFactory;
import Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage {
    private WebDriver driver;

    // Locators
    private By backpackLocator = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private By boletTshirtLocator = By.cssSelector("[name=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
    private final By cartCounterNumber = By.cssSelector("[data-test=\"shopping-cart-badge\"]");
    private final By removePackPagButton = By.id("remove-sauce-labs-backpack");
    private final By removeBoltShirtButton = By.id("remove-sauce-labs-bolt-t-shirt");


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCartCounterNumber() {
        return Utility.getText(driver, cartCounterNumber);
    }

    public ProductsPage addPackPageToCart() {
        Utility.clickElement(driver, backpackLocator);
        return this;
    }


    public ProductsPage addTShirtToCart() {
        Utility.scrolling(driver,boletTshirtLocator);
        Utility.clickElement(driver, boletTshirtLocator);
        return this;
    }

    public WebElement getBackPageRemoveButtonLocator() {

        return Utility.byToWebElement(removePackPagButton, driver);
    }

    public WebElement getBoltShirtRemoveButtonLocator() {

        return Utility.byToWebElement(removeBoltShirtButton, driver);
    }



    public ProductsPage clickOnRemoveItemPackPack() {
        Utility.clickElement(driver, removePackPagButton);
        return this;

    }

    public WebElement getBackpackLocator() {
        return Utility.byToWebElement(backpackLocator, driver);
    }
}
