package pages;

import DriverFactory.DriverFactory;
import Utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import class Pages.Browser;

public class LoginPage {
    private WebDriver driver;                 //declaration

    private By userName = By.xpath("//input[@placeholder=\"Username\"]");
    private By passWord = By.xpath("//input[@placeholder=\"Password\"]");
    private By login = By.xpath("//input[@class=\"submit-button btn_action\"]");
    private By errorMsg = By.cssSelector("h3[data-test='error']");


    public LoginPage(WebDriver driver) {         // initialization
        this.driver = driver;
    }


    public ProductsPage enterDataAndlogin(String username ,String password) {

        Utility.sendKey(driver, userName, username);
        Utility.sendKey(driver, passWord, password);
        Utility.clickElement(driver, login);
        return new ProductsPage(driver);
    }



    public String getErrorMessage() {
        return Utility.getText(driver, errorMsg);
    }
}
