Feature: User is going to search for Campus Life page under the home page of NAU
  Scenario: Search for Student Services under the Campus Life section and pop-up menu of this section
    Given User will navigate to the website
    When User searches for Student Services section
    Then The "Student Services" menu and pop-up menu displayed

   @Org
    Scenario: Search for Student Organizations sub-items of  Student Services  under the Campus Life
      Given User will navigate to the website
      When User searches for Student Organizations part
      Then The sub-items of the "Student Organizations" menu will be open

     Scenario: Search for Calender of Events sub-items of Student Services under the Campus life
       Given User will navigate to the website
       When User searches for Calender of Events part
       Then The Calender of Events part will be displayed

       Scenario: Search for Health Services sub-items of Student Services under the Campus life
         Given User will navigate to the website
         When User searches for Health Services part
         Then The Health Services part will be open

         Scenario: Search for Health Services sub-items of Student Services under the Campus life
           Given User will navigate to the website
           When User searches for Dining at NAU part
           Then The Dining at Nau part will be appear

           Scenario: Search for Parking and Transportation sub-items of Student Services under the Campus life
             Given User will navigate to the website
             When User searches for Parking and Transportation part
             Then The Parking Nad Transportation part will be displayed

             Scenario: Search for Emergency Guide sub-items of Student Services under the Campus life
               Given User will navigate to the website
               When User searches for Emergency Guide part
               Then The Emergancy Guide will be open



