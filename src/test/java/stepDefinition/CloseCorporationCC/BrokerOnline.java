package stepDefinition.CloseCorporationCC;


import PageObjects.CloseCorporationCC.LoginPage;
import PageObjects.CloseCorporationCC.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.WebDriver;

public class BrokerOnline extends PageObjects {
    LoginPage loginPage;
    HomePage homePage;

   public BrokerOnline(WebDriver driver) {
       super(driver);
    }

    @Given("User open Broker Online web browser, capture access code {string} and clicks confirm button.")
    public void user_open_broker_online_web_browser_capture_access_code_and_clicks_confirm_button(String string) throws InterruptedException {
        homePage.open();
        loginPage.enterAccessCode();

    }
    @When("User captures Broker Code {string} and Password {string}")
    public void user_captures_broker_code_and_password(String string, String string2) throws InterruptedException {
        loginPage.enterBrokerCodeAndPassword();;
    }
    @When("User should be able to click login button and navigate to Online Capture")
    public void user_should_be_able_to_click_login_button_and_navigate_to_online_capture() throws InterruptedException {
        loginPage.clickOnLoginButton();
    }
    @When("User click on New Sale Button")
    public void user_click_on_new_sale_button() {
        homePage.ClickNewSaleButton();
    }
    @When("User should be able to select Product from the drop list {string} and click on Continue Button to navigate to Business Details.")
    public void user_should_be_able_to_select_product_from_the_drop_list_and_click_on_continue_button_to_navigate_to_business_details(String string) throws InterruptedException {
        String ClientèleLegalBusinessPlan = new String();
        homePage.SelectProductFromDropList(ClientèleLegalBusinessPlan);
        Thread.sleep(3000);
        homePage.ClickOnContinueButton();
        Thread.sleep(3000);
        System.out.println("User should be Able to navigate to Business Details");
    }
    @When("User enters Company Name {string}")
    public void user_enters_company_name(String EnterCompanyName) {
        homePage.EnterCompanyName();
    }
    @When("User select Business type {string}")
    public void user_select_business_type(String CloseCorporationCC) {
        homePage.SelectBusinessType(CloseCorporationCC);
    }
    @When("User captures Registration Number {string}")
    public void user_captures_registration_number(String RegistrationNumber) {
        homePage.RegistrationNumber();
    }
    @When("User capture Number Of Employees {string}")
    public void user_capture_number_of_employees(String NUMBEROFEMPLOYEES) {
        homePage.NUMBEROFEMPLOYEES();
    }
    @When("User enter Mobile Number {string}")
    public void user_enter_mobile_number(String MOBILENUMBER) {
        homePage.MOBILENUMBER();
    }
    @When("User enter Work Number {string}")
    public void user_enter_work_number(String WORKNUMBER) {
        homePage.WORKNUMBER();
    }
    @When("User enter Annual Turnover {string}")
    public void user_enter_annual_turnover(String AnnualTurnOver) {
        homePage.AnnualTurnOver();
    }
    @When("User enter PAL1 {string}")
    public void user_enter_pal1(String PostalAddressLine1) {
        homePage.PostalAddressLine1();
    }
    @When("User enter PAL2 {string}")
    public void user_enter_pal2(String PostalAddressLine2) {
        homePage.PostalAddressLine2();
    }
    @When("User enter PostaAL1 {string}")
    public void user_enter_posta_al1(String PostalAddressLine1) {
        homePage.PostalAddressLine1();
    }
    @When("User enter PostalAL2 {string}")
    public void user_enter_postal_al2(String PostalAddressLine2) {
        homePage.PostalAddressLine2();
    }
    @When("User enter PostalAC {string}")
    public void user_enter_postal_ac(String PostalAddressCode) {
        homePage.PostalAddressCode();
    }


}
