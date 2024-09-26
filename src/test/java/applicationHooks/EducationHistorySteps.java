package applicationHooks;

import com.pages.EducationHistoryPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class EducationHistorySteps {
    private EducationHistoryPage educationHistoryPage = new EducationHistoryPage(DriverFactory.getDriver());

    @Then("user is on Education History page")
    public void userIsOnEducationHistoryPage() {
        String title = educationHistoryPage.getEducationHistoryTitle();
        System.out.println("Education History page:"+title);
    }
    @And("education page {string} heading should be display")
    public void educationPageHeadingShouldBeDisplay(String heading) {
        Boolean falg =  educationHistoryPage.checkHeading(heading);
        Assert.assertTrue(falg);
    }

    @Then("user enters educational details")
    public void userEntersEducationalDetails(DataTable educationDetails) {
        List<Map<String,String>> educationList_row = educationDetails.asMaps(String.class,String.class);
        for(Map<String,String>education_column:educationList_row){
            educationHistoryPage.fillEducationDetails(education_column.get("collegeOrUnivercityName"),education_column.get("dateBegun"),education_column.get("dateEnd"),education_column.get("majorOrFieldOfStudy"));
        }

    }


}
