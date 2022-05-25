package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginPageSteps {
    
    LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    // Check Email Components
    @Given("Enes is on Login Page")
    public void assertLoginPage() {
        homePage.clickLoginPage();
        homePage.checkLoginPage();
    }

    @When("click \"E-Posta\" radio button")
    public void radioButtonMail() { loginPage.clickMail();}

    @Then("should see \"GİRİŞ YAP\" title")
    //public void assertLabelLogin() { loginPage.checkMail();}
    public void assertLabelLogin() { homePage.checkLoginPage();}

    @Then("should see \"E-Posta\" radio button")
    public void assertRadioButtonMail() { loginPage.checkMail();}

    @Then("should see \"Telefon\" radio button")
    public void assertRadioButtonPhone() { loginPage.checkPhone();}

    @Then("should see \"E-Posta Adresiniz\" text on Email")
    public void assertTxtFieldMail() { loginPage.checkMailText();}

    @Then("should see \"Şifreniz\" text on Password")
    public void assertTxtFieldPW() { loginPage.checkPWText();}

    @Then("should see Show Password Icon")
    public void assertButtonShowPW() { loginPage.checkShowButton();}

    @Then("should see \"Beni Hatırla\" remember me")
    public void assertButtonRemember() { loginPage.checkRememberButton();}

    @Then("should see \"Şifremi Unuttum\" forgot password")
    public void assertButtonForgotPW() { loginPage.checkForgotButton();}

    @Then("should see \"GİRİŞ YAP\" login button")
    public void assertButtonLogin() { loginPage.checkLoginButton();}
}
