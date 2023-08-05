Feature: Broker Online - Legal Business Capturing UnderWriting Process.
  Scenario: User Captures Relevant UnderWriting Information.
    Given User logs in with Broker Code, Confirms LogIn Credentials
    And User Complete all the required steps and Captues all Business Detail information and Navigate to UnderWriting Page.
    And User Select the relevant number '<one>' in the underwriting dropdown questions.
    And User Select yes or no whether the company is a registered legal entity.
    And User Select yes or no whether the company has overdue account
    And User Select the type of industry the business is in.
    And User Insert the Industry specifics
    Then User click Continue Button to navigate to test