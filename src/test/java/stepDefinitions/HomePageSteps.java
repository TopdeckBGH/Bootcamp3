package stepDefinitions;

import pages.HomePage;
import utils.DriverFactory;

public class HomePageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
}
