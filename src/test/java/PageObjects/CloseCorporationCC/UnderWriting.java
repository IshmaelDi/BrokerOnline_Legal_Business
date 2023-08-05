package PageObjects.CloseCorporationCC;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class UnderWriting extends PageObject {

    // UnderWriting Capture

    // UnderWriting Elements

    String PreviousLegalMattersXpath = "//*[@id=\"b44-LegalMatters\"]";

    String RegisteredLegalEntityXpath = "//*[@id=\"b44-IsLegalEntity\"]";
    String MoreThanFIVEOverdueAccountsXpath = "//*[@id=\"b44-Invoices\"]";
    String IndustryIsTheBusinessInXpath = "//*[@id=\"b44-Industry\"]";
    String IndustrySpecificsXpath = "//*[@id=\"b44-TextArea_IndustrySpecifics\"]";


    // UnderWriting Methods

    @Step("select Legal Matters from drop list")

    public void SelectProductFromDropList(String one) {
        Select DropDownDisplay = new Select(getDriver().findElement(By.xpath(PreviousLegalMattersXpath)));
        DropDownDisplay.selectByVisibleText("1");
    }

    @Step("select Legal Entity from drop list")
    public void SelectLegalEntityFromDropList(String Yes_No) {
        WebElement Cl = $(By.xpath(RegisteredLegalEntityXpath));
        selectFromDropdown(Cl, Yes_No);
    }

    @Step("Select overdue accounts from drop list")
    public void SelectOverdueAccountsFromDropList(String Yes_No){
        WebElement OA = $(By.xpath(MoreThanFIVEOverdueAccountsXpath));
        selectFromDropdown(OA,Yes_No);
    }

    @Step("select Business In from drop list")

    public void SelectBusinessIn(String EstateAgents) {
        Select DropDownDisplay = new Select(getDriver().findElement(By.xpath(IndustryIsTheBusinessInXpath)));
        DropDownDisplay.selectByVisibleText("Estate Agents");
    }

    // // identify element
    //      WebElement m = driver.findElement(By.id("comment"));
    //      // enter text
    //      m.sendKeys("Selenium");

    @Step("Enter text in Industry Specifics")
    public void EnterTextInIndustrySpecific(String HiAutomation){
        WebElement t = getDriver().findElement(By.xpath(IndustrySpecificsXpath));

    }



}






