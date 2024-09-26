$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("I:/Ashwini_Testing/University_Cucumber/src/main/java/com/qa/features/university.feature");
formatter.feature({
  "line": 1,
  "name": "Univesity Application Test",
  "description": "",
  "id": "univesity-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate University Home Page Test",
  "description": "",
  "id": "univesity-application-test;validate-university-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user is on browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user log into app",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_open_browser()"
});
formatter.result({
  "duration": 29358509900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userIsOnLoginPage()"
});
formatter.result({
  "duration": 231378700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.userLogIntoApp()"
});
formatter.result({
  "duration": 17851292500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validateHomePageTitle()"
});
formatter.result({
  "duration": 52667000,
  "status": "passed"
});
});