package com.CucumberFramework.step_definitions;

import com.CucumberFramework.utilities.ConfigurationReader;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.CucumberFramework.utilities.Driver;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class Hooks {

    protected WebDriver driver;

    @Before
    public void setUp(){

        driver = Driver.getDriver();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void tearDown(Scenario scenario){

        // I want to take screenshot when current scenario fails.
        // scenario.isFailed()  --> tells if the scenario failed or not
        if (scenario.isFailed()) {
            // this line is for taking screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            // this line is adding the screenshot to the report
            scenario.embed(screenshot, "image/png");
        }

        System.out.println("Closing driver");
        Driver.closeDriver();
    }
}
