Feature: Testing of Faculty and Staff section on NAU HomePage
  Scenario: Testing of availability of Admissions, Academics, Faculty and Staff, Campus Life and Students sections on NAU website
    Given User navigates to NAU website
    When  NAU dashboard appears
    Then  User should see "Faculty and Staff"

