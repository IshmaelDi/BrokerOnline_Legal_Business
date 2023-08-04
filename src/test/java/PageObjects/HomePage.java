package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    // Online Capture - New Sale

    // New Sale Elements

    String NewSaleXpath = "//*[@id=\"b3-NewSaleButton\"]";
    String SelectProductXpath = "//*[@id=\"b3-BrokerProducts\"]";
    String ClickOnContinueButtonXpath = "//*[@id=\"b3-CreateApplication2\"]/div[3]/div[2]/button";

    // Business Details Elements - Mandatory Text Fields.
    String CompanyNameXpath = "//*[@id=\"b42-Input_CompanyName\"]";
    String BusinessTypeXpath = "//*[@id=\"b42-Dropdown_EntityType\"]";
    String RegistrationNumberXpath = "//*[@id=\"b42-Input_RegistrationNumber\"]";
    String NumberOfEmployeesXpath = "//*[@id=\"b42-Input_NumberOfEmployees\"]";
    String WORKNumberXpath ="//*[@id=\"b42-Input_WorkTelephoneNumber\"]";
    String MobileNumberXpath = "//*[@id=\"b42-Input_MobileTelephoneNumber\"]";
    String AnnualTurnOverXpath = "//*[@id=\"b42-AnnualTurnover\"]";
    String PhysicalAddressLine1Xpath = "//*[@id=\"b42-Input_ResidentialAddressLine1\"]";
    String PhysicalAddressLine2Xpath = "//*[@id=\"b42-Input_ResidentialAddressLine2\"]";
    String PhysicalAddressCodeXpath = "//*[@id=\"b42-Input_ResidentialAddressCode\"]";
    String PostalAddressAddressLine1Xpath = "//*[@id=\"b42-Input_PostalAddressLine1\"]";
    String PostalAddressAddressLine2Xpath = "//*[@id=\"b42-Input_PostalAddressLine2\"]";
    String PostalAddressCodeXpath = "//*[@id=\"b42-Input_PostalAddressCode\"]";
    String CHECKBOXXpath = "//*[@id=\"b42-AddressCopy\"]";
    String ContinueButtonXpath = "//*[@id=\"b42-BusinessDetailsForm\"]/div[12]/div/button";

    // Methods Implementations
    @Step("Click New Sale Button")
    public void ClickNewSaleButton(){

        $(By.xpath(NewSaleXpath)).click();
    }
    @Step("select Product {String} from drop list")
    public void SelectProductFromDropList(String ClientèleLegalBusinessPlan) {
        WebElement C = $(By.xpath(SelectProductXpath));
        selectFromDropdown(C, ClientèleLegalBusinessPlan);
    }
    @Step("Click on Continue Button")
    public void ClickOnContinueButton() {

        $(By.xpath(ClickOnContinueButtonXpath)).click();
    }
    @Step("Enter Company Name ")
    public void EnterCompanyName() {

        $(By.xpath(CompanyNameXpath)).sendKeys("EnterCompanyName");
    }


    //Business Details Methods
    @Step("select Business Type")
    public void SelectBusinessType(String SelectBusinessType) {
        WebElement Cl = $(By.xpath(BusinessTypeXpath));
        selectFromDropdown(Cl, SelectBusinessType);
    }
    @Step("Capture Registration Number") // 2013/010108/23
    public void RegistrationNumber(){

     //   $(By.xpath(RegistrstionNumberXpath)).sendKeys("2013/010108/23");
    }
    @Step("Capture Numnber of Employees")
    public void NUMBEROFEMPLOYEES(){
        $(By.xpath(NumberOfEmployeesXpath)).sendKeys("NUMBEROFEMPLOYEES");
    }
    @Step("capture WORK NUMBER")
    public void WORKNUMBER() {
        $(By.xpath(WORKNumberXpath)).sendKeys("WORKNUMBER");
    }
    @Step("capture MOBILE NUMBER")
    public void MOBILENUMBER(){
        $(By.xpath(MobileNumberXpath)).sendKeys("MOBILENUMBER");
    }
    @Step("Select Annual Turn Over")
    public void AnnualTurnOver(String AnnualTurnOver){
        WebElement ATO = $(By.xpath(AnnualTurnOverXpath));
        selectFromDropdown(ATO, AnnualTurnOver);
    }
    @Step("Capture Physical Address Line 1")
    public void PhysicalAddressLine1() {
        $(By.xpath(PhysicalAddressLine1Xpath)).sendKeys("982 Block M");
    }
    @Step("Capture Physical Address Line 1")
    public void PhysicalAddressLine2() {
        $(By.xpath(PhysicalAddressLine2Xpath)).sendKeys("982 Block M");
    }
    @Step("Capture Physical Address Code")
    public void PhysicalAddressCode() {
        $(By.xpath(PhysicalAddressCodeXpath)).sendKeys("0152");
    }
    @Step("Capture Postal Address Code")
    public void PostalAddressCode(){
        $(By.xpath(PostalAddressCodeXpath)).sendKeys("0152");
    }
    @Step("Capture Postal Address Line1")
    public void PostalAddressLine1(){
        $(By.xpath(PostalAddressAddressLine1Xpath)).sendKeys("0152");
    }
    @Step("Capture Postal Address Line2")
    public void PostalAddressLine2() {
        $(By.xpath(PostalAddressAddressLine2Xpath)).sendKeys("0152");
    }
    @Step("Click on check Box")
    public void CHECKBOX(){
        $(By.xpath(CHECKBOXXpath)).click();
    }
    @Step("Click on Continue Button")
    public void ContinueButton() {
        $(By.xpath(ContinueButtonXpath)).click();
    }



}
