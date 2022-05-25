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

    // Check Login Page
    @Given("Enes is on Login Page")
    public void assertLoginPage() {
        homePage.clickLoginPage();
        homePage.checkLoginPage();
    }

    // Click Mail
    @When("click \"E-Posta\" radio button")
    public void radioButtonMail() {
        loginPage.clickMail();
    }

    // Click Phone
    @When("click \"Telefon\" radio button")
    public void radioButtonPhone() {
        loginPage.clickPhone();
    }

    @Then("should see \"GİRİŞ YAP\" title")
    //public void assertLabelLogin() { loginPage.checkMail();}
    public void assertLabelLogin() {
        homePage.checkLoginPage();
    }

    @Then("should see \"E-Posta\" radio button")
    public void assertRadioButtonMail() {
        loginPage.checkMail();
    }

    @Then("should see \"Telefon\" radio button")
    public void assertRadioButtonPhone() {
        loginPage.checkPhone();
    }

    @Then("should see \"E-Posta Adresiniz\" text on Email")
    public void assertTxtFieldMail() {
        loginPage.checkMailText();
    }

    @Then("should see \"Şifreniz\" text on Password")
    public void assertTxtFieldPW() {
        loginPage.checkPWText();
    }

    @Then("should see Show Password Icon")
    public void assertButtonShowPW() {
        loginPage.checkShowButton();
    }

    @Then("should see \"Beni Hatırla\" remember me")
    public void assertButtonRemember() {
        loginPage.checkRememberButton();
    }

    @Then("should see \"Şifremi Unuttum\" forgot password")
    public void assertButtonForgotPW() {
        loginPage.checkForgotButton();
    }

    @Then("should see \"GİRİŞ YAP\" login button")
    public void assertButtonLogin() {
        loginPage.checkLoginButton();
    }

    @Then("should see Phone Text Box")
    public void assertTxtFieldPhone() {
        loginPage.checkPhoneText();
    }

    // Empty Login
    @When("click login button")
    public void loginButton() {
        loginPage.clickLoginButton();
    }

    @Then("should see {string} Email Empty message")
    public void assertMailMsg(String message) {
        loginPage.checkMailEmptyMsg(message);
    }

    @Then("should see {string} Password Empty message")
    public void assertPWMsg(String message) {
        loginPage.checkPWEmptyMsg(message);
    }

    // Empty Password
    @When("type Email {string}")
    public void correctMail(String mail) {
        loginPage.enterCorrectMail(mail);
    }

    @Then("should not see Email Empty message")
    public void mailNoError() {
        loginPage.checkMailNoError();
    }

    // Empty Email
    @When("type Password {string}")
    public void enterPassword(String password) {
        loginPage.enterCorrectPW(password);
    }

    @Then("should not see Password Empty message")
    public void passwordNoError() {
        loginPage.checkPWNoError();
    }

    // False Email
    @When("type Email {string} and click login")
    public void mailNoPWLogin(String mail) {
        loginPage.enterCorrectMail(mail);
        loginPage.clickLoginButton();
    }

    @Then("should see {string} Email False message")
    public void wrongMailLogin(String mail) {
        loginPage.checkWrongMailError(mail);
    }

    //False Login
    @When("type Email {string}, Password {string} and click login")
    public void falseLogin(String mail, String password) {
        loginPage.enterCorrectMail(mail);
        loginPage.enterCorrectPW(password);
        loginPage.clickLoginButton();
    }

    @Then("should see {string} Login Error message")
    public void assertFalseLoginMessage(String error) {
        loginPage.checkFalseLoginError(error);
    }
}
