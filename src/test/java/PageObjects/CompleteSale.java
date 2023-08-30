package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CompleteSale extends PageObject {

    String Totalpremium ="//*[@id=\"b51-PremiumDetails\"]/div[2]/div/div[1]/div[2]/span";
    String Termscoditions = "//*[@id=\"b51-Checkbox2\"]";
    String ClienteSigniture="//*[@id=\"b51-ClientSignature\"]/div[2]/button/i";
    String FinshLaterButton = "//*[@id=\"b51-Buttons\"]/div[1]/button";
    String AcceptAndComplete= "//*[@id=\"b51-Buttons\"]/div[2]/button";
    String   Premium ="//*[@id=\"b51-PremiumDetails\"]/div[2]/div/div[1]/div[2]/span";
    String SumAssured ="//*[@id=\"b51-PremiumDetails\"]/div[2]/div/div[3]/span";
    String     DownloadTermsAndconditions ="//*[@id=\"b51-b18-Content\"]/div[2]/a/span";
    String CompanyName ="//*[@id=\"b51-BusinessDetails\"]/div[2]/div[1]/div[2]/span";
    String Numberofemplyees ="//*[@id=\"b51-BusinessDetails\"]/div[2]/div[2]/div[2]/span";
    String AnualTurnOver ="//*[@id=\"b51-BusinessDetails\"]/div[2]/div[2]/div[2]/span";

    String TypeSigniture ="//*[@id=\"b51-b19-SignatureCanvas\"]/canvas";
    String SignituredonButton ="//*[@id=\"b51-b19-CtrlButtons\"]/div[2]/a/span";

    // Functions for complte sale
    @Step(" Check Total initial premium amount")
    public void Totalpremium() throws InterruptedException {

        String totalpremium = $(By.xpath(Totalpremium)).getText();
        System.out.println("Total premium is:" + totalpremium);
        Thread.sleep(3000);
    }
    @Step(" View Sum assured")
    public void ViewSumAssured() throws InterruptedException {

        String sumAssured = $(By.xpath(SumAssured)).getText();
        System.out.println("Sum Assured  is:" + sumAssured);
        Thread.sleep(3000);
    }
    @Step(" View company name")
    public void ViewCompanyName() throws InterruptedException {

        String CName = $(By.xpath(SumAssured)).getText();
        System.out.println("Company Name is displayed correctly:" + CName);
        Thread.sleep(3000);
    }
    @Step(" verify tha number of employee is correct")
    public void ViewNumberofEmplyees() throws InterruptedException {

        String NoOfEmployees = $(By.xpath(SumAssured)).getText();
        System.out.println("Number of employees is:" + NoOfEmployees);
        Thread.sleep(3000);
    }
    @Step(" Vew anual Turn Over")
    public void ViewAnnualTurnOver() throws InterruptedException {

        String AnnUalTunOver = $(By.xpath(SumAssured)).getText();
        System.out.println("Annual turn Over  is:" + AnnUalTunOver);
        Thread.sleep(3000);
    }
    @Step("Save captured beneficiary details")
    public void ClickTermsAndConditions() throws InterruptedException {
        $(By.xpath(Termscoditions)).click();
        Thread.sleep(3000);
    }
    @Step("Clic accept and complte button")
    public void ClickAcceptAndCompleteButton() throws InterruptedException {
        $(By.xpath(AcceptAndComplete)).click();
     Thread.sleep(3000);
    }
}
