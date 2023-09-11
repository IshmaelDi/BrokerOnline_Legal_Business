package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import org.apache.xmpbox.type.GUIDType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactPerson extends PageObject {

    // Contact Person elements

    String TitleXpath = "//*[@id=\"b46-Input_Title\"]";
    String IdentityTypeXpath = "//*[@id=\"b46-Dropdown_IdentityType\"]";
    String IdentityNumberXpath = "//*[@id=\"b46-Input_IdentityNumber\"]";
    String PassportNumber  ="//*[@id=\"b46-Input_PassportNumber\"]";
    String CotactPersonDOB = "//*[@id=\"b46-Input_DateOfBirth\"]";
    String NameXpath = "//*[@id=\"b46-Input_FirstNames\"]";
    String SurnameXpath = "//*[@id=\"b46-Input_Surname\"]";
    String MobileNumberXpath = "//*[@id=\"b46-Input_MobileTelephoneNumber\"]";
    String JobPositionXpath = "//*[@id=\"b46-Input_JobPosition\"]";
    String PrimaryContactXpath = "//*[@id=\"b46-Input_IsPrimaryContact\"]";
    String ContinueButtonXpath = "//*[@id=\"b46-ContactPersonForm\"]/div[8]/button";


    // Contact Person Methods

    @Step("Select Title {String}")
    public void SelectTitle(String Title) throws InterruptedException {
        WebElement t = $(By.xpath(TitleXpath));
        Click.on();
        selectFromDropdown(t, Title);
        Thread.sleep(3000);
    }

    @Step("Select Identity Type")
    public void SelectIdentityType(String IdentityType){
        WebElement t = $(By.xpath(IdentityTypeXpath));
        selectFromDropdown(t, IdentityType);
    }


    @Step("Enter Identity Number {String}")
    public void EnterIdnumberPassport(String IdentityType) throws InterruptedException {
        $(By.xpath(IdentityNumberXpath)).sendKeys(IdentityType);
        Thread.sleep(3000);

    }
    @Step("Enter passport {String}")
    public void EnterPassport(String Passport) throws InterruptedException {
        $(By.xpath(PassportNumber)).sendKeys(Passport);
        Thread.sleep(3000);

    }
    @Step("Enter DOB {String}")
    public void CotactPeronDOB(String ContactPeronDOB) throws InterruptedException {

        $(By.xpath(CotactPersonDOB)).sendKeys(ContactPeronDOB);
        Thread.sleep(3000);
    }
    @Step("Enter Name {String}")
    public void EnterName(String Name) throws InterruptedException {

        $(By.xpath(NameXpath)).sendKeys(Name);
        Thread.sleep(3000);
    }
    @Step("Enter Mobile Number")
    public void EnterMobileNumber(String MobileNumber) throws InterruptedException {

        $(By.xpath(MobileNumberXpath)).sendKeys(MobileNumber);
        Thread.sleep(3000);
    }
    @Step("Enter Surname {String}")
    public void EnterSurname(String Surname) throws InterruptedException {

        $(By.xpath(SurnameXpath)).sendKeys(Surname);
        Thread.sleep(3000);
    }



    @Step("Select Job Position {String}")
    public void SelectJobPosition(String JobPosition) throws InterruptedException {
        WebElement J = $(By.xpath(JobPositionXpath));
        selectFromDropdown(J, JobPosition);
        Thread.sleep(3000);
    }

    @Step("Select Primary Contact {String}")
    public void SelectPrimaryContacts(String PrimaryContacts) throws InterruptedException {

        WebElement p = $(By.xpath(PrimaryContactXpath));
        selectFromDropdown(p, PrimaryContacts);
        Thread.sleep(3000);

    }

    @Step("Click on Finish Later Checkbox")
    public void CheckBox(){

        //Validate Checkbox using isDisplayed() and click

        WebElement checkBoxElement = getDriver().findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        boolean isDisplayed = checkBoxElement.isDisplayed();

// performing click operation if element is displayed
        if (isDisplayed) {
            checkBoxElement.click();
        }

    }





    @Step("Click on Continue Button")
    public void ClickOnContinueButton() throws InterruptedException {

        $(By.xpath(ContinueButtonXpath)).click();
        Thread.sleep(4000);
    }


}
