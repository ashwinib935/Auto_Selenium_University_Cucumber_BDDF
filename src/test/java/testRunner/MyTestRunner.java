package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"I:\\Ashwini_Testing\\University_Cucumber\\src\\main\\java\\com\\feature\\EducationHistory.feature"},
        glue = {"stepdefinitions", "applicationHooks"},
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        },
        dryRun = false

)
public class MyTestRunner {
}
