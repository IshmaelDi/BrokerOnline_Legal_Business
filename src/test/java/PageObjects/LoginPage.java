package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage extends PageObject {


    // Access Code Elements.
    String accessCodeXpath = "//*[@id=\"b1-Input_AccessCode\"]";
    String confirmButtonXpath = "//*[@id=\"b1-Form1\"]/div[2]/div/div/button/span";


    // Login Credentials Elements.
    String brokerCodeXpath = "//*[@id=\"Input_UsernameVal\"]";
    String passwordXpath = "//*[@id=\"Input_UsernameVal\"]";
    String loginXpath = "//*[@id=\"LoginForm\"]/div[3]/button/div";


    // Methods Implementations
    public void enterAccessCode() throws InterruptedException {
        $(By.xpath(accessCodeXpath)).sendKeys("0132");
        $(By.xpath(confirmButtonXpath)).click();
    }
    public void enterBrokerCodeAndPassword(String a,  String b) throws InterruptedException {
        $(By.xpath(brokerCodeXpath)).sendKeys(a);
        $(By.xpath(passwordXpath)).sendKeys(b);
    }
    public void clickOnLoginButton() throws InterruptedException {
        $(By.xpath(loginXpath)).click();


    }


}

