package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ElementHelper;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //Elements
    By btnLoginPage = By.cssSelector("span .dropdown-label");
    public By txtFieldMail = By.cssSelector("[placeholder=\"E-Posta Adresiniz\"]");
    public By txtFieldPW = By.cssSelector("[placeholder = \"Şifreniz\"]");

    //Text
    String txtLogin = "GİRİŞ YAP";

    //Check Login Page
    public void checkHomePage() { elementHelper.checkURL("https://www.lcwaikiki.com/tr-TR/TR");}
    public void clickLoginPage() { elementHelper.click(btnLoginPage);}
    public void checkLoginPage() { elementHelper.checkElementPresence(txtFieldPW);}
}
