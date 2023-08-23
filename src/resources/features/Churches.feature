#Feature: Broker Online - Legal Business Plan Capturing Process.
#  Scenario Outline: User to capture legal busieness for church company
#    Given Access Broker Online, and login '<AccessCode>','<BrokerCode>','<BrokerPassword>'
#    And   User to click on new sale,select church company and capture business details '<CompanyName>','<BusiessType>','<IDPassport>','<EmployeeNumber>','<BMobileNumber>','<WorkNumber>','<AnnualTurOver>',<PhyicalAddress1>,'<PhyicalAddress2>','<PhisicalCode>'
#    And   User to capture underwitting details '<LegalMaters>','<IsBusinessRegistered>','<OverdueAccounandInvoice>','<WhatIndustryisIn>','<SpecifyIndustry>'.
#    And   User to capture contact details '<CTitle>','<cIdetityType>','<cIDPassportNumber>','<cDOB>','<cFname>','<cLname>','<cMobileNumber>','<cJobPosition>','<cIsprimaryContact>'.
#    And   User to capture Manadate Holder Details '<MhTitle>','<MhIdentityType>','<MhIDpassportNumber>','<MhDOB>','<MhFname>','<MhLname>','<MhMobileNumber>','<MhJobPosition>'.
#    And   User to capture Payer Details '<PJobPosition>','<PTitle>','<PIdentityType>','<PIDpassportNumber>','<PMhDOB>','<PFname>','<PLname>','<PMobileNumber>','<PworkNumber>','<PBankName>','<PBankAccoutType>','<PBakAccountNumber>','<PPointOfSaleVerified>','<PDebitDay>'.
#    Then  User to complete sale and corfirm details are correct
#    Examples:
#      |AccessCode|BrokerCode|BrokerPassword|CompanyName|BusiessType|IDPassport|EmployeeNumber|BMobileNumber|WorkNumber|AnnualTurOver|PhyicalAddress1|PhyicalAddress2|PhisicalCode|LegalMaters|IsBusinessRegistered|OverdueAccounandInvoice|SpecifyIndustry|CTitle|cIdetityType|cIDPassportNumber|cDOB|cFname|cLname|cMobileNumber|cJobPosition|cIsprimaryContact|MhTitle|MhIdentityType|MhIDpassportNumber|MhDOB|MhFname|MhLname|MhMobileNumber|MhJobPosition|PJobPosition|PTitle|PIdentityType|PLname|PLname|PMobileNumber|PworkNumber|PBankName|PBankAccoutType|PBakAccountNumber|PBakAccountNumber|
#      |0132 | b1234| 12345| Boom Church|  Churches |6708207580400| 23 | 0825475874|0115478587|2,000,001 – 10,000,000|  Private Bag x|  Address| 6567|1|Yes|No|Administrative & Support Services|Logistics|Mr|ID Number|8608218443283|1990-01-10|Mlwana|zola|0782545874|CEO|Yes|Mr|ID Number|8608218443283|1981-01-10|Lwala|Zulu|0832569854|CEO|CEO|Mrs|ID Number|8608216107880|Zola|Seven|083659854|0125478958|FIRSTRAND BANK|Cheque Account|1234|Yes|25|wwww|


Feature: Broker Online - Legal Business For Churches company

  Scenario Outline: Access Broker Online to capture legal business for churches company
    Given User open Broker Online web browser,enter access code and login '<Accesscode>','<BrokerCode>','<BrokerPassword>'
    And Click on new sale, select product, clicks continue and capture business details '<BusinessName>','<BusinessType>','<IDPassportNumber>','<RegistrationNumber>','<NumberOfEmployees>','<BusinessDetailsMobileNumber>','<WorkNumber>','<AnnualTurnOver>','<Address1>','<Address2>','<PhysicalCode>'
    And User to  Capture Underwriting details '<LegalMatters>','<IsBusinessRegistered>','<OverdueaccoutOrinvoice>','<whatIndustry>','<SpecifyIndustry>'
    And User to capture Contact details '<ContactpersonTitle>','<IdentityType>','<IdNumberPassport>','<ContactPersonDOB>','<FirstName>','<LastName>','<MobileNumber>','<JobPosition>','<IsprimaryContact>'
    And User to capture mandate holder '<MandateHolderTitle>','<MandateIdentityType>','<MandateIdNumberPassport>','<MandateFirstName>','<MandateLastSurnameName>','<MandateMobileNumber>','<MandateJobTitle>','<MandatePrimaryContact>'
    And User to capture payment details '<PayerJobTitle>','<PCompanyName>','<PRegNumber>','<PTittle>','<PIdentityType>''<PPasportIdNumber>','<PDob>','<PFirstNsame>','<PLastName>','<PMobileNumber>','<PWorkNumber>','<PBankName>','<PBankAccountType>','<PBankAccountNumber>','<PPointofSale>','<PDebitDay>',
    Then User to complete a sale
    Examples:
      |Accesscode|BrokerCode|BrokerPassword|BusinessName|BusinessType|IDPassportNumber|RegistrationNumber|NumberOfEmployees|BusinessDetailsMobileNumber|WorkNumber|AnnualTurnOver         |Address1|Address2 |PhysicalCode| LegalMatters|IsBusinessRegistered | OverdueaccoutOrinvoice|whatIndustry| SpecifyIndustry |ContactpersonTitle|IdentityType|IdNumberPassport|ContactPersonDOB|FirstName|LastName|MobileNumber|JobPosition|IsprimaryContact|MandateHolderTitle|MandateIdentityType|MandateIdNumberPassport|MandateFirstName|MandateLastSurnameName|MandateMobileNumber|MandateJobTitle|MandatePrimaryContact|PCompanyName|PRegNumber|PTittle|PIdentityType|PPasportIdNumber|PDob|PFirstNsame|PLastName|PMobileNumber|PWorkNumber|PBankName|PBankAccountType|PBankAccountNumber|PPointofSale|PDebitDay|
      |0132      |b1234     |12345         |Dale   | Churches   | 6908179088396  | 0119798765       |     24          |0826500254  | 01154785478| Less than 2,000,000 |  po box 29| stotre Store|   5421| 0         |No                   |         No            |Administrative & Support Services| Logistics |Mr|Passport Number|     8908167256862                 |1998-08-18|Mla      |Last    |0832569854|Member       |Yes             |Miss|ID NumberID Number|6908176519682|Lwana|Zone| 0825647221|CEO|CEO|Churches | BG0083 |MR|ID Number |8908166495313|1990-01-18|Lwazi|Zulu|0826598745|0114758748|ABSA BANK|Cheque Account|1234|Yes|25|
