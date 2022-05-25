package stepDefinitions;

import pages.LoginPage;
import utils.DriverFactory;

public class LoginPageSteps {
    
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
}
