package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features ="src/test/resources/features/Dafiti.feature",
    glue = "steps"
        )

public class Runner {
}
