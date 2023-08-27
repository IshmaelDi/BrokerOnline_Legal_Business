package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage extends PageObject {


    // Access Code Elements.
    String accessCodeXpath = "//*[@id=\"b1-Input_AccessCode\"]";
    String confirmButtonXpath = "//*[@id=\"b1-Form1\"]/div[2]/div/div/button/span";


    // Login Credentials Elements.
    String brokerCodeXpath = "//*[@id=\"Input_UsernameVal\"]";
    String passwordXpath = "//*[@id=\"Input_PasswordVal\"]";
    String loginXpath = "//*[@id=\"LoginForm\"]/div[3]/button/div";

    String OpenWebsite = "https://cbc-uat.clientele.co.za/BrokerOnline/Login";


    public void OpenWeb(){
        getDriver().get(OpenWebsite);
    }

    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmBtn))).click();
    // Methods Implementations
    @Step("Enter Access Code")
    public void enterAccessCode(String AccessCode ) throws InterruptedException {

        getDriver().switchTo().defaultContent();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accessCodeXpath))).sendKeys(AccessCode);
        $(By.xpath(confirmButtonXpath)).click();
    }
    @Step("Enter broker Code and Password")
    public void enterBrokerCodeAndPassword(String a,  String b) throws InterruptedException {
        Thread.sleep(3000);
        getDriver().switchTo().defaultContent();
        $(By.xpath(brokerCodeXpath)).sendKeys(a);
        $(By.xpath(passwordXpath)).sendKeys(b);
        Thread.sleep(3000);
    }
    @Step("Click On Login Button")
    public void clickOnLoginButton() throws InterruptedException {
        $(By.xpath(loginXpath)).click();
        Thread.sleep(3000);


    }


}

