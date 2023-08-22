package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UnderWriting extends PageObject {

    // UnderWriting Elements

    String LegalMattersXpath = "//*[@id=\"b44-LegalMatters\"]";
    String LegalEntityXpath = "//*[@id=\"b44-IsLegalEntity\"]";
    String InvoicesXpath = "//*[@id=\"b44-Invoices\"]";
    String IndustryXpath = "//*[@id=\"b44-Industry\"]";
    String TextAreaXpath = "//*[@id=\"b44-TextArea_IndustrySpecifics\"]";
    String CheckBoxXpath = "//*[@id=\"b44-Checkbox1\"]";
    String ContinueButtonXpath = "//*[@id=\"b44-UnderwritingForm\"]/div/div[7]/button";


    // UnderWriting Methods

    @Step("Select Legal Matters {Sting} from drop list")
    public void SelectLegalMatters(String value) {
        WebElement LM = $(By.xpath(LegalMattersXpath));
        LM.click();
        selectFromDropdown(LM, value);

    }


//    @Step("Select Legal Matters {Sting} from drop list")
//    public void SelectLegalMatters(String LegalMatters) {
//        WebElement LM = $(By.xpath(LegalMattersXpath));
//        sel
//        selectFromDropdown(LM, LegalMatters);
//    }

    @Step("Select Legal Entity {String} from drop list")
    public void SelectLegalEntity(String LegalEntity) {
        WebElement LE = $(By.xpath(LegalEntityXpath));
        selectFromDropdown(LE, LegalEntity);
    }

    @Step("Select Invoices {String} from drop list")
    public void SelectInvoices(String Invoices) {
        WebElement I = $(By.xpath(InvoicesXpath));
        selectFromDropdown(I, Invoices);
    }

    @Step("Select Industry {String} from drop list")
    public void SelectIndustry(String Industry) {
        WebElement IN = $(By.xpath(IndustryXpath));
        selectFromDropdown(IN, Industry);
    }

    @Step("Enter Industry Specific {String}")
    public void IndustrySpecifics(String IndustrySpecific) {
        $(By.xpath(TextAreaXpath)).sendKeys(IndustrySpecific);
    }

    @Step("Click on Finish later Checkbox")
    public void FinishLaterCheckBox() {
        WebElement checkBoxElement = getDriver().findElement(By.xpath(CheckBoxXpath));
        boolean isDisplayed = checkBoxElement.isDisplayed();

// performing click operation if element is displayed
        if (isDisplayed) {
            checkBoxElement.click();
        }


    }

    @Step("Click on UnderWritingContinue Button")
    public void UnderWritingContinueButton(){
        $(By.xpath(ContinueButtonXpath)).click();
    }











}
