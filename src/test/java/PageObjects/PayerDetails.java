package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayerDetails extends PageObject {

    // Payer Details Elements

    String RegisteredBusinessXpath = "//*[@id=\"b50-SameAsRegBusiness\"]";
    String JobPositionXpath = "//*[@id=\"b50-Dropdown_JobPosition\"]";
    String CompanyNameXpath = "//*[@id=\"b50-NSandN4Payer\"]/div[3]/div/div[1]/span";
    String RegistrationNumberXpath = "//*[@id=\"b50-NSandN4Payer\"]/div[3]/div/div[2]/span";
    String TitleXpath = "//*[@id=\"b50-Dropdown_Title\"]";
    String IdentityTypeXpath = "//*[@id=\"b50-Dropdown_IdentityType\"]";
    String IdentityNumberXpath = "//*[@id=\"b50-Input_IdentityNumber\"]";
    String PnameXpath = "//*[@id=\"b50-Input_FirstNames\"]";
    String PSurnameXpath = "//*[@id=\"b50-Input_Surname\"]";
    String PMobileNumberXpath = "///*[@id=\"b50-Input_MobileTelephoneNumber\"]";
    String HomeNumberXpath = "//*[@id=\"b50-Input_HomeTelephoneNumber\"]";
    String emailXpath = "//*[@id=\"b50-Input_EmailAddress\"]";
    String BankNameXpath = "//*[@id=\"b50-Dropdown_BankName\"]";
    String BankAccountTypeXpath = "//*[@id=\"b50-Dropdown_BankAccountType\"]";
    String BankAccountNumberXpath = "//*[@id=\"b50-Input_BankAccountNumber\"]";
    String POSVerifiedXpath = "//*[@id=\"b50-Dropdown_POS\"]";
    String IsSACitizenXpath = "//*[@id=\"b50-Checkbox1\"]";
    String DebiDayXpath = "//*[@id=\"b50-Dropdown_DebitDay2\"]";


    // Payer Details Methods

    @Step("Select Job position")
    public void selectJobPosition(String JobPosition){
            WebElement position = $(By.xpath(JobPositionXpath));
            selectFromDropdown(position, JobPosition);
        }
    @Step("Enter company name")
    public void enterCompanyName(String CompanyName){
        $(By.xpath(CompanyNameXpath)).sendKeys( CompanyName);

    }
    @Step("Enter registration number")
    public void enterRegNumber(String registrationNumber){
        $(By.xpath(RegistrationNumberXpath)).sendKeys( registrationNumber);

    }
    @Step("Enter passport number")
    public void passportNumber(String PassportNumber){
        $(By.xpath(IdentityTypeXpath)).sendKeys(PassportNumber);

    }
    @Step("Enter first name")
    public void enterFirstName(String firstName){
        $(By.xpath(PnameXpath)).sendKeys(firstName);

    }
    @Step("Enter surname")
    public void enterSurname(String surname){
        $(By.xpath(PSurnameXpath)).sendKeys(surname);

    }
    @Step("Enter Mobile Number")
    public void enterMobilenum(String mobileNumber){
        $(By.xpath(PMobileNumberXpath)).sendKeys(mobileNumber);
    }
    @Step("Enter Home number")
    public void enterHomeNumber(String homeNumber){
        $(By.xpath(HomeNumberXpath)).sendKeys(homeNumber);

    }
    @Step("Enter work number ")
    public void enterWorkNumber(String workNumber){
        $(By.xpath(PworkTelephoneNumberXpath)).sendKeys(workNumber);

    }

    @Step("Enter Email address")
    public void enteremailAddress(String EmailAddress){
        $(By.xpath(emailXpath)).sendKeys(EmailAddress);
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
        WebElement type = $(By.xpath(IdentityNumberXpath));
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
    public void selectDebitday(String debitDay){
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
