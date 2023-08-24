

package PageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BusinessDetails extends PageObject {

    // Online Capture - New Sale

    // New Sale Elements

    String NewSaleXpath = "//*[@id=\"b3-NewSaleButton\"]";
    String SelectProductXpath = "//*[@id=\"b3-BrokerProducts\"]";
    String ClickOnContinueButtonXpath = "//button[@class=\"btn  btn-primary OSFillParent\"]";
    //

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
    String FinishLaterCHECKBOXXpath = "//*[@id=\"b42-AddressCopy\"]";
    String ContinueButtonXpath = "//*[@id=\"b42-BusinessDetailsForm\"]/div[12]/div/button";
    private String enter;


    // Online Capture - New Sale

    // Methods Implementations
    // Login Page
    @Step("Click New Sale Button")
    public void ClickNewSaleButton(){
        $(By.xpath(NewSaleXpath)).click();
    }
    @Step("select Product {String} from drop list")
    public void SelectProduct(String SelectProductFromDropList) {
        WebElement C = $(By.xpath(SelectProductXpath));
        selectFromDropdown(C, SelectProductFromDropList);
    }
    @Step("Click on Continue Button")
    public void ClickOnContinueButton() {
        $(By.xpath(ClickOnContinueButtonXpath)).click();
    }



    @Step("Enter Company Name {String}")
    public void EnterCompanyName(String companyName){
        $(By.xpath(CompanyNameXpath)).sendKeys(companyName);

    }


    //Business Details Methods
    @Step("select Business Type")
    public void SelectBusinessType(String SelectBusinessType) {
        WebElement Cl = $(By.xpath(BusinessTypeXpath));
        selectFromDropdown(Cl, SelectBusinessType);
    }
    @Step("Capture Registration Number") // 2013/010108/23
    public void RegistrationNumber(String RegistrationNumber){

       $(By.xpath(RegistrationNumberXpath)).sendKeys(RegistrationNumber);
    }
    @Step("Capture Numnber of Employees")
    public void NUMBEROFEMPLOYEES(String NUMBEROFEMPLOYEES){
        $(By.xpath(NumberOfEmployeesXpath)).sendKeys(NUMBEROFEMPLOYEES);
    }
    @Step("capture WORK NUMBER")
    public void WORKNUMBER(String WORKNUMBER) {
        $(By.xpath(WORKNumberXpath)).sendKeys(WORKNUMBER);
    }
    @Step("capture MOBILE NUMBER")
    public void MOBILENUMBER(String MOBILENUMBER){
        $(By.xpath(MobileNumberXpath)).sendKeys(MOBILENUMBER);
    }
    @Step("Select Annual Turn Over")
    public void AnnualTurnOver(String AnnualTurnOver){
        WebElement ATO = $(By.xpath(AnnualTurnOverXpath));

        selectFromDropdown(ATO, AnnualTurnOver);
    }
    @Step("Capture Physical Address Line 1")
    public void PhysicalAddressLine1(String PhysicalAddressLine1) {
        $(By.xpath(PhysicalAddressLine1Xpath)).sendKeys(PhysicalAddressLine1);
    }
    @Step("Capture Physical Address Line 1")
    public void PhysicalAddressLine2(String physicalAddressLine2) {
        $(By.xpath(PhysicalAddressLine2Xpath)).sendKeys(physicalAddressLine2);
    }
    @Step("Capture Physical Address Code")
    public void PhysicalAddressCode(String physicalAddressCode) {
        $(By.xpath(PhysicalAddressCodeXpath)).sendKeys(physicalAddressCode);
    }
    @Step("Capture Postal Address Code")
    public void PostalAddressCode(String postalAddressCode){
        $(By.xpath(PostalAddressCodeXpath)).sendKeys(postalAddressCode);
    }
    @Step("Capture Postal Address Line1")
    public void PostalAddressLine1(String postalAddressLine1){
        $(By.xpath(PostalAddressAddressLine1Xpath)).sendKeys(postalAddressLine1);
    }
    @Step("Capture Postal Address Line2")
    public void PostalAddressLine2(String postalAddressLine2) {
        $(By.xpath(PostalAddressAddressLine2Xpath)).sendKeys(postalAddressLine2);
    }
    @Step("Click on check Box")
    public void FinishLaterCHECKBOX(){
        $(By.xpath(FinishLaterCHECKBOXXpath)).click();
    }
    @Step("Click on Continue Button")
    public void BusinessDetailsContinueButton() {
        $(By.xpath(ContinueButtonXpath)).click();
    }


    public void selectFromDropdown() {
    }

    public void CompanyName(String companyName) {
    }
}
