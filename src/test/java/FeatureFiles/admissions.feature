
Feature:User is going to visit Website home page and search each drop-down menu elements.
    @1
  Scenario: User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then  Users see the sections and their options
    And  Users see the respective image that is placed on left side
     @2
   Scenario:  User searches the Admission drop-down menu Under the Logo
     Given Users navigate the web page
     When  Users hover over the Admission drop-down menu
     Then Users clicks the Undergraduate Section
     And Users see the next page
     @3
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users clicks the Graduate Section
    And Users see the other page
   @4
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Gulf Language School Section
    And Users see the next Elements
    @5
  Scenario Outline:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    And Users see Elements of the "<Undergraduate>" section
    Examples:
    |Undergraduate|
    |Apply       |
    |Degree Programs|
    |Tuition and Fees|
    |Scholarships    |
    |international   |


    @6
  Scenario Outline:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    And Users see  "<Graduate>"elements
    Examples:
      |Graduate|
      |Apply  Now     |
      |Graduate Degrees|
      |Tuition and Fees    |
      |Distance Education  |
      |international   |
     @7
     Scenario Outline: User searches the Admission drop-down menu Under the Logo
      Given Users navigate the web page
       When  Users hover over the Admission drop-down menu
        And Users see the "<Gulf Language School>"elements
       Examples:
      |Gulf Language School|
      |Apply  Now     |
      |GLS Admissions|
      |GLS Programs  |
      |GLS Students  |
      |GLS Faculty   |

    @8
     Scenario:  User searches the Admission drop-down menu Under the Logo
       Given Users navigate the web page
       When  Users hover over the Admission drop-down menu
       Then Users click the Apply link under the undergraduate
       And Users see the next page with


       @9
         Scenario:  User searches the Admission drop-down menu Under the Logo
          Given Users navigate the web page
           When  Users hover over the Admission drop-down menu
          Then Users click the Degree Programs link under the undergraduate
            And User will see the next page with message



         @10
         Scenario:  User searches the Admission drop-down menu Under the Logo
           Given Users navigate the web page
           When  Users hover over the Admission drop-down menu
           Then Users click the Tuition and Fees  link under the undergraduate
           And Users see the next page with message


           @11
           Scenario:  User searches the Admission drop-down menu Under the Logo
             Given Users navigate the web page
             When  Users hover over the Admission drop-down menu
             Then Users click the Scholarship  link under the undergraduate
             And User will  see the next page with messages


             @12
             Scenario:  User searches the Admission drop-down menu Under the Logo
               Given Users navigate the web page
               When  Users hover over the Admission drop-down menu
               Then Users click the International link under the undergraduate
               And User will  see the next page  messages


               @13
               Scenario:  User searches the Admission drop-down menu Under the Logo
                 Given Users navigate the web page
                 When  Users hover over the Admission drop-down menu
                 Then Users click the Apply Now under the Graduate
                 And User will  see the message: Non-Degree Seeking


                 @14
                 Scenario:  User searches the Admission drop-down menu Under the Logo
                   Given Users navigate the web page
                   When  Users hover over the Admission drop-down menu
                   Then Users click the Graduate Degrees under the Graduate
                   And User will  see the message: Master of Education in School Counseling

  @15
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Tuition and Fee under the Graduate
    And User will  see the message: Affordable Education


    @16
    Scenario:  User searches the Admission drop-down menu Under the Logo
      Given Users navigate the web page
      When  Users hover over the Admission drop-down menu
      Then Users click the Distance Education under the Graduate
      And User will  see the message: Distance Education

      @17
      Scenario:  User searches the Admission drop-down menu Under the Logo
        Given Users navigate the web page
        When  Users hover over the Admission drop-down menu
        Then Users click the Graduate International under the Graduate
        And User will  see the message: 54 Countries. 1 University






















