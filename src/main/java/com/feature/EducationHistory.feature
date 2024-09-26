Feature: University education history feature

  Background:
    Given user has already logged in to application
      |username|password|
      |muwafu@pelagius.net|test123#|


  Scenario: Fill education history
    Given user is on Home page
    When user gets the title of the page
    Then user click on education history  link
    Then user is on Education History page
    And education page "Education History" heading should be display
    Then user enters educational details

      | collegeOrUnivercityName                    | dateBegun  | dateEnd    | majorOrFieldOfStudy |
      | 4 - States Okmulgee Academy of Cosmetology | 11/23/2015 | 11/23/2015 | test1                |