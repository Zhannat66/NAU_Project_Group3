
Feature:User is going to visit Website home page and search each drop-down menu elements.
    @1
  Scenario Outline: User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then  Users see the sections and  "<Options>"
    And  Users see the respective image that is placed on left side
    Examples:
    |Options|
    |Undergraduate|
    |Graduate|
    |Gulf Language School|
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


   @5-A
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Tuition and Fees  link under the undergraduate
    And Users see the next page with message


  @5-B
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Tuition and Fee under the Graduate
    And User will  see the message: Affordable Education


  @6-A
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the International link under the undergraduate
    And User will  see the next page  messages


  @6-B
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Graduate International under the Graduate
    And User will  see the message: 54 Countries. 1 University

   @7UnderGraduate
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
      |International   |


  @8Graduate
  Scenario Outline:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    And Users see  "<Graduate>"elements
    Examples:
      |Graduate|
      |Apply Now     |
      |Graduate Degrees|
      |Tuition and Fees    |
      |Distance Education  |
      |International   |





  @10
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Distance Education under the Graduate
    And User will  see the message: Distance Education

  @11
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Graduate Degrees under the Graduate
    And User will  see the message: Master of Education in School Counseling


  @12-gulfApply
  Scenario:  User searches the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
    Then Users click the Apply Now  under the Gulf Language School
    And User will  see the message: Welcome to North American University



  @13-GulfLanguageSchool
  Scenario:  Users search the Admission drop-down menu Under the Logo
    Given Users navigate the web page
    When  Users hover over the Admission drop-down menu
   Then Users click the GLS Admissions
    And Users see the new option "LEARN ENGLISH As a second language"


  @14
     Scenario:  User searches the Admission drop-down menu Under the Logo
       Given Users navigate the web page
       When  Users hover over the Admission drop-down menu
       Then Users click the Apply link under the undergraduate
       And Users see the next page with


       @15
         Scenario:  User searches the Admission drop-down menu Under the Logo
          Given Users navigate the web page
           When  Users hover over the Admission drop-down menu
          Then Users click the Degree Programs link under the undergraduate
            And User will see the next page with message


        @16
           Scenario:  User searches the Admission drop-down menu Under the Logo
             Given Users navigate the web page
             When  Users hover over the Admission drop-down menu
             Then Users click the Scholarship  link under the undergraduate
             And User will  see the next page with messages

              @17
               Scenario:  User searches the Admission drop-down menu Under the Logo
                 Given Users navigate the web page
                 When  Users hover over the Admission drop-down menu
                 Then Users click the Apply Now under the Graduate
                 And User will  see the message: Non-Degree Seeking

                    @19
                    Scenario:  User searches the Admission drop-down menu Under the Logo
                   Given Users navigate the web page
                   When  Users hover over the Admission drop-down menu
                  Then Users click the GLS Admission under the Gulf Language School
                   And User will  see the message: LEARN ENGLISH As a second language



























