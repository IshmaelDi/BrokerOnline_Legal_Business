package stepDefinition;


import PageObjects.LoginPage;
import PageObjects.BusinessDetails;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class BrokerOnline_BusinessDetails {
    @Steps
    LoginPage loginPage;
    @Steps
    BusinessDetails businessDetails;

    @Given("User log on to Legal Business Plan and Capture AccessCode {string} and Capture {string}, {string} Login Details")
    public void user_log_on_to_legal_business_plan_and_capture_access_code_and_capture_login_details(String AccessCode, String BrokerCode, String Password) throws InterruptedException {
        businessDetails.open();
        Thread.sleep(3000);
        loginPage.enterAccessCode(AccessCode);
        Thread.sleep(3000);
        loginPage.enterBrokerCodeAndPassword(BrokerCode, Password);
        loginPage.clickOnLoginButton();
        Thread.sleep(3000);
    }

    @Given("User click on New Sale Button and Select the Product {string} and click Continue Button")
    public void user_click_on_new_sale_button_and_select_the_product_and_click_continue_button(String ClienteleLegalBusinessPlan) throws InterruptedException {
        Thread.sleep(3000);
        businessDetails.ClickNewSaleButton();
        businessDetails.SelectProduct(ClienteleLegalBusinessPlan);
        Thread.sleep(3000);
    }

    @Given("User is on Business Details Page, select Company Type and Capture Business Details {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} and click Continue Button")
    public void user_is_on_business_details_page_select_company_type_and_capture_business_details_and_click_continue_button(String CloseCorporationCC, String companyName, String RegistrationNumber, String NUMBEROFEMPLOYEES, String MOBILENUMBER, String WORKNUMBER, String AnnualTurnOver, String PhysicalAddressLine1, String PhysicalAddressLine2, String PhysicalAddressCode, String PostalAddressLine1, String PostalAddressLine2, String PostalAddressCode) throws InterruptedException {
        Thread.sleep(3000);
        businessDetails.SelectBusinessType("Close Corporation (CC)");
        businessDetails.EnterCompanyName(companyName);

        businessDetails.RegistrationNumber();
        businessDetails.NUMBEROFEMPLOYEES();
        businessDetails.MOBILENUMBER();
        businessDetails.WORKNUMBER();
        businessDetails.AnnualTurnOver("2,000,001 – 10,000,000");
        businessDetails.PhysicalAddressLine1();
        businessDetails.PhysicalAddressLine2();
        businessDetails.PhysicalAddressCode();
        businessDetails.PostalAddressLine1();
        businessDetails.PostalAddressLine2();
        businessDetails.PostalAddressCode();

        businessDetails.ClickOnContinueButton();
    }


}






