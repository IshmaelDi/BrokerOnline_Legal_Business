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



}
