package stepDefinition;

import PageObjects.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class Churches {
    @Steps
    LoginPage loginPage;
    @Steps
    HomePage homePage;
    @Steps
    UnderWriting underWriting;

    @Steps
    ContactPerson contactPerson;
    @Steps
    MandateHolder mandateholder;
    @Given("User open Broker Online web browser,enter access code and login {string},{string},{string}")
    public void user_open_broker_online_web_browser_enter_access_code_and_login(String Accesscode1, String BrokerCode, String BrokerPassword) throws InterruptedException {
        loginPage.OpenWebsite();
        loginPage.enterAccessCode(Accesscode1);
        loginPage.enterBrokerCodeAndPassword(BrokerCode, BrokerPassword);
        Thread.sleep(3000);
        loginPage.clickOnLoginButton();
    }

    @Given("Click on new sale, select product, clicks continue and capture business details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void click_on_new_sale_select_product_clicks_continue_and_capture_business_details(String BusinessName, String BusinessType, String IDPassportNumber, String RegistrationNumber, String NumberOfEmployees, String MobileNumber, String WorkNumber, String AnnualTurnOver, String Address1, String Address2, String PhysicalCode) throws InterruptedException {

        homePage.ClickNewSaleButton();
        homePage.SelectProductFromDropList("Clientèle Legal Business Plan");
        homePage.ClickOnContinueButton();

        homePage.SelectBusinessType(BusinessType);
        homePage.EnterCompanyName(BusinessName);
        homePage.IDpassportNumber(IDPassportNumber);
        homePage.NUMBEROFEMPLOYEES(NumberOfEmployees);
        homePage.MOBILENUMBER(MobileNumber);
        homePage.WORKNUMBER(WorkNumber);
        homePage.AnnualTurnOver(AnnualTurnOver);
        homePage.PhysicalAddressLine1(Address1);
        homePage.PhysicalAddressLine2(Address2);
        homePage.PhysicalAddressCode(PhysicalCode);
        homePage.PhysicalAddresssameaspostaladdress();
        homePage.ContinueButton();

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
    @Given("User to capture mandate holder {string},{string},{string},{string},{string},{string},{string}")
    public void user_to_capture_mandate_holder(String MandateHolderTitle, String MandateIdentityType, String MandateIdNumberPassport, String MandateFirstName, String MandateLastSurnameName,String MobileNumber, String MandateJobTitle, String string7) throws InterruptedException {
        mandateholder.SelectMandateHolderTitle(MandateHolderTitle);
        mandateholder.SelectIdentityType(MandateIdentityType);
        mandateholder.IdAndPassportNumber(MandateIdNumberPassport);
        mandateholder.EnterMandateHolderName(MandateFirstName);
        mandateholder.EnterMandateSurname(MandateLastSurnameName);
        mandateholder.EnterMandateMobileNo(MobileNumber);
        mandateholder.Selectjobposition(MandateJobTitle);



        mandateholder.ClickOnContinueButton();

    }
    @Given("User to capture payment details {string},{string},{string},{string},{string}{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},")
    public void user_to_capture_payment_details(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("User to complete a sale")
    public void user_to_complete_a_sale() {

    }

}
