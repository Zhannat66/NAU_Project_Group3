Feature: User is going to search for academics under the homepage of NAU.

  Scenario: Verify functionality of Academics page
    Given User will navigate to NAU website
    When User will click Academics menu
    Then User will see the Academics page

   Scenario: Verify functionality of Course Schedule menu
     Given User will navigate to NAU page
     When  User will click Course Schedule menu
     Then  User will see current semester Course Schedule page

  Scenario: Verify functionality of Final Schedule menu
    Given User will navigate to NAU page
    When  User will click Final Schedule menu
    Then  User will see current semester Final Schedule page

  Scenario: Verify functionality of Degree Programs menu
    Given User will navigate to NAU page
    When  User will click Degree Programs menu
    Then  User will see current semester Degree Progrmas page

  Scenario: Verify functionality of hover over of Academics
    Given User will navigate to NAU page
    When  User will hover over Academics menu in NAU main page
    Then  User will see drop down of Academics menu


