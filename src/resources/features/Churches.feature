

Feature: Broker Online - Legal Business For Churches company

  Scenario Outline: Access Broker Online to capture legal business for churches company
    Given User open Broker Online web browser,enter access code and login '<Accesscode>','<BrokerCode>','<BrokerPassword>'
    And Click on new sale, select product, clicks continue and capture business details '<BusinessName>','<BusinessType>','<IDPassportNumber>','<RegistrationNumber>','<NumberOfEmployees>','<BusinessDetailsMobileNumber>','<WorkNumber>','<AnnualTurnOver>','<Address1>','<Address2>','<PhysicalCode>'
    And User to  Capture Underwriting details '<LegalMatters>','<IsBusinessRegistered>','<OverdueaccoutOrinvoice>','<whatIndustry>','<SpecifyIndustry>'
    And User to capture Contact details '<ContactpersonTitle>','<IdentityType>','<IdNumberPassport>','<ContactPersonDOB>','<FirstName>','<LastName>','<MobileNumber>','<JobPosition>','<IsprimaryContact>'
    And User to should be able to capture mandate holder details '<MandateHolderTitle>','<MandateIdentityType>','<MandateIdNumberPassport>','<MandateFirstName>','<MandateLastSurnameName>','<MandateMobileNumber>','<MandateJobTitle>'
    And  User to capture payment details '<PayerJobTitle>','<PCompanyName>','<PRegNumber>','<PTittle>','<PIdentityType>''<PPasportIdNumber>','<PDob>','<PFirstNsame>','<PLastName>','<PMobileNumber>','<PWorkNumber>','<PBankName>','<PBankAccountType>','<PBankAccountNumber>','<PPointofSale>','<PDebitDay>',
    Then User to complete a sale
    Examples:
      |Accesscode|BrokerCode|BrokerPassword|BusinessName|BusinessType|IDPassportNumber|RegistrationNumber|NumberOfEmployees|BusinessDetailsMobileNumber|WorkNumber|AnnualTurnOver         |Address1|Address2 |PhysicalCode| LegalMatters|IsBusinessRegistered | OverdueaccoutOrinvoice|whatIndustry| SpecifyIndustry |ContactpersonTitle|IdentityType|IdNumberPassport|ContactPersonDOB|FirstName|LastName|MobileNumber|JobPosition|IsprimaryContact|MandateHolderTitle|MandateIdentityType|MandateIdNumberPassport|MandateFirstName|MandateLastSurnameName|MandateMobileNumber|MandateJobTitle|PayerJobTitle|PCompanyName|PRegNumber|PTittle|PIdentityType|PPasportIdNumber|PDob|PFirstNsame|PLastName|PMobileNumber|PWorkNumber|PBankName|PBankAccountType|PBankAccountNumber|PPointofSale|PDebitDay|
      |0132      |b1234     |12345         |Assambless of Gods   | Churches   | 8308278697130  | 0125478578       |     14          |0820588687  | 0125847459| Less than 2,000,000 |  po box 29| stotre Store|   5421| 0         |No                   |         No            |Administrative & Support Services| Logistics |Mr|Passport Number|     8908167256862                 |1998-08-18|Mla      |Last    |0832569854|Member       |Yes             |Miss|ID NumberID Number|6908176519682|Lwana|Zone| 0825647221|CEO|CEO|Churches | BG0083 |Mr|ID Number |8908166495313|Zulu|Lwazi|0826598745|0826598745|ABSA BANK|Cheque Account|1234|Yes|25|                                                                                                                                                  |
