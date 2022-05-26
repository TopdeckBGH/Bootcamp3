package testRunner;

import utils.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

    @CucumberOptions(
            features = {"src/test/java/features"},
            glue = {"stepDefinitions", "utils"},
            tags = "@Components",
            //tags = "@LoginPage",
            plugin = {
                    "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
                    "json:Reports/CucumberReport/Report",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
            }
    )

public class Runner extends AbstractTestNGCucumberTests {

    static WebDriver driver = DriverFactory.getDriver();

    @BeforeSuite
    public void beforeSuite() {
    }

    @BeforeTest()
    public void beforeTest() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @BeforeMethod
    public void beforeMethod() {
    }

    @BeforeGroups
    public void beforeGroup() {
    }

    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
    }

    @AfterTest
    public void afterTest() {
    }

    @AfterSuite
    public void afterSuite() {
    }

    @AfterGroups
    public void afterGroup() {
    }

}
