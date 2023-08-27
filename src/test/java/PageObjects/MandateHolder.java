package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MandateHolder extends PageObject {

    String ContactPersonCheckBoxXpath = "//*[@id=\"b48-SameAsContactPerson\"]";
    String TitleXpath = "//*[@id=\"b48-Input_Title\"]";
    String IdTypeXpath = "//*[@id=\"b48-Dropdown_IdentityType\"]";
    String IdNumberXpath = "//*[@id=\"b48-Input_IdentityNumber\"]";
    String HNameXpath = "//*[@id=\"b48-Input_FirstNames\"]";
    String hSurnameXpath = "//*[@id=\"b48-Input_Surname\"]";
    String HMobileNumberXpath = "//*[@id=\"b48-Input_MobileTelephoneNumber\"]";
    String HJobPositionXpath = "//*[@id=\"b48-Input_JobPosition\"]";
    String MandateContinueButtonXpath = "//*[@id=\"b48-MandateHolderForm\"]/div[8]/div/button";


    //Mandate Holder Methods

    @Step("Select Title {String}")
    public void SelectTitle(String Title){
        WebElement t = $(By.xpath(TitleXpath));
        selectFromDropdown(t, Title);
    }
    @Step("Select IdentityType")
    public void selectIdentityType(String IdentityType){
        WebElement STI = $(By.xpath(IdTypeXpath));
        selectFromDropdown(STI, IdentityType);

    }
    @Step("Enter Identity Number {String}")
    public void EnterIdentityType(String IdentityType){
        $(By.xpath(IdNumberXpath)).sendKeys(IdentityType);

    }
    @Step("Enter Name {String}")
    public void EnterName(String Name){
        $(By.xpath(HNameXpath)).sendKeys(Name);
    }

    @Step("Enter Surname {String}")
    public void EnterSurname(String Surname){
        $(By.xpath(hSurnameXpath)).sendKeys(Surname);
    }

    @Step("Enter Mobile Number")
    public void EnterMobileNumber(String MobileNumber){
        $(By.xpath(HMobileNumberXpath)).sendKeys(MobileNumber);
    }

    @Step("Select Job Position {String}")
    public void SelectJobPosition(String JobPosition){
        WebElement J = $(By.xpath(HJobPositionXpath));
        selectFromDropdown(J, JobPosition);
    }

    @Step("Click Continue Button")
    public void ClickContinueButton(){
        $(By.xpath(MandateContinueButtonXpath)).click();
    }

}
