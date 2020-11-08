package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target\\default-cucumber-reports3",
                "json:target\\json-reports\\cucumber3.json",
                "junit:target\\xml-report\\cucumber3.xml"},
        //Where is the path of the feature folder
        features = "src\\test\\resources\\features",
        //Path of the step definitions folder
        glue = "stepdefinitions",
        tags = "@smoke",
        //tags="@test1 or @test2",
        dryRun = false
)
public class SmokeTestRunner {
}
