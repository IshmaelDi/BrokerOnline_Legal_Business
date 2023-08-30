package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Rule;
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

    //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmBtn))).click();


    public void OpenWeb() throws InterruptedException {

        getDriver().get(OpenWebsite);
        Thread.sleep(3000);
    }

    // Methods Implementations

    public void enterAccessCode(String AccessCode) throws InterruptedException {
        $(By.xpath(accessCodeXpath)).sendKeys(AccessCode);
//        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accessCodeXpath))).click();
//        String ConfirmBtn;
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(accessCodeXpath))).sendKeys(AccessCode);
        $(By.xpath(confirmButtonXpath)).click();
    }
    public void enterBrokerCodeAndPassword(String a,  String b) throws InterruptedException {
        $(By.xpath(brokerCodeXpath)).sendKeys(a);
        Thread.sleep(3000);
        $(By.xpath(passwordXpath)).sendKeys(b);
    }
    public void clickOnLoginButton() throws InterruptedException {
        $(By.xpath(loginXpath)).click();
        Thread.sleep(3000);

    }


}

