package stepDefinition;


import PageObjects.LoginPage;
import PageObjects.BusinessDetails;
import PageObjects.UnderWriting;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class BrokerOnline_UnderWriting {

    @Steps
    LoginPage loginPage;
    @Steps
    BusinessDetails businessDetails;
    @Steps
    UnderWriting underWriting;

    @Given("User Select legal Matters {string}, {string}, {string}, {string}, {string} and click Continue Button.")
    public void user_select_legal_matters_and_click_continue_button(String string, String string2, String string3, String string4, String string5) {

    }

}
