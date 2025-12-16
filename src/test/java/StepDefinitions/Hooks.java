package StepDefinitions;

import DriverFactory.DriverFactory;
import Utility.DataUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

public class Hooks {

    @Before
    public void setup () throws IOException {

        DriverFactory.initDriver(DataUtils.getPropertyValue("environment","browser.name"));

        DriverFactory.getDriver().get(DataUtils.getPropertyValue("environment","Base_URL"));
    }
//    @After
//    public void tearDown(){
//        DriverFactory.quitDriver();
//    }
}
