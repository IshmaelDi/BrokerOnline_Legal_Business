Feature: Broker Online - Legal Business Plan Capturing Process.
  @Test2
  Scenario Outline: Capture Legal Plan Business
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<Job Position>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.


    Examples:
      |AccessCode|code|Password|ClienteleLegalBusinessPlan|BusinessType|CompanyName|RegistrationNumber|NumberOfEmployees|MobileNumber|WorkNumber|AnnualTurnover|PhysicalAddressLine1|PhysicalAddressLine2|PostalAddressCode|PostalAddressLine1|PostalAddressLine2|PostalAddressCode|LegalMatters|LegalEntity|Invoices|Industry|IndustrySpecifics|Title|IdentityType|IdentityNumber|FirstName|Surname|MobileNumber|JobPosition|JobPosition|CompanyName|RegistrationNumber|Title|IdentityType|IdentityNumber|FirstName|Surname|MobileNumber|WorkNumber|BankName|BankAccountType|BankAccountNumber|POSVerified|DebitDate|TotalPremium|ViewSumAssured|NumberOfEmployees|AnnualTurnOver|
      |0132|b1234|12345|Clientèle Legal Business Plan|Limited Corporation (Ltd)|Mallas CC|2013/102047/06|99|0722680991|0127473011|Less than 2,000,000|Block 1|Blo2|2007|Bloq W|Bloj H|0174|0|No|Yes|Taxi Industry|TesHome Loans ting|Hon|ID Number|9508245982866|Thabo|Sibani|0728710012|Member|Member  |Kool Runs   |2013/102047/06   |Hon  |ID Number   |9508246891272                                                                                                                                  |Roben    |Mlaza|07614066541 |0117972520|NEDBANK LIMITED|Savings Account|1234        |NO          |25      |R 1 469.00  |R 290 000.00|24                 |Less than 2,000,000|

#
##  @Test3
#  23/101244/23
##  Scenario Outline: User is on Underwriting tab
#      Given User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
#
#      Examples:
#        |LegalMatters|LegalEntity|Invoices|Industry   |IndustrySpecifics|
#        |3           |NO        |Yes      |EstateAgent|IndustrySpecifics|
#
#  @Test4
#  Scenario Outline: User is on Contact Person Tab
#    Given User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
#
#    Examples:
#      |Title|IdentityType|IdentityNumber|FirstName|Surname|MobileNumber|JobPosition|
#      |Mr   |ID Number   |8705076328083 |Ishmael  |Direro |0728712953  |CEO        |

#  @Test5
#  Scenario Outline: User is on Mandate Holder Tab
#    Given User Select Title and completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
#
#    Examples:
#      |Title|IdentityType|IdentityNumber|FirstName|Surname|MobileNumber|JobPosition|
#      |Mr   |ID Number   |9408238091207 |Lebo  |Direro |0728712953  |CEO        |

#    @Test6
#    Scenario Outline: User completes required Payer Details information '<Job Position>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.



