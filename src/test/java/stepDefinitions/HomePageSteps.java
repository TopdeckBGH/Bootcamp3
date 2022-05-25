package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.DriverFactory;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("Enes is on Homepage")
    public void assertHomePage() { homePage.checkHomePage();}

    @When("Click \"Giriş Yap\" card in the top right")
    public void goTologinPage() { homePage.clickLoginPage();}

    @Then("Should see Login Page")
    public void assertLoginPage() { homePage.checkLoginPage();}
}
