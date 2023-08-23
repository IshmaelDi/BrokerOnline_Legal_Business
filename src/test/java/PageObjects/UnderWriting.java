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
    String UnderwrittingContinueBtn = "//*[@id=\"b44-UnderwritingForm\"]/div/div[7]/button";


    // UnderWriting Methods

    @Step("Select Legal Matters {Sting} from drop list")
    public void SelectLegalMatters(String SelectProductFromDropList){
        WebElement LM = $(By.xpath(LegalMattersXpath));
        selectFromDropdown(LM, SelectProductFromDropList);
    }

    @Step("Select Legal Entity {String} from drop list")
    public void SelectLegalEntity(String SelectProductFromDropList){
        WebElement LE = $(By.xpath(LegalEntityXpath));
        selectFromDropdown(LE, SelectProductFromDropList);
    }

    @Step("Select Invoices {String} from drop list")
    public void SelectInvoices(String SelectProductFromDropList){
        WebElement I = $(By.xpath(InvoicesXpath));
        selectFromDropdown(I, SelectProductFromDropList);
    }

    @Step("Select Industry {String} from drop list")
    public void SelectIndustry(String SelectProductFromDropList){
        WebElement IN = $(By.xpath(IndustryXpath));
        selectFromDropdown(IN, SelectProductFromDropList);
    }

    @Step("Enter Industry Specific {String}")
    public void IndustrySpecifics(String TxtArea){
        $(By.xpath(TextAreaXpath)).sendKeys(TxtArea);



    }

    @Step("Click om Checkbox")
    public void ClickOnCheckBox(){
        WebElement checkbox = $(By.xpath(CheckBoxXpath));

    }


    @Step("Click on Continue Button")
    public void ClickOnContinueButton() throws InterruptedException {

        $(By.xpath(UnderwrittingContinueBtn)).click();
        Thread.sleep(4000);
    }







}
