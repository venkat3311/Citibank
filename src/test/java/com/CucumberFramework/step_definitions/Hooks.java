package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;


import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Driver.getDriver().manage().window().maximize();
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
