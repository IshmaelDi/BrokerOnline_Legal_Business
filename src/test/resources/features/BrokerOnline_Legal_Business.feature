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

    Examples:
      |AccessCode|code|Password|ClienteleLegalBusinessPlan|BusinessType|CompanyName|RegistrationNumber|NumberOfEmployees|MobileNumber|WorkNumber|AnnualTurnover|PhysicalAddressLine1|PhysicalAddressLine2|PostalAddressCode|PostalAddressLine1|PostalAddressLine2|PostalAddressCode|LegalMatters|LegalEntity|Invoices|Industry   |IndustrySpecifics|Title|IdentityType|IdentityNumber|FirstName|Surname|MobileNumber|JobPosition|JobPosition|CompanyName|RegistrationNumber|Title|IdentityType|IdentityNumber|FirstName|Surname|MobileNumber|WorkNumber|BankName|BankAccountType|BankAccountNumber|POSVerified|DebitDate|
      |0132|b1234|12345|Clientèle Legal Business Plan|Close Corporation (CC)|Khabela|2013/417420/23|50|0728412953|0127971922|2,000,001 – 10,000,000|Block M|Block A|0152|Block W|Block H|0162|2|Yes|No|Estate Agent|IndustrySpecifics|Mr|ID Number|8705076328083|Ishmael|Direro|0728712953|CEO                                                                                                                              |Secritary  |IT Turns   |2013/010108/23    |Mrs  |ID Number   |9408236664278 |Robby    |Makala |07614066576 |0127972593|ABSA BANK|Cheque Account|1234             |Yes        |25       |

#
##  @Test3
#  23/101244/23
##  Scenario Outline: User is on Underwriting tab
#      Given User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
#
#      Examples:
#        |LegalMatters|LegalEntity|Invoices|Industry   |IndustrySpecifics|
#        |2           |Yes        |No      |EstateAgent|IndustrySpecifics|
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



