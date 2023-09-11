Feature: Broker Online - Legal Business Plan Capturing Process.

  # Enterprise Types

  # Close Corporation (CC) - 2023/172094/23
#  TurnOver - Less than R2 Million
  @Test1
  Scenario Outline: Close Corporation (CC) Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType           | CompanyName                  | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover      | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured |AnnualTurnOver|
#      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Close Corporation (CC) | DeanPlaza Close Corporations100 | 2023/182532/23     | 5               | 0722682110   | 0117413020 | Less than 2,000,000 | B28            | B20                | 1002              | B1             | Blok 2             | 2700              | 0            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Mr    | ID Number    | 9609105299209  | PoppyHu     | Khumba | 0726935410   | Member      | Roxy Interiors   | 2023/112589/23    | Hon   | ID Number    | 7209108221854  | Zuki       | Nkabinde    | 0726935219   | 0127974000 | FIRSTRAND BANK | Savings Account | 1234              | No          | 25        | R 5 590.00   | R 210 000      |Less than 2,000,000



    # Limited Corporation (Ltd) - 2023/172094/06
#  TurnOver - Between R2 Million and R20 Million
  @Test1
  Scenario Outline: Limited Corporation (Ltd) Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType           | CompanyName                  | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover      | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured |AnnualTurnOver|
#      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Limited Corporation (Ltd) | Boomy100 | 2023/172094/06     | 9               | 0822689910   | 0127413021 | 10,000,001 – 20,000,000 | Block  28            | Blo20                | 1520              | Bloq 1             | Bloj 2             | 6328              | 0            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Mr    | ID Number    | 7609058247819  | Poppy     | Motaung | 0826935417   | Member      | Kool Runs   | 2023/172094/06     | Hon   | ID Number    | 7409108372810  | Dean       | Moose    | 0726935417   | 0117974520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 500.00   | R 210 000      |10,000,001 – 20,000,000|




# Proprietary Limited (Pty Ltd) - 2023/127420/07
# TurnOver - Over R20 Million
  @Test1
  Scenario Outline: Close Corporation (CC) Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType           | CompanyName                  | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover      | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured |AnnualTurnOver|
#      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Proprietary Limited (Pty Ltd) | Keeps Tyres | 2023/127420/07     | 10               | 0822689910   | 0127413021 | Less than 2,000,000 | Block  28            | Blo20                | 1520              | Bloq 1             | Bloj 2             | 6328              | 0            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Mr    | ID Number    | 7609058247819  | Poppy     | Motaung | 0826935417   | Member      | Kool Runs   | 2023/127420/07    | Hon   | ID Number    | 7609058247819  | Donny       | Lopers    | 0826935417   | 0127974520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 500.00   | R 210 000      |More than 30,000,001|















#
#  @Test2
#  Scenario Outline: Proprietary Limited (Pty Ltd) Legal Business Plan
#    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
#    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
#    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
#    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
#    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
#    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
#    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
#    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.
#
#    Examples:
#      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType                  | CompanyName     | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover          | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured | NumberOfEmployees | AnnualTurnOver          |
#      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Proprietary Limited (Pty Ltd) | DallasShoes2023 | 2013/192039/07     | 14                | 0722680998   | 0127473011 | 10,000,001 – 20,000,000 | Block 1              | Blo2                 | 2007              | Bloq W             | Bloj H             | 0174              | 0            | No          | No       | Gambling Industry | TesHome Loans ting | Hon   | ID Number    | 9409045749235  | Thabiso   | zibana  | 0826935917   | Member      | Kool Runs   | 2013/192039/07     | Hon   | ID Number    | 8809049482546  | Roben     | Mlaza   | 0826935417   | 0117972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 1 469.00   | R 290 000.00   | 24                | 10,000,001 – 20,000,000 |
#
#
#
#
#
#  @Test3
#  Scenario Outline: Limited Corporation (Ltd) Legal Business Plan
#    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
#    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
#    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
#    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
#    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
#    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
#    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
#    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.
#
#    Examples:
#      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType              | CompanyName | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover          | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured | NumberOfEmployees | AnnualTurnOver          |
##      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Limited Corporation (Ltd) | GooseUp     | 2023/194219/06     | 9                 | 0728610934   | 0127413011 | 10,000,001 – 20,000,000 | Block a              | Blo                  | 2074              | Bloq o             | Bloj x             | 0174              | 0            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Hon   | ID Number    | 8209046740733  | Thabo     | Sibani  | 0826935417   | Member      | Kool Runs   | 2023/194219/06     | Hon   | ID Number    | 8209046740733  | Robezene  | Mlalaza | 0826935417   | 0127972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 1 469.00   | R 290 000.00   | 24                | 10,000,001 – 20,000,000 |
#      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Limited Corporation (Ltd) | GooseUp     | 2023/127439/06     | 19                | 0728610934   | 0127413011 | 10,000,001 – 20,000,000 | Block a              | Blo                  | 2074              | Bloq o             | Bloj x             | 0174              | 0            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Hon   | ID Number    | 8209046740733  | Thabo     | Sibani  | 0826935417   | Member      | Kool Runs   | 2023/194219/06     | Hon   | ID Number    | 8209046740733  | Robezene  | Mlalaza | 0826935417   | 0127972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 810.00     | R 250 000.00   | 24                | 10,000,001 – 20,000,000 |



  # NGO Business Types

  # Churches - Passport Number - 7808307945831

  @Test4
  Scenario Outline: Churches Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<PassportNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType | CompanyName | IdentityNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover         | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType    | PassportNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType    | PassportNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured | NumberOfEmployees | AnnualTurnOver          |
      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Churches     | TK Ministry | 7808306135392  | 4                 | 0722680974   | 0117473011 | 2,000,001 – 10,000,000 | Block a              | Blo                  | 2074              | Bloq o             | Bloj x             | 0174              | 3            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Hon   | Passport Number | 7808286789663  | Thabo     | Sibani  | 0826935417   | Member      | Kool Runs   | 2023/108991/06     | Hon   | Passport Number | 9508246891272  | Roben     | Mlaza   | 0826935417   | 0117972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 1 469.00   | R 290 000.00   | 24                | 10,000,001 – 20,000,000 |





  # NON - Profit Organization - Passport Number - 9008297708004

  @Test5
  Scenario Outline: NON - Profit Organization Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType              | CompanyName | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover         | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured | NumberOfEmployees | AnnualTurnOver          |
      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Limited Corporation (Ltd) | Kwap LTD    | 2023/108991/06     | 4                 | 0722680974   | 0117473011 | 2,000,001 – 10,000,000 | Block a              | Blo                  | 2074              | Bloq o             | Bloj x             | 0174              | 3            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Hon   | ID Number    | 7808286789663  | Thabo     | Sibani  | 0826935417   | Member      | Kool Runs   | 2023/108991/06     | Hon   | ID Number    | 9508246891272  | Roben     | Mlaza   | 0826935417   | 0117972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 1 469.00   | R 290 000.00   | 24                | 10,000,001 – 20,000,000 |


  # Partnership - Passport Number - 8408299351541

  @Test6
  Scenario Outline: Limited Corporation (Ltd) Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType              | CompanyName | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover         | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured | NumberOfEmployees | AnnualTurnOver          |
      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Limited Corporation (Ltd) | Kwap LTD    | 2023/108991/06     | 4                 | 0722680974   | 0117473011 | 2,000,001 – 10,000,000 | Block a              | Blo                  | 2074              | Bloq o             | Bloj x             | 0174              | 3            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Hon   | ID Number    | 7808286789663  | Thabo     | Sibani  | 0826935417   | Member      | Kool Runs   | 2023/108991/06     | Hon   | ID Number    | 9508246891272  | Roben     | Mlaza   | 0826935417   | 0117972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 1 469.00   | R 290 000.00   | 24                | 10,000,001 – 20,000,000 |

  # Sole Proprietorship - Passport Number - 8408296730184

  @Test7
  Scenario Outline: Limited Corporation (Ltd) Legal Business Plan
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<BusinessType>', '<CompanyName>', '<RegistrationNumber>', '<NumberOfEmployees>', '<MobileNumber>', '<WorkNumber>', '<AnnualTurnover>', '<PhysicalAddressLine1>', '<PhysicalAddressLine2>', '<PostalAddressCode>', '<PostalAddressLine1>', '<PostalAddressLine2>', '<PostalAddressCode>' and click Continue Button
    And User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.
    And User Select Title and completes required Contact Person information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Mandate Holder information '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<JobPosition>' and Click Continue Button.
    And User completes required Payer Details information '<JobPosition>', '<CompanyName>', '<RegistrationNumber>', '<Title>', '<IdentityType>', '<IdentityNumber>', '<FirstName>', '<Surname>', '<MobileNumber>', '<WorkNumber>', '<BankName>', '<BankAccountType>', '<BankAccountNumber>', '<POSVerified>', '<DebitDate>', '<IsSouthAfricanCitizen>' and Click Continue Button.
    Then User should get generated Sale Confirmation with Total Premium '<TotalPremium>', '<ViewSumAssured>', '<NumberOfEmployees>', '<AnnualTurnOver>' and Click on T'c & C's, client signature and Click on Accept & Complete Sale Button.

    Examples:
      | AccessCode | code  | Password | ClienteleLegalBusinessPlan    | BusinessType              | CompanyName | RegistrationNumber | NumberOfEmployees | MobileNumber | WorkNumber | AnnualTurnover         | PhysicalAddressLine1 | PhysicalAddressLine2 | PostalAddressCode | PostalAddressLine1 | PostalAddressLine2 | PostalAddressCode | LegalMatters | LegalEntity | Invoices | Industry                          | IndustrySpecifics  | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | JobPosition | CompanyName | RegistrationNumber | Title | IdentityType | IdentityNumber | FirstName | Surname | MobileNumber | WorkNumber | BankName        | BankAccountType | BankAccountNumber | POSVerified | DebitDate | TotalPremium | ViewSumAssured | NumberOfEmployees | AnnualTurnOver          |
      | 0132       | b1234 | 12345    | Clientèle Legal Business Plan | Limited Corporation (Ltd) | Kwap LTD    | 2023/108991/06     | 4                 | 0722680974   | 0117473011 | 2,000,001 – 10,000,000 | Block a              | Blo                  | 2074              | Bloq o             | Bloj x             | 0174              | 3            | Yes         | No       | Administrative & Support Services | TesHome Loans ting | Hon   | ID Number    | 7808286789663  | Thabo     | Sibani  | 0826935417   | Member      | Kool Runs   | 2023/108991/06     | Hon   | ID Number    | 9508246891272  | Roben     | Mlaza   | 0826935417   | 0117972520 | NEDBANK LIMITED | Savings Account | 1234              | No          | 25        | R 1 469.00   | R 290 000.00   | 24                | 10,000,001 – 20,000,000 |

















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



