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
    String HCheckBox = "//*[@id=\"b48-Checkbox1\"]";




    //Mandate Holder Methods

    @Step("Click on CheckBox")
    public void ClickOnCheckBox(){
        WebElement chechbox = $(By.xpath(ContactPersonCheckBoxXpath));
    }

    @Step("Select Title {String}")
    public void SelectTitle(String Title){

    }
}
