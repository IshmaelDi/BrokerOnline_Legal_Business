package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayerDetails extends PageObject {

    // Payer Details Elements

    String RegisteredBusinessCheckboxXpath = "//*[@id=\"b50-SameAsRegBusiness\"]";
    String JobPositionXpath = "//*[@id=\"b50-Dropdown_JobPosition\"]";
    String CompanyNameXpath = "//*[@id=\"b50-NSandN4Payer\"]/div[3]/div/div[1]/span";
    String RegistrationNumberXpath = "//*[@id=\"b50-NSandN4Payer\"]/div[3]/div/div[2]/span";
    String TitleXpath = "//*[@id=\"b50-Dropdown_Title\"]";
    String IdentityTypeXpath = "//*[@id=\"b50-Dropdown_IdentityType\"]";
    String IdentityNumberXpath = "//*[@id=\"b50-Input_IdentityNumber\"]";
    String PnameXpath = "//*[@id=\"b50-Input_FirstNames\"]";
    String PSurnameXpath = "//*[@id=\"b50-Input_Surname\"]";
    String PMobileNumberXpath = "//*[@id=\"b50-Input_MobileTelephoneNumber\"]";
    String HomeNumberXpath = "//*[@id=\"b50-Input_HomeTelephoneNumber\"]";
    String WorkNumberXpath ="//*[@id=\"b50-Input_WorkTelephoneNumber\"]";
    String emailXpath = "//*[@id=\"b50-Input_EmailAddress\"]";
    String BankNameXpath = "//*[@id=\"b50-Dropdown_BankName\"]";
    String BankAccountTypeXpath = "//*[@id=\"b50-Dropdown_BankAccountType\"]";
    String BankAccountNumberXpath = "//*[@id=\"b50-Input_BankAccountNumber\"]";
    String POSVerifiedXpath = "//*[@id=\"b50-Dropdown_POS\"]";
    String IsSACitizenXpath = "//*[@id=\"b50-Checkbox1\"]";
    String DebiDayXpath = "//*[@id=\"b50-Dropdown_DebitDay2\"]";
    String PworkTelephoneNumberXpath = "//*[@id=\"b50-Input_WorkTelephoneNumber\"]";
    String ContinueBtnXpath = "//*[@id=\"b50-PayerForm\"]/div[2]/div/button[2]";


    @Step("click continue button")
    public void ClickSameasregisteredbusiness() throws InterruptedException {
        $(By.xpath(RegisteredBusinessCheckboxXpath)).click();
        //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegisteredBusinessCheckboxXpath))).click();
    }
    @Step("Select Job position")
    public void selectJobPosition(String JobPosition) throws InterruptedException {
            WebElement position = $(By.xpath(JobPositionXpath));
            selectFromDropdown(position, JobPosition);
        Thread.sleep(3000);
        }
    @Step("Enter company name")
    public void enterCompanyName(String CompanyName) throws InterruptedException {
        $(By.xpath(CompanyNameXpath)).sendKeys( CompanyName);
        Thread.sleep(3000);
    }
    @Step("Enter registration number")
    public void enterRegNumber(String registrationNumber) throws InterruptedException {
        $(By.xpath(RegistrationNumberXpath)).sendKeys( registrationNumber);
        Thread.sleep(3000);
    }
    @Step("Enter passport number")
    public void passportNumber(String PassportNumber) throws InterruptedException {
        $(By.xpath(IdentityNumberXpath)).sendKeys(PassportNumber);
        Thread.sleep(300);

    }
    @Step("Enter first name")
    public void enterFirstName(String firstName) throws InterruptedException {
        $(By.xpath(PnameXpath)).sendKeys(firstName);
        Thread.sleep(3000);
    }
    @Step("Enter surname")
    public void enterSurname(String surname) throws InterruptedException {
        $(By.xpath(PSurnameXpath)).sendKeys(surname);
        Thread.sleep(3000);
    }
    @Step("Enter Mobile Number")
    public void enterMobilenum(String mobileNumber) throws InterruptedException {


        $(By.xpath(PMobileNumberXpath)).sendKeys(mobileNumber);
        Thread.sleep(3000);
    }
    @Step("Enter Home number")
    public void enterHomeNumber(String homeNumber) throws InterruptedException {
        $(By.xpath(HomeNumberXpath)).sendKeys(homeNumber);
        Thread.sleep(3000);
    }
    @Step("Enter Work number")
    public void EnterWorkNumber(String homeNumber) throws InterruptedException {
        $(By.xpath(WorkNumberXpath)).sendKeys(homeNumber);
        Thread.sleep(3000);
    }

    @Step("Enter work number ")
    public void enterWorkNumber(String workNumber) throws InterruptedException {
        $(By.xpath(PworkTelephoneNumberXpath)).sendKeys(workNumber);
        Thread.sleep(3000);
    }
    @Step("Enter Email address")
    public void enteremailAddress(String EmailAddress) throws InterruptedException {

        $(By.xpath(emailXpath)).sendKeys(EmailAddress);
        Thread.sleep(3000);
    }

    @Step("Enter bank account number")
    public void enterAccNumber(String AccountNumber){
        $(By.xpath(BankAccountNumberXpath)).sendKeys(AccountNumber);

    }
    @Step("select title")
    public void selectTitle(String Title){
        WebElement PTitle = $(By.xpath(TitleXpath));
        selectFromDropdown(PTitle, Title);
    }
    @Step("select ID Type")
    public void selectIDType(String IDType){
        WebElement type = $(By.xpath(IdentityTypeXpath));
        selectFromDropdown(type, IDType);
    }
    @Step("select bank name")
    public void selectBankName(String bankName){
        WebElement bank = $(By.xpath(BankNameXpath));
        selectFromDropdown(bank, bankName);
    }
    @Step("select bank account type")
    public void selectBankType(String bankType){
        WebElement BankType = $(By.xpath(BankAccountTypeXpath));
        selectFromDropdown(BankType, bankType);
    }
    @Step("select point of sale verifier")
    public void selectPointOfSaleVerified(String PointofSaleVer){
        WebElement pos = $(By.xpath(POSVerifiedXpath));
        selectFromDropdown(pos, PointofSaleVer);
    }
    @Step("select debit day")
    public void selectDebitDay(String debitDay){
        WebElement debitDy = $(By.xpath(DebiDayXpath));
        selectFromDropdown(debitDy, debitDay);
    }
    @Step("Is South African Citizen")
    public void IsSACitizen(){
        WebElement checkBoxElement = getDriver().findElement(By.xpath(IsSACitizenXpath));
        boolean isDisplayed = checkBoxElement.isDisplayed();

// performing click operation if element is displayed
        if (isDisplayed) {
            checkBoxElement.click();
        }

    }
    @Step("click continue button")
    public void clickContinue(){
        $(By.xpath(ContinueBtnXpath)).click();

    }






























}
