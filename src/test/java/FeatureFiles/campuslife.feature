Feature: User is going to search for Campus Life page under the home page of NAU
  @Services
  Scenario: Search for Student Services under the Campus Life section and pop-up menu of this section
    Given User will navigate to the website
    When User searches for Student Services section
    Then The "Student Services" menu and pop-up menu displayed

   @Organizations
    Scenario: Search for Student Organizations sub-items of  Student Services  under the Campus Life
      Given User will navigate to the website
      When User searches for Student Organizations part
      Then The sub-items of the "Student Organizations" menu will be open
     @Events
     Scenario: Search for Calender of Events sub-items of Student Services under the Campus life
       Given User will navigate to the website
       When User searches for Calender of Events part
       And The " http://qatest2119.na.edu/campus-life/calendar-of-events/" will be displayed
       Then The Calender of Events part will be displayed
       @Health
       Scenario: Search for Health Services sub-items of Student Services under the Campus life
         Given User will navigate to the website
         When User searches for Health Services part
         Then The Health Services part will be open
        @Dining
         Scenario: Search for Dining part sub-items of Student Services under the Campus life
           Given User will navigate to the website
           When User searches for Dining at NAU part
           Then The Dining at Nau part will be appear
         @Parking
           Scenario: Search for Parking and Transportation sub-items of Student Services under the Campus life
             Given User will navigate to the website
             When User searches for Parking and Transportation part
             Then The Parking Nad Transportation part will be displayed
            @Emergency
             Scenario: Search for Emergency Guide sub-items of Student Services under the Campus life
               Given User will navigate to the website
               When User searches for Emergency Guide part
               Then The Emergency Guide will be open
              @Security
               Scenario:  Search for Campus Security sub-items of Student Services under the Campus life
                 Given User will navigate to the website
                 When User searches for Campus Security section
                 Then The Campus Security section will be appear
               @Service
                 Scenario: Search for Service Request sub-items of Student Services under the Campus life
                   Given User will navigate to the website
                   When User searches for Srvice Request menu
                   Then The Service Request menu will be appear
                 @Housing
                   Scenario: Search for Housing sub-items of Student Services under the Campus life
                     Given User will navigate to the website
                     When User searches for Housing part
                     Then The Housing part will be open
                   @Action
                   Scenario: Search for Housing sub-items of Student Services under the Campus life
                     Given User will navigate to the website
                     When User moves the curser between parts
                     Then The action will be done
                     @Loginpage
                     Scenario: Search for student 365portal login page under the main menu
                       Given User will navigate to the website
                       When User will login to the 365 Portal
                       Then The studen will be log in 365 Portal
                      @SwitchTo
                       Scenario: User Switch to between two pages
                         Given User will navigate to the website
                         When User switches from "Campus Life" page to "Calender of Events"
                         Then The switches method will be done








