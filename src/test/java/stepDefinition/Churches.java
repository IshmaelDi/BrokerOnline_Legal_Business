package stepDefinition;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.core.Serenity.getDriver;

public class Churches {
    @Steps
    BusinessDetails businessDetails;
    @Steps
    LoginPage loginPage;
    @Steps
    UnderWriting underWriting;

    @Steps
    ContactPerson contactPerson;
    @Steps
    MandateHolder mandateholder;
    @Steps
    PayerDetails payerDetails;
    @Steps
    CompleteSale completeSale;

    @Given("User open Broker Online web browser,enter access code and login {string},{string},{string}")
    public void user_open_broker_online_web_browser_enter_access_code_and_login(String Accesscode1, String BrokerCode, String BrokerPassword) throws InterruptedException {
        loginPage.open();
        loginPage.enterAccessCode(Accesscode1);
        loginPage.enterBrokerCodeAndPassword(BrokerCode, BrokerPassword);

        loginPage.clickOnLoginButton();
    }

    @Given("Click on new sale, select product, clicks continue and capture business details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void click_on_new_sale_select_product_clicks_continue_and_capture_business_details(String BusinessName, String BusinessType, String IDPassportNumber, String RegistrationNumber, String NumberOfEmployees, String MobileNumber, String WorkNumber, String AnnualTurnOver, String Address1, String Address2, String PhysicalCode) throws InterruptedException {

        businessDetails.ClickNewSaleButton();
        businessDetails.SelectProduct("Clientèle Legal Business Plan");
        businessDetails.ClickOnContinueButton();

        businessDetails.SelectBusinessType(BusinessType);
        businessDetails.EnterCompanyName(BusinessName);
        businessDetails.IDpassportNumber(IDPassportNumber);
        businessDetails.NUMBEROFEMPLOYEES(NumberOfEmployees);
        businessDetails.MOBILENUMBER(MobileNumber);
        businessDetails.WORKNUMBER(WorkNumber);
        businessDetails.AnnualTurnOver(AnnualTurnOver);
        businessDetails.PhysicalAddressLine1(Address1);
        businessDetails.PhysicalAddressLine2(Address2);
        businessDetails.PhysicalAddressCode(PhysicalCode);
        businessDetails.AddressSameAsPhisicalAddress();
        businessDetails.BusinessDetailsContinueButton();

    }

    @Given("User to  Capture Underwriting details {string},{string},{string},{string},{string}")
    public void user_to_capture_underwriting_details(String LegalMatters, String IsBusinessRegistered, String OverdueaccoutOrinvoice, String whatIndustry, String SpecifyIndustry) throws InterruptedException {
        underWriting.SelectLegalMatters(LegalMatters);
        underWriting.SelectLegalEntity(IsBusinessRegistered);
        underWriting.SelectInvoices(OverdueaccoutOrinvoice);
        underWriting.SelectIndustry(whatIndustry);
        underWriting.IndustrySpecifics(SpecifyIndustry);
        underWriting.ClickOnContinueButton();
    }


    @Given("User to capture Contact details {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_to_capture_contact_details(String ContactpersonTitle, String IdentityType, String IdNumberPassport,String ContactPersonDOB, String FirstName, String LastName, String MobileNumber, String JobPosition, String IsprimaryContact) throws InterruptedException {
        contactPerson.SelectTitle(ContactpersonTitle);
        contactPerson.SelectIdentityType(IdentityType);
        //contactPerson.EnterIdnumberPassport(IdNumberPassport);
        contactPerson.EnterPassport(IdNumberPassport);
        contactPerson.CotactPeronDOB(ContactPersonDOB);
        contactPerson.EnterName(FirstName);
        contactPerson.EnterSurname(LastName);
        contactPerson.EnterMobileNumber(MobileNumber);
        contactPerson.SelectJobPosition(JobPosition);
        contactPerson.SelectPrimaryContacts(IsprimaryContact);
        contactPerson.ClickOnContinueButton();

    }

@Given("User to should be able to capture mandate holder details {string},{string},{string},{string},{string},{string},{string}")
public void user_to_should_be_able_to_capture_mandate_holder_details(String MandateHolderTitle, String MandateIdentityType, String MandateIdNumberPassport, String MandateFirstName, String MandateLastSurnameName, String MobileNumber, String MandateJobTitle) throws InterruptedException {
    mandateholder.SameAscontactPersonCHK();
//        mandateholder.SelectMandateHolderTitle(MandateHolderTitle);
//        mandateholder.SelectIdentityType(MandateIdentityType);
//        mandateholder.IdAndPassportNumber(MandateIdNumberPassport);
//        mandateholder.EnterMandateHolderName(MandateFirstName);
//        mandateholder.EnterMandateSurname(MandateLastSurnameName);
//        mandateholder.EnterMandateMobileNo(MobileNumber);
//        mandateholder.Selectjobposition(MandateJobTitle);
        mandateholder.ClickOnContinueButton();
}
    @Given("User to capture payment details {string},{string},{string},{string},{string}{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void user_to_capture_payment_details(String JobPostion, String CompanyName, String RegistrationNumber, String PayerTitle, String IdentityType, String PassportNumber, String Fname, String Sname, String MobileNumber, String WorkNumber, String BankName, String BankAccountType, String AccountNumber, String PoitOfSaleVerified, String DebiDay, String string16) throws InterruptedException {
     payerDetails.ClickSameasregisteredbusiness();
     payerDetails.selectJobPosition(JobPostion);
     //payerDetails.enterCompanyName(CompanyName);
     //payerDetails.enterRegNumber(RegistrationNumber);
     payerDetails.selectTitle(PayerTitle);
     payerDetails.selectIDType(IdentityType);
     payerDetails.passportNumber(PassportNumber);
     payerDetails.enterFirstName(Fname);
     payerDetails.enterSurname(Sname);
     payerDetails.enterMobilenum(MobileNumber);
     payerDetails.EnterWorkNumber(WorkNumber);
     payerDetails.selectBankName(BankName);
     payerDetails.selectBankType(BankAccountType);
     payerDetails.enterAccNumber(AccountNumber);
     payerDetails.selectPointOfSaleVerified(PoitOfSaleVerified);
     payerDetails.selectDebitDay(DebiDay);
     payerDetails.clickContinue();
    }
    @Then("User to complete a sale")
    public void user_to_complete_a_sale() throws InterruptedException {
     completeSale.ViewCompanyName();
     completeSale.Totalpremium();
     completeSale.ViewSumAssured();
     completeSale.ViewAnnualTurnOver();
     completeSale.ViewSumAssured();
     completeSale.ViewNumberofEmplyees();
    }





    }




