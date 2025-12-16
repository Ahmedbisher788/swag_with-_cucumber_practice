package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProductsPage;
import static DriverFactory.DriverFactory.getDriver;

public class Product_StepDef {

    @When("user add back page item to cart")
     public void addItemToCart(){
        boolean expected = new ProductsPage(getDriver()).addPackPageToCart().getBackPageRemoveButtonLocator().isDisplayed();
        Assert.assertTrue(expected , "user in product page ");
    }

    @Then("quantity should present one")
    public void quantityShouldPresent() {
        Assert.assertEquals(new ProductsPage(getDriver()).getCartCounterNumber(),"1","the quantity not matched ");
    }

    @And("user add T.shirt to car")
    public void userAddTShirtToCar() {


        Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/inventory.html","item did not added successfully");

    }

    @Then("quantity should present two")
    public void quantityShouldPresentTwo() {
        Assert.assertEquals(new ProductsPage(getDriver()).getCartCounterNumber(),"2","the quantity not matched ");
    }

    @And("remove item from cart")
    public void removeItemFromCart() {
        new ProductsPage(getDriver()).clickOnRemoveItemPackPack();
        boolean expected = new ProductsPage(getDriver()).addTShirtToCart().getBackpackLocator().isDisplayed();
        Assert.assertTrue(expected,"item removed successfully");
    }

}
