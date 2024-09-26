package applicationHooks;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
    private static String title;
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("^user is already on login page$")
    public void userIsAlreadyOnLoginPage() {
        DriverFactory.getDriver()
                .get("https://wes-srp.my.site.com/?acctid=0016000000WNY93AAH#/");
    }

    @When("^user gets the title of the page$")
    public void title_of_login_page() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Saint Mary's University of Minnesota", title);

    }
    @Then("page title should be {string}")
    public void pageTitleShouldBe(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
       loginPage.enterUsernameAndPassword(username,password);
    }

    @Then("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickOnLogin();
    }


}
