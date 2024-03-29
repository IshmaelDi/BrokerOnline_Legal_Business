package PageObjects;


import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class MandateHolder extends PageObject {
    String SameAscontactPerson = "//*[@id=\"b48-SameAsContactPerson\"]";
    String MandateHolderTitle = "//*[@id=\"b48-Input_Title\"]";
    String IdentityType = "//*[@id=\"b48-Dropdown_IdentityType\"]";
    String IdPassportNumber = "//*[@id=\"b48-Input_IdentityNumber\"]";
    String DoB = "//*[@id=\"b48-Input_DateOfBirth\"]";
    String MandateHolderName = "//*[@id=\"b48-Input_FirstNames\"]";
    String MadateholderSurname = "//*[@id=\"b48-Input_Surname\"]";
    String MandateHolderMobileNumber = "//*[@id=\"b48-Input_MobileTelephoneNumber\"]";
    String JobPosition = "//*[@id=\"b48-Input_JobPosition\"]";
    String ContinueBtn = "//*[@id=\"b48-MandateHolderForm\"]/div[8]/div/button";
    //WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
     //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ConfirmBtn))).click();
    //Page Functions--------------------------------------
    @Step("Click the continue button")
    public void SameAscontactPersonCHK() throws InterruptedException {
        $(By.xpath(SameAscontactPerson)).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SameAscontactPerson))).click();
        Thread.sleep(4000);
    }

    @Step("Select mandateholder title")
    public void SelectMandateHolderTitle(String MandateTitle) throws InterruptedException {
        WebElement e = $(By.xpath(MandateHolderTitle));
        selectFromDropdown(e, MandateTitle);
        Thread.sleep(3000);

    }

    @Step("Select Identity Type")
    public void SelectIdentityType(String Identity) {
        WebElement i = $(By.xpath(IdentityType));
        selectFromDropdown(i, Identity);

    }

    @Step("Capture ID or passport no")
    public void IdAndPassportNumber(String IdPassportNo) {
        $(By.xpath(IdPassportNumber)).sendKeys(IdPassportNo);
    }

    @Step("Capture ID or passport no")
    public void EnterDOB(String Dateofbirt) {
        $(By.xpath(DoB)).sendKeys(Dateofbirt);
    }

    @Step("Capture Manadate name")
    public void EnterMandateHolderName(String MandateName) {
        $(By.xpath(MandateHolderName)).sendKeys(MandateName);
    }

    @Step("Capture Manadate name")
    public void EnterMandateSurname(String MandateSurame) {
        $(By.xpath(MadateholderSurname)).sendKeys(MandateSurame);
    }

    @Step("Capture Manadateholder mobile number")
    public void EnterMandateMobileNo(String ManadateMobileNo) {
        $(By.xpath(MandateHolderMobileNumber)).sendKeys(ManadateMobileNo);
    }

    @Step("Select Job Position")
    public void Selectjobposition(String jobposition) {
        WebElement j = $(By.xpath(JobPosition));
        selectFromDropdown(j, jobposition);
    }
    @Step("Click on Continue Button")
    public void ClickOnContinueButton() {

        $(By.xpath(ContinueBtn)).click();
    }
}