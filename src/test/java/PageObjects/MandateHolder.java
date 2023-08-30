package PageObjects;


import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;


public class MandateHolder extends PageObject {
    String ContactPersonCheckBoxXpath = "//*[@id=\"b48-SameAsContactPerson\"]";
    String TitleXpath = "//*[@id=\"b48-Input_Title\"]";
    String IdTypeXpath = "//*[@id=\"b48-Dropdown_IdentityType\"]";
    String IdNumberXpath = "//input[@tabindex=\"4\"]";
    String PassportNumberXpath = "//input[@tabindex=\"4\"]";
    String DOBXpath = "//*[@id=\"b48-Input_DateOfBirth\"]";
    String HNameXpath = "//*[@id=\"b48-Input_FirstNames\"]";
    String hSurnameXpath = "//*[@id=\"b48-Input_Surname\"]";
    String HMobileNumberXpath = "//*[@id=\"b48-Input_MobileTelephoneNumber\"]";
    String HJobPositionXpath = "//*[@id=\"b48-Input_JobPosition\"]";
    String MandateContinueButtonXpath = "//*[@id=\"b48-MandateHolderForm\"]/div[8]/div/button";
    String HCheckBox = "//*[@id=\"b48-Checkbox1\"]";
    //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
     //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmBtn))).click();
    //Page Functions--------------------------------------
    @Step("Click on CheckBox")
    public void ClickOnCheckBox(){
        WebElement chechbox = $(By.xpath(ContactPersonCheckBoxXpath));
    }

    @Step("Select Title")
    public void SelectTitle(String Title){
        WebElement t = $(By.xpath(TitleXpath));
        selectFromDropdown(t, Title);
    }
    @Step("Select IdentityType")
    public void selectIdentityType(String IdentityType){
        WebElement STI = $(By.xpath(IdTypeXpath));
        selectFromDropdown(STI, IdentityType);
    }
    @Step("Enter Identity Number")
    public void EnterIdentityNumber(String IdentityNumber){
        $(By.xpath(IdNumberXpath)).sendKeys(IdentityNumber);
    }
    @Step("Enter PassportNumber")
    public void EnterPassportNumber(String PassportNumber){
        $(By.xpath(PassportNumberXpath)).sendKeys(PassportNumber);
    }

    @Step("Enter DOB")
    public void EnterDOB(String DOB){
        $(By.xpath(DOBXpath)).sendKeys(DOB);
    }
    @Step("Enter Name")
    public void EnterName(String Name){
        $(By.xpath(HNameXpath)).sendKeys(Name);
    }
    @Step("Enter Surname")
    public void EnterSurname(String Surname){
        $(By.xpath(hSurnameXpath)).sendKeys(Surname);
    }
    @Step("Enter Mobile Number")
    public void EnterMobileNumber(String MobileNumber){
        $(By.xpath(HMobileNumberXpath)).sendKeys(MobileNumber);
    }
    @Step("Select Job Position")
    public void SelectJobPosition(String JobPosition){
        WebElement J = $(By.xpath(HJobPositionXpath));
        selectFromDropdown(J, JobPosition);
    }
    @Step("Click Continue Button")
    public void ClickMandateContinueButton(){
        $(By.xpath(MandateContinueButtonXpath)).click();
    }
}