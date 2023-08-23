package stepDefinition;


import PageObjects.*;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class BrokerOnline_CloseCorporationCC extends PageObject {
    @Steps
    LoginPage loginPage;
    @Steps
    BusinessDetails businessDetails;
    @Steps
    UnderWriting underWriting;
    @Steps
    ContactPerson contactPerson;
    @Steps
    MandateHolder mandateHolder;

    @Given("User log on to Legal Business Plan and Capture AccessCode {string} and Capture {string}, {string} Login Details")
    public void user_log_on_to_legal_business_plan_and_capture_access_code_and_capture_login_details(String AccessCode, String BrokerCode, String Password) throws InterruptedException {
        loginPage.open();
        Thread.sleep(3000);
        loginPage.enterAccessCode(AccessCode);
        Thread.sleep(3000);
        loginPage.enterBrokerCodeAndPassword(BrokerCode, Password);
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
    }
    @Given("User click on New Sale Button and Select the Product {string} and click Continue Button")
    public void user_click_on_new_sale_button_and_select_the_product_and_click_continue_button(String Product) throws InterruptedException {
        Thread.sleep(3000);
        businessDetails.ClickNewSaleButton();
        businessDetails.SelectProduct(Product);
        businessDetails.ClickOnContinueButton();
        Thread.sleep(3000);
    }
    @Given("User is on Business Details Page, select Company Type and Capture Business Details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and click Continue Button")
    public void user_is_on_business_details_page_select_company_type_and_capture_business_details_and_click_continue_button(String BusinessType, String companyName, String RegistrationNumber, String NUMBEROFEMPLOYEES, String MOBILENUMBER, String WORKNUMBER, String AnnualTurnOver, String PhysicalAddressLine1, String PhysicalAddressLine2, String PhysicalAddressCode, String PostalAddressLine1, String PostalAddressLine2, String PostalAddressCode) throws InterruptedException {
        Thread.sleep(3000);
        businessDetails.SelectBusinessType(BusinessType);
        businessDetails.EnterCompanyName(companyName);
        businessDetails.RegistrationNumber(RegistrationNumber);
        businessDetails.NUMBEROFEMPLOYEES(NUMBEROFEMPLOYEES);
        businessDetails.MOBILENUMBER(MOBILENUMBER);
        businessDetails.WORKNUMBER(WORKNUMBER);
        businessDetails.AnnualTurnOver(AnnualTurnOver);
        businessDetails.PhysicalAddressLine1(PhysicalAddressLine1);
        businessDetails.PhysicalAddressLine2(PhysicalAddressLine2);
        businessDetails.PhysicalAddressCode(PhysicalAddressCode);
        businessDetails.PostalAddressLine1(PostalAddressLine1);
        businessDetails.PostalAddressLine2(PostalAddressLine2);
        businessDetails.PostalAddressCode(PostalAddressCode);
        businessDetails.BusinessDetailsContinueButton();
    }
    @Given("User Select legal Matters {string}, {string}, {string}, {string}, {string} and click Continue Button.")
    public void user_select_legal_matters_and_click_continue_button(String LegalMatters, String LegalEntity, String Invoices, String Industry, String IndustrySpecifics) {
        underWriting.SelectLegalMatters(LegalMatters);
        underWriting.SelectLegalEntity(LegalEntity);
        underWriting.SelectInvoices(Invoices);
        underWriting.SelectIndustry(Industry);
        underWriting.IndustrySpecifics(IndustrySpecifics);
        underWriting.UnderWritingContinueButton();
    }
    @Given("User Select Title and completes required Contact Person information {string}, {string}, {string}, {string}, {string}, {string}, {string} and Click Continue Button.")
    public void user_select_title_and_completes_required_contact_person_information_and_click_continue_button(String Title, String IdentityType, String IdentityNumber, String FirstName, String Surname, String MobileNumber, String JobPosition) {
        contactPerson.SelectTitle(Title);
        contactPerson.SelectIdentityType(IdentityType);
        contactPerson.EnterIdentityType(IdentityNumber);
        contactPerson.EnterName(FirstName);
        contactPerson.EnterSurname(Surname);
        contactPerson.EnterMobileNumber(MobileNumber);
        contactPerson.SelectJobPosition(JobPosition);
        contactPerson.ClickOnContinueButton();
    }
    @Given("User completes required Mandate Holder information {string}, {string}, {string}, {string}, {string}, {string}, {string} and Click Continue Button.")
    public void user_completes_required_mandate_holder_information_and_click_continue_button(String Title, String IdentityType, String IdentityNumber, String FirstName, String Surname, String MobileNumber, String JobPosition) {
        mandateHolder.SelectTitle(Title);
        mandateHolder.selectIdentityType(IdentityType);
        mandateHolder.EnterIdentityType(IdentityNumber);
        mandateHolder.EnterName(FirstName);
        mandateHolder.EnterSurname(Surname);
        mandateHolder.EnterMobileNumber(MobileNumber);
        mandateHolder.SelectJobPosition(JobPosition);
        String ContinueButton = new String();
        mandateHolder.ClickContinueButton(ContinueButton);
    }

    @Given("User completes required Payer Details information {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and Click Continue Button.")
    public void user_completes_required_payer_details_information_and_click_continue_button(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}






