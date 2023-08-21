Feature: Broker Online - Legal Business Plan Capturing Process.

  Scenario Outline: Capture Legal Plan Business
    Given User log on to Legal Business Plan and Capture AccessCode '<AccessCode>' and Capture '<code>', '<Password>' Login Details
    And User click on New Sale Button and Select the Product '<ClienteleLegalBusinessPlan>' and click Continue Button
    And User is on Business Details Page, select Company Type and Capture Business Details '<Business Type>', '<Company Name>', '<Registration Number>', '<Number Of Employees>', '<Mobile Number>', '<Work Number>', '<Annual Turnover>', '<Physical Address Line 1>', '<Physical Address Line 2>', '<Postal Address Code>', '<Postal Address Line 1>', '<Postal Address Line 2>', '<Postal Address Code>' and click Continue Button

    Examples:
      |AccessCode| code | Password |ClienteleLegalBusinessPlan|Business Type|Company Name|Registration Number|Number Of Employees|Mobile Number|Work Number|Annual Turnover|Physical Address Line 1|Physical Address Line 2|Postal Address Code|Postal Address Line 1|Postal Address Line 2|
      |0132| b1234  | 12345 |Clientèle Legal Business Plan|Close Corporation (CC)|Sizwe Kobodo|2013/010108/23|50|0728712953|0127973922|2,000,001 – 10,000,000|Block M|Block A|0152|Block W|Block H|

    @Test2
    Scenario Outline: User is on Underwriting tab
      Given User Select legal Matters '<LegalMatters>', '<LegalEntity>', '<Invoices>', '<Industry>', '<IndustrySpecifics>' and click Continue Button.

      Examples:
        |LegalMatters|LegalEntity|Industry|Invoices|Industry|
        |2|Yes|No|Estate Agent|IndustrySpecifics|