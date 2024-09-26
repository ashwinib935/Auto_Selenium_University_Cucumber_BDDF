Feature: University personal info feature

  Background:
    Given user has already logged in to application
      |username|password|
      |muwafu@pelagius.net|test123#|


  Scenario Outline: Fill personal Info
    Given user is on Home page
    When user gets the title of the page
    Then user click on personal information link
    Then user is on Personal Info page
    And personal info page "Personal Information" heading should be display
    Then user enters personal details "<preferedFName>" and "<bDate>" and "<address>" and "<city>"

    Examples:

   | preferedFName|bDate| address| city |
   |preferedTest| 11/23/1999 | addresstest123| Nasktest|