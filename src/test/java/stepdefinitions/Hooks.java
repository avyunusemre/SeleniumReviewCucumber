package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    //TestNG'deki BeforeMethod gibi
    //her senaryodan önce çalışır
    @Before
    public void setUp() {
        System.out.println("setUp methodu çalıştı");
    }

    //TestNG'deki AfterMethod gibi
    //her senaryodan sonra çalışır
    @After
    public void tearDown(Scenario scenario) {
        System.out.println("tearDown metodu çalıştı");

        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if(scenario.isFailed()) {
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }


}
