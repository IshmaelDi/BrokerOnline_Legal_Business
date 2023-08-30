package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompleteSale extends PageObject {

    // Web Element for Web Elements.

    String TotalPremiumXpath ="//*[@id=\"b51-Declaration\"]/div/div[1]/div/div/span";
    String PremiumXpath ="//*[@id=\"b51-PremiumDetails\"]/div[2]/div/div[1]/div[2]/span";
    String SumAssuredXpath ="//*[@id=\"b51-PremiumDetails\"]/div[2]/div/div[3]/span";
    String CompanyNameXpath ="//*[@id=\"b51-BusinessDetails\"]/div[2]/div[1]/div[2]/span";
    String NumberOfEmployeesXpath ="//*[@id=\"b51-BusinessDetails\"]/div[2]/div[2]/div[2]/span";
    String AnnualTurnOverXpath ="//*[@id=\"b51-BusinessDetails\"]/div[2]/div[2]/div[2]/span";
    String TermsAndConditionCheckBoxXpath = "//*[@id=\"b51-Checkbox2\"]";
    String DownloadTermsAndConditionsXpath ="//*[@id=\"b51-b18-Content\"]/div[2]/a/span";
    String ClientSignatureButtonXpath ="//*[@id=\"b51-ClientSignature\"]/div[2]/button/i";
    String signatureButtonXpath = "//*[@id=\"b51-ClientSignature\"]/div[2]/button";
    String TypeSignatureXpath ="//*[@id=\"b51-b19-SignatureCanvas\"]/canvas";
    String ClearXpath = "//*[@id=\"b51-b19-CtrlButtons\"]/div[1]/a/span";
    String DoneXpath = "//*[@id=\"b51-b19-CtrlButtons\"]/div[2]/a/span";
    String FinishLaterButtonXpath = "//*[@id=\"b51-Buttons\"]/div[1]/button";
    String AcceptAndCompleteButtonXpath = "//*[@id=\"b51-Buttons\"]/div[2]/button";



    // Thank You page that contain Policy Number, Monthly premium and Total Sum Assured. Will be doing confirmations.


    String ThankYouMessageXpath = "//*[@id=\"b51-HeadingComplete\"]";
    String PageTitleXpath = "//*[@id=\"b51-CompleteSale\"]/div[1]/div/div[1]";
    String PolicyNumberXpath = "//*[@id=\"b51-b20-Content\"]/div[1]";
    String TotalMonthlyPremiumXpath = "//*[@id=\"b51-b20-Content\"]/div[2]";
    String TotalSumAssuredXpath = "//*[@id=\"b51-b20-Content\"]/div[4]";




    // Functions for Complete sale


    @Step("View Premium Amount")
    public void premiumAmount() throws InterruptedException {
        String TotalPremium = $(By.xpath(TotalPremiumXpath)).getText();
        System.out.println("Total premium is:" + TotalPremium);
        Thread.sleep(3000);
    }

    @Step("View Sum Assured")
    public void ViewSumAssured() throws InterruptedException {
        String SumAssured = $(By.xpath(SumAssuredXpath)).getText();
        System.out.println("Sum Assured  is: " + SumAssured);

    }
    @Step("View Company Name")
    public void ViewCompanyName() throws InterruptedException {
        String CName = $(By.xpath(CompanyNameXpath)).getText();
        System.out.println("Company Name is displayed correctly: " + CName);
    }
    @Step(" Verify that Number of Employee is Correct")
    public void ViewNumberOfEmployees() throws InterruptedException {
        String NoOfEmployees = $(By.xpath(NumberOfEmployeesXpath)).getText();
        System.out.println("Number of employees is:" + NoOfEmployees);

    }
    @Step(" View Annual TurnOver")
    public void ViewAnnualTurnOver() throws InterruptedException {
        String AnnUalTunOver = $(By.xpath(AnnualTurnOverXpath)).getText();
        System.out.println("Annual turnOver  is:" + AnnUalTunOver);
    }
    @Step("Click Terms And Conditions Check Box")
    public void ClickTermsAndConditionsCheckBox() throws InterruptedException {
        $(By.xpath(TermsAndConditionCheckBoxXpath)).click();
    }
    @Step("Click Download Terms And Conditions Link")
    public void ClickDownloadTermsAndConditionsLink(){
        $(By.xpath(DownloadTermsAndConditionsXpath)).click();
    }

    @Step("ClickSignatureButton")
    public void ClickSignatureButton() throws InterruptedException {
        getDriver().switchTo().defaultContent();


        Actions actions = new Actions(getDriver());
        $(By.xpath(signatureButtonXpath)).click();

        WebElement elem_slider = getDriver().findElement(By.xpath("//*[@id=\"b51-b19-SignatureCanvas\"]/canvas"));
        Thread.sleep(2000);

        actions.clickAndHold(elem_slider).moveByOffset(100, 25).release().perform();
        actions.clickAndHold(elem_slider).moveByOffset(100, 150).release().perform();
        actions.clickAndHold(elem_slider).moveByOffset(100, -150).release().perform();
        actions.clickAndHold(elem_slider).moveByOffset(100, -25).release().perform();
        Thread.sleep(3000);
        $(By.xpath(DoneXpath)).click();

    }
    @Step("Click Accept and Complete Button to navigate to Complete Sale_Thank You! page")
    public void ClickAcceptAndCompleteButton() throws InterruptedException {
        $(By.xpath(AcceptAndCompleteButtonXpath)).click();
        Thread.sleep(10000);
    }
    @Step("View Thank You Page")
    public void ThanksYouPage(){
        String pageTitle = getTitle();
        String ExpectedTitle = getTitle();

        if (pageTitle.equals((ExpectedTitle))) {

            System.out.println(("Broker is on the Complete Sale_Thank You! page"));

        }else {

            Assert.fail("Broker is not on Complete Sale_Thank You! page");
        }
        $(By.xpath(ThankYouMessageXpath)).getText();

    }
    @Step("View and confirm if the applicants can see generated policy number ")
    public void PolicyNumber () {
        boolean isPolicyNUM = $(By.xpath(PolicyNumberXpath)).isDisplayed();
        if (isPolicyNUM) {

            System.out.println("Policy number is generated and visible to the user: " + $(By.xpath(PolicyNumberXpath)).getText());

        } else {

            Assert.fail("Policy number is not generated ");

        }

    }

    @Step("View monthly premium")
    public void MonthlyPremium(String MonthlyPremium) {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        boolean isFinalMonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TotalMonthlyPremiumXpath))).isDisplayed();
        if (isFinalMonth) {

            String CoverPremium = $(By.xpath(TotalMonthlyPremiumXpath)).getText();
            System.out.println("Final monthly premium is visible to the user:" + MonthlyPremium);
            Assert.assertEquals(CoverPremium, MonthlyPremium);

        } else {

            Assert.fail("Total premium is not visible to the user /  Total premium is not the same ");
        }
    }

        // Add Total Sum Assured Function

        @Step("View Total Sum Assured")
        public void TotalSumAssured(String ViewSumAssured) {

            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
            boolean isFinalMonth =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(TotalSumAssuredXpath))).isDisplayed();
            if (isFinalMonth) {

                String TotalSumAssured = $(By.xpath(TotalSumAssuredXpath)).getText();
                System.out.println("Final monthly premium is visible to the user:" + TotalSumAssured );
                Assert.assertEquals(TotalSumAssured, ViewSumAssured );

            } else {

            }
            Assert.fail("Final premium is not visible to the user /  Final premium is not the same ");
        }

    }








