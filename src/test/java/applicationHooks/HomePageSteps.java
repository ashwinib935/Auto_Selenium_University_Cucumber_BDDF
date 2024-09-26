package applicationHooks;

import com.pages.EducationHistoryPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.PersonalInfoPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class HomePageSteps {
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage;
    private PersonalInfoPage personalInfoPage;
    private EducationHistoryPage educationHistoryPage;

    @Given("user has already logged in to application")
    public void userHasAlreadyLoggedInToApplication(DataTable createTable) throws InterruptedException {
        List<Map<String, String>> credList = createTable.asMaps();
        String userName = credList.get(0).get("username");
        String password = credList.get(0).get("password");

        DriverFactory.getDriver()
                .get("https://wes-srp.my.site.com/?acctid=0016000000WNY93AAH#/");
        homePage = loginPage.doLogin(userName.trim(), password.trim());
    }

    @Given("user is on Home page")
    public void userIsOnHomePage() {
         String homeTitle = homePage.getHomeTitle();
        System.out.println("Home Page Title:"+homeTitle);
    }

    @And("{string} should be display")
    public void shouldBeDisplay(String myProfile) throws InterruptedException {
      Boolean flag = homePage.myProfileTagIsDisplayed(myProfile);
        Assert.assertTrue(flag);
    }


    @Then("user click on personal information link")
    public void userClickOnPersonalInformationLink() throws InterruptedException {
        personalInfoPage = homePage.getPersonalInfoPage();
    }



    @Then("user click on education history  link")
    public void userClickOnEducationHistoryLink()throws InterruptedException  {
        educationHistoryPage = homePage.getEducationHistoryPage();
    }
}
