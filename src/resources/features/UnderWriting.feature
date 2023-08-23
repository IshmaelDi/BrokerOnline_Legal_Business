    Feature: Broker Online - UnderWriting Selection
    Scenario Outline: User is on Underwriting tab
      Given User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.

      Examples:
        |LegalMatters|LegalEntity|Invoices|Industry    |IndustrySpecifics|
        |2           |Yes        |No      |Estate Agent|Automations|