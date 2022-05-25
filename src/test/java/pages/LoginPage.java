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

    // Text
    String mail = "E-Posta";
    String phone = "Telefon";
    String txtFieldMail = "E-Posta Adresiniz";
    String txtFieldPW= "Şifreniz";
    String rememberPW = "Beni Hatırla";
    String forgotPW = "Şifremi Unuttum";
    String login = "GİRİŞ YAP";


    //Check Email Components
    public void clickMail() { elementHelper.click(radioBtnMail);}
    public void checkLoginPage() { elementHelper.presenceElement(lblLoginPage);}
//    public void checkMail() { elementHelper.checkElementWithText(radioBtnMail, mail);}
//    public void checkPhone() { elementHelper.checkElementWithText(radioBtnPhone, phone);}
//    public void checkMailText() { elementHelper.checkElementWithText(homePage.txtFieldMail, txtFieldMail);}
//    public void checkPWText() { elementHelper.checkElementWithText(homePage.txtFieldPW, txtFieldPW);}
    public void checkMail() { elementHelper.presenceElement(radioBtnMail);}
    public void checkPhone() { elementHelper.presenceElement(radioBtnPhone);}
    public void checkMailText() { elementHelper.presenceElement(homePage.txtFieldMail );}
    public void checkPWText() { elementHelper.presenceElement(homePage.txtFieldPW);}
    public void checkShowButton() { elementHelper.presenceElement(btnShowPW);}
    public void checkRememberButton() { elementHelper.presenceElement(btnRememberPW);}
    public void checkForgotButton() { elementHelper.presenceElement(btnForgotPW);}
    public void checkLoginButton() { elementHelper.presenceElement(btnLogin);}

}
