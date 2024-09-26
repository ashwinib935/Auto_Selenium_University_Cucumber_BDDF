package applicationHooks;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.PersonalInfoPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class PersonalInfoSteps {
    private PersonalInfoPage personalInfoPage = new PersonalInfoPage(DriverFactory.getDriver());


    @Then("user is on Personal Info page")
    public void userIsOnPersonalInfoPage() {
        String title = personalInfoPage.getPersonalInfoTitle();
        System.out.println("Personal info page:"+title);
    }
    @And("personal info page {string} heading should be display")
    public void personalInfoPageHeadingShouldBeDisplay(String heading) {
        Boolean falg =  personalInfoPage.checkHeading(heading);
        Assert.assertTrue(falg);
    }

    @Then("user enters personal details {string} and {string} and {string} and {string}")
    public void userEntersPersonalDetailsAndAndAnd(String preferedFName, String bDate, String address, String city) {
        personalInfoPage.fillPersonalDetails(preferedFName,bDate,address,city);
    }



}
