package Runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/resources/features/underWriting.feature",
        glue = "stepsDefinition",
        dryRun = true )
public class underWritingRunner {
}