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
    public void enterBrokerCodeAndPassword() throws InterruptedException {
        $(By.xpath(brokerCodeXpath)).sendKeys("b1234");
        $(By.xpath(passwordXpath)).sendKeys("12345");
    }
    public void clickOnLoginButton() throws InterruptedException {
        $(By.xpath(loginXpath)).click();


    }




//    public void main(String[] args) throws NoAlertPresentException, InterruptedException {
//
//        System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        // Alert Message Handling
//
//        driver.get("https://cbc-uat.clientele.co.za/BrokerOnline/Login");
//        driver.manage().window().maximize();
//
//
//        driver.findElement(By.name("Access Code")).sendKeys("0132");
//        driver.findElement(By.name("Confirm")).submit();
////
////
////        // Switch to Alert
////
////        Alert alert = driver.switchTo().alert();
////
////        // Capturing alert message.
////
////        String alertMessage = driver.switchTo().alert().getText();
////
////        //Displaying alert message.
////
////        System.out.println(alertMessage);
////        Thread.sleep(1000);
////
////        // Accepting alert
////
////        alert.accept();
////
////
////    }
////
////
//
////        @Step("Enter Company Name {String}")
////        public void EnterCompanyName() {
////
////            $(By.xpath(CompanyNameXpath)).sendKeys("Mokoni");
//
//
//
//
//    }
//
//    public void enterAccessCode() throws InterruptedException {
//        Thread.sleep(3000);
//        getDriver().switchTo().defaultContent();
//        Thread.sleep(3000);
//        $(By.name("Access Code")).sendKeys("0132");
//        $(By.name("Confirm")).click();
//
//    }
//    public void enterBrokerCodeAndPassword() throws InterruptedException {
//        Thread.sleep(3000);
//        getDriver().switchTo().defaultContent();
//        Thread.sleep(3000);
//        $(By.name("UserName")).sendKeys("b1234");
//        $(By.name("Password")).sendKeys("12345");
//
//
//
//    }
//
//    public void clickOnLoginButton() throws InterruptedException {
//        $(By.name("Login")).click();
//        Thread.sleep(3000);
//    }
}

