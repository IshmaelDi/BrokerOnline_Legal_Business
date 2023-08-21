package Runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty"},
        features = "src/resources/features/BrokerOnline_Legal_Business.feature",
        glue = "stepDefinition",
        dryRun = true
)
public class
BrokerOnline_Legal_BusinessRunner {
}
