Feature: Testing of Faculty and Staff section on NAU HomePage


  Scenario: Testing of availability of Faculty and Staff section on NAU website
    Given User navigates to NAU website
    When  NAU dashboard appears
    Then  User should see "Faculty & Staff"

  Scenario: When user navigates to NAU website and hover over Faculty and Staff navigation link should collapse
    Given User navigates to NAU website
    When User hover over Faculty and Staff drop down
    Then Verify that Faculty and Staff section has <Employee Center> sub-section


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


  Scenario: Navigate to Faculty and Staff Page
      Given User navigates to NAU website
      When  User hover over Faculty and Staff drop down
      And   User click on Faculty and Staff
      Then  User should be navigated to Faculty and Staff Page

  Scenario: Navigate to Office 365 Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on "Office 365" section
    Then  User should be navigated to new window "Sign in to your account"


  Scenario: Navigate to Fees and Deposits Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Fees and Deposits section
    Then  User should be navigated to "https://pay.na.edu/fees/"


  Scenario: Navigate to Password Reset Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Password Reset section
    Then  Verify user navigated to new Password Reset window


  Scenario: Navigate to IT Services Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on IT Services section
    Then  Verify user navigated to IT Services page "https://www.na.edu/faculty-staff/it-center/"


  @last
  Scenario Outline: Test for availability of required sub-sections under Employee Center
    Given   User navigates to NAU website
    When    User hover over Faculty and Staff drop down
    Then    User should see "Employee Center" section
    And     Verify that under Employee Center following "<Sub-Sections>" are displayed
    Examples:
      |Sub-Sections|
      |Human Resources|
      |Employee Forms|
      |Faculty Members|
      |Employee Handbook|


  Scenario: Navigate to Human Resources Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Human Resources sub-section
    Then  Verify user navigates to Human Resources page "http://qatest2119.na.edu/faculty-staff/human-resources/"


  Scenario: Navigate to Employee Forms Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Employee Forms sub-section
    Then  Verify user navigates to Employee Forms page


  Scenario: Navigate to Faculty Members Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Faculty Members sub-section
    Then  Verify user navigates to page Faculty Members


  Scenario: Navigate to Employee Handbook Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Employee Handbook sub-section
    Then  Verify user navigates to page Employee Handbook



  Scenario: Verify the availability of required sub-sections under News and Events
    Given   User navigates to NAU website
    When    User hover over Faculty and Staff drop down
    Then    Verify that News and Events section is available
    And     Verify that under News and Events required sub-sections are displayed


  Scenario: Verify if user will be Navigated to Headlines Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Headlines sub-section
    Then  Verify user navigates to Headlines page



  Scenario: Verify if user will be Navigated to Announcements Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Announcements sub-section
    Then  User should be navigated to Announcements page


  Scenario: Verify if user will be Navigated to Calendar of Events Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Calendar of Events sub-section
    Then  User should be navigated to Calendar of Events page


  Scenario: Verify if user will be Navigated to Student Workers Page
    Given User navigates to NAU website
    When  User hover over Faculty and Staff drop down
    And   User click on Student Workers sub-section
    Then  User should be navigated to Student Workers page
