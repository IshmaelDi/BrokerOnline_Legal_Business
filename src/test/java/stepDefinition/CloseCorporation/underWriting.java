package stepDefinition.CloseCorporation;

import PageObjects.CloseCorporationCC.LoginPage;
import PageObjects.CloseCorporationCC.HomePage;
import PageObjects.CloseCorporationCC.UnderWriting;
import io.cucumber.java.en.Given;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;

public class underWriting extends PageObjects {
    LoginPage loginPage;
    HomePage homePage;
    UnderWriting underWriting;

    public underWriting(WebDriver driver) {
        super(driver);
    }

    @Given("User logs in with Broker Code, Confirms LogIn Credentials")
    public void user_logs_in_with_broker_code_confirms_log_in_credentials() throws InterruptedException {
        homePage.open();
        loginPage.enterAccessCode();
    }
    @Given("User Complete all the required steps and Captues all Business Detail information {String} and Navigate to UnderWriting Page.")
    public void user_complete_all_the_required_steps_and_captues_all_business_detail_information_and_navigate_to_under_writing_page(String ClientèleLegalBusinessPlan) throws InterruptedException {
        loginPage.enterBrokerCodeAndPassword();
        loginPage.clickOnLoginButton();
        homePage.ClickNewSaleButton();
        homePage.SelectProductFromDropList(ClientèleLegalBusinessPlan);

    }
    @Given("User Select the relevant number {String}cin the underwriting dropdown questions.")
    public void user_select_the_relevant_number_in_the_underwriting_dropdown_questions(String one) {
        underWriting.SelectProductFromDropList(one);

    }
    @Given("User Select yes or no {Sting} whether the company is a registered legal entity.")
    public void user_select_yes_or_no_whether_the_company_is_a_registered_legal_entity(String Yes) {
        underWriting.SelectLegalEntityFromDropList(Yes);
    }
    @Given("User Select yes or no {String} whether the company has overdue account")
    public void user_select_yes_or_no_whether_the_company_has_overdue_account(String No) {
        underWriting.SelectOverdueAccountsFromDropList(No);

    }
    @Given("User Select the type of industry {String} the business is in.")
    public void user_select_the_type_of_industry_the_business_is_in(String EstateAgent ) {
        underWriting.SelectBusinessIn(EstateAgent);
    }
    @Given("User Insert {String} the Industry specifics")
    public void user_insert_the_industry_specifics(String HiAutomation ) {
        underWriting.EnterTextInIndustrySpecific(HiAutomation);
    }
//    @Then("User click Continue Button to navigate to test")
    public void user_click_continue_button_to_navigate_to_test() {

    }

}
