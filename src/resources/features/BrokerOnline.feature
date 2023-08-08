Feature: Broker Online - Legal Business Plan Capturing Process.

  Scenario Outline: Access Broker Online
    Given User open Broker Online web browser, capture access code  and clicks confirm button.
    When User captures Broker Code '<code>' and Password '<Password>'
    And User should be able to click login button and navigate to Online Capture
    And User click on New Sale Button
#    And User should be able to select Product from the drop list '<ClientèleLegalBusinessPlan>' and click on Continue Button to navigate to Business Details.
#    And User enters Company Name '<Mokoni>'
#    And User select Business type '<CloseCorporation(CC)>'
#    And User captures Registration Number '<2013/010108/23>'
#    And User capture Number Of Employees '<20>'
#    And User enter Mobile Number '<0728712953>'
#    And User enter Work Number '<0128584100>'
##    And User enter Annual Turnover '<Less than 2,000,000>'
#    And User enter PAL1 '<982 Block M>'
#    And User enter PAL2 '<992 Block M>'
#    And User enter PostaAL1 '<Soshanguve>'
#    And User enter PostalAL2 '<Soshanguve2>'
#    And User enter PostalAC '<0152>'
    Examples:
      | code | Password |
      | 0132  | b1234 |