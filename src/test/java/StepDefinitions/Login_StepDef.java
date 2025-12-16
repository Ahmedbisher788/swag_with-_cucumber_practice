package StepDefinitions;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.LoginPage;
import static DriverFactory.DriverFactory.getDriver;

public class Login_StepDef {


    @Given("user in login page")
    public void userInLoginPage() {
        new LoginPage(getDriver());
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/");

    }

    @When("user enter {string} and {string} and enter login")
    public void userEnterUsernameAndPassword(String username , String pass) {
        new LoginPage(getDriver()).enterDataAndlogin(username,pass);
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html","user didn't login successfully ");
    }


    @Then("user can access product page")
    public void userCanAccessProductPage() {
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }


    @When("user enter invalid {string} and {string} and enter login")
    public void userEnterInvalidUsernameAndPassword(String username , String pass) {
        new LoginPage(getDriver()).enterDataAndlogin(username,pass);
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/","user login successfully with invalid credentials ");

    }


    @Then("user can not access product page")
    public void userCannotAccessProductPage() {
        boolean expected  = getDriver().getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
        Assert.assertFalse(expected , "user can access product page with invalid data in login ");
    }


}
