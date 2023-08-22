package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.apache.xmpbox.type.GUIDType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactPerson extends PageObject {

    // Contact Person elements

    String TitleXpath = "//*[@id=\"b46-Input_Title\"]";
    String IdentityTypeXpath = "//*[@id=\"b46-Dropdown_IdentityType\"]";
    String IdentityNumberXpath = "//*[@id=\"b46-Input_IdentityNumber\"]";
    String NameXpath = "//*[@id=\"b46-Input_FirstNames\"]";
    String SurnameXpath = "//*[@id=\"b46-Input_Surname\"]";
    String MobileNumberXpath = "//*[@id=\"b46-Input_Surname\"]";
    String JobPositionXpath = "//*[@id=\"b46-Input_JobPosition\"]";
    String PrimaryContactXpath = "//*[@id=\"b46-Input_IsPrimaryContact\"]";
    String ContinueButtonXpath = "//*[@id=\"b46-ContactPersonForm\"]/div[8]/button";


    // Contact Person Methods

    @Step("Select Title {String}")
    public void SelectTitle(String Title){
        WebElement t = $(By.xpath(TitleXpath));
        selectFromDropdown(t, Title);
    }
    @Step("Select Identity Type")
    public void SelectIdentityType(String IdentityType) {
        WebElement it = $(By.xpath(IdentityTypeXpath));
        selectFromDropdown(it, IdentityType);
    }
    @Step("Enter Identity Number {String}")
    public void EnterIdentityType(String IdentityType){
        $(By.xpath(IdentityNumberXpath)).sendKeys(IdentityType);

    }
    @Step("Enter Name {String}")
    public void EnterName(String Name){
        $(By.xpath(NameXpath)).sendKeys(Name);
    }

    @Step("Enter Surname {String}")
    public void EnterSurname(String Surname){
        $(By.xpath(SurnameXpath)).sendKeys(Surname);
    }

    @Step("Enter Mobile Number")
    public void EnterMobileNumber(String MobileNumber){
        $(By.xpath(MobileNumberXpath)).sendKeys(MobileNumber);
    }

    @Step("Select Job Position {String}")
    public void SelectJobPosition(String JobPosition){
        WebElement J = $(By.xpath(JobPositionXpath));
        selectFromDropdown(J, JobPosition);
    }

    @Step("Select Primary Contact {String}")
    public void SelectPrimaryContacts(String PrimaryContacts){
        WebElement p = $(By.xpath(PrimaryContactXpath));
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
    public void ClickOnContinueButton(){
        $(By.xpath(ContinueButtonXpath)).click();
    }


}
