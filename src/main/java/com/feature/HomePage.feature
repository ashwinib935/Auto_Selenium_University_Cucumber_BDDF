Feature: University home feature

  Background:
    Given user has already logged in to application
      |username|password|
      |muwafu@pelagius.net|test123#|

  Scenario: Home page title
    Given user is on Home page
    When user gets the title of the page
    Then page title should be "Saint Mary's University of Minnesota"
    And "My Profile" should be display

  Scenario: Personal Info Page
    Given user is on Home page
    When user gets the title of the page
    Then user click on personal information link
#    And "Personal Information" heading should be display

  Scenario: Education History Page
    Given user is on Home page
    When user gets the title of the page
    Then user click on education history  link
#    And "Education History" heading should be display