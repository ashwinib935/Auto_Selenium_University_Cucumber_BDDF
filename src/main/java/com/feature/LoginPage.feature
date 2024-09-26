Feature: University login feature

Scenario Outline: University login test  scenario
Given user is already on login page
When user gets the title of the page
Then page title should be "Saint Mary's University of Minnesota"
Then user enters "<username>" and "<password>"
Then user click on login button
Then user gets the title of the page
And page title should be "Saint Mary's University of Minnesota"

Examples:
| username            | password |
| muwafu@pelagius.net    | test123# |