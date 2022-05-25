package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import utils.ElementHelper;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    // Elements
    By lblLoginPage = By.cssSelector("h5.login-form__title");
    By radioBtnMail = By.cssSelector("[value=Email]");
    By radioBtnPhone = By.cssSelector("[value=Phone]");
    By btnShowPW = By.cssSelector("[src=\"/Resource/Images/customer/show-password-open.png\"]");
    By btnRememberPW = By.cssSelector("[name=\"rememberMe\"]");
    By btnForgotPW = By.cssSelector("[data-tracking-label=\"ŞifremiUnuttum\"]");
    By btnLogin = By.cssSelector("[type=\"submit\"]");
    By txtFieldPhone = By.cssSelector("[name=\"phone\"]");
    By txtError = By.cssSelector(".error");
    By txtLoginError = By.cssSelector(".login-form__header-errors--p");

    // Text
    String login = "GİRİŞ YAP";
    String wrongMailError = "Lütfen geçerli bir e-posta adresi giriniz.";
    String wrongPWError = "Lütfen e-posta adresinizi giriniz.";


    // Check Email Components
    public void clickMail() { elementHelper.click(radioBtnMail);}
    public void checkLoginPage() { elementHelper.checkElementWithText(lblLoginPage, login);}
    public void checkMail() { elementHelper.checkElementPresence(radioBtnMail);}
    public void checkPhone() { elementHelper.checkElementPresence(radioBtnPhone);}
    public void checkMailText() { elementHelper.checkElementPresence(homePage.txtFieldMail );}
    public void checkPWText() { elementHelper.checkElementPresence(homePage.txtFieldPW);}
    public void checkShowButton() { elementHelper.checkElementPresence(btnShowPW);}
    public void checkRememberButton() { elementHelper.checkElementPresence(btnRememberPW);}
    public void checkForgotButton() { elementHelper.checkElementPresence(btnForgotPW);}
    public void checkLoginButton() { elementHelper.checkElementPresence(btnLogin);}

    // Check Phone Components
    public void clickPhone() { elementHelper.click(radioBtnPhone);}
    public void checkPhoneText() { elementHelper.click(txtFieldPhone);}

    // Empty Login
    public void clickLoginButton() { elementHelper.click(btnLogin);}
    public void checkMailEmptyMsg(String message) { elementHelper.checkElementWithText(txtError, message);}
    public void checkPWEmptyMsg(String message) { elementHelper.checkElementWithText(txtError, message);}

    // Empty Password
    public void enterCorrectMail(String mail) { elementHelper.sendKey(homePage.txtFieldMail, mail);}
    public void checkMailNoError() { elementHelper.checkElementWithText_False(txtError, wrongMailError);}

    // Empty Email
    public void enterCorrectPW(String password) { elementHelper.sendKey(homePage.txtFieldPW, password);}
    public void checkPWNoError() { elementHelper.checkElementWithText_False(homePage.txtFieldPW, wrongPWError);}

    // False Email
    public void checkWrongMailError(String mail) { elementHelper.checkElementWithText(txtError, mail);}

    // False Login
    public void checkFalseLoginError(String error) { elementHelper.checkElementWithText(txtLoginError, error);}
}
