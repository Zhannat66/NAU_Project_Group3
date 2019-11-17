Feature: Testing of Faculty and Staff section on NAU HomePage

  Scenario: Testing of availability of Faculty and Staff section on NAU website
    Given User navigates to NAU website
    When  NAU dashboard appears
    Then  User should see "Faculty & Staff"


  Scenario: When user navigates to NAU website and hover over Faculty and Staff navigation link should collapse
    Given User navigates to NAU website
    When User hover over Faculty and Staff drop down
    Then Verify that Faculty and Staff section has <Employee Center> sub-section


  @last
  Scenario Outline: Test for availability of required 4 sub-sections
      Given   User navigates to NAU website
      When    User hover over Faculty and Staff drop down
      Then    User should see sections as following "<Sections>"
      Examples:
        |Sections|
        |Office 365|
        |Fees and Deposits|
        |Password Reset|
        |IT Services|
        |Employee Center|
        |News and Events|
        |Picture|